package com.show.dviz.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Component
public class AutoWriteJsonUtil  {
    public void run( ) throws Exception {
        try {
            while (true) {
            //解析文件部分
            String date=new Date().toLocaleString().split(" ")[0].replaceAll("-","");
            String jsonPath="C:/csvs/apache-tomcat-9.0.27/webapps/dviz/data/";
            FileReader rankFileReader=new FileReader(jsonPath+"ranking-list.json");
            FileReader countFileReader=new FileReader(jsonPath+"count-data.json");
            FileReader machineFileReader=new FileReader(jsonPath+"rank-machine-list.json");
            FileReader monthFileReader=new FileReader(jsonPath+"month-count.json");
            FileReader csrcFileReader=new FileReader(jsonPath+"csrc-industry.json");
            JsonParser parser=new JsonParser();
            JsonArray rankJsonArray=(JsonArray) parser.parse(rankFileReader);
            JsonObject countJsonObject=(JsonObject) parser.parse(countFileReader);
            JsonArray machineJsonArray=(JsonArray) parser.parse(machineFileReader);
            JsonArray monthJsonArray=(JsonArray) parser.parse(monthFileReader);
            JsonArray csrcJsonArray=new JsonArray();System.out.println(monthJsonArray);
            // 获取并修改数据
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            Statement statement = null;
            ResultSet resultSet = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/efo?serverTimezone=UTC", "root", "1234");
            statement = conn.createStatement();
            String sql = "select count(*),suffix,sum(size) from file group by suffix";
            resultSet = statement.executeQuery(sql);
            int csrcCount=0;
            while (resultSet.next()) {
//                if (csrcCount>=csrcJsonArray.size()){
                    JsonObject newJsonObject=new JsonObject();
                    newJsonObject.addProperty("stock", resultSet.getInt(1));
                    newJsonObject.addProperty("alias", resultSet.getString("suffix"));
                    newJsonObject.addProperty("totalSize", Math.round(resultSet.getInt(3) / (1024 * 1024 * 1.0) * 100) / 100.0);
                    csrcJsonArray.add(newJsonObject);
//                    continue;
//                }
//                JsonObject temp=(JsonObject)csrcJsonArray.get(csrcCount++);
//                temp.addProperty("stock", resultSet.getInt(1));
//                temp.addProperty("alias", resultSet.getString("suffix"));
//                temp.addProperty("totalSize", Math.round(resultSet.getInt(3) / (1024 * 1024 * 1.0) * 100) / 100.0);
            }
            resultSet.close();
            statement.close();
            conn.close();
            File initialFile=new File(("../../../../../../csvs\\data").replaceAll("\\\\","/"));
            File[] initialFiles=initialFile.listFiles();
            int[] months=new int[12];int running=0;
            for(File superFile:initialFiles){
                File[] subFiles=superFile.listFiles();
                JsonObject temp=(JsonObject) machineJsonArray.get(Integer.valueOf(superFile.getName())-1);
                temp.addProperty("name",superFile.getName());temp.addProperty("value",subFiles.length);
                for (File subFile:subFiles) {
                    String subFileSimpleName=subFile.getName().substring(0,subFile.getName().lastIndexOf(".csv"));
                    int tempMonth=Integer.valueOf(subFileSimpleName.substring(4,6));
                    JsonObject tempMonthJsonObject=(JsonObject)monthJsonArray.get(tempMonth-1);
                    tempMonthJsonObject.addProperty("kbratio",months[tempMonth-1]++);
                    if (date.contains(subFileSimpleName)){
                        running++;
                    }

                }
            }
            countJsonObject.addProperty("running",running);

            File file=new File(("../../../../../../csvs/data/01/"+date+".csv").replaceAll("\\\\","/"));
            InputStream dataInputStream=new DataInputStream(new FileInputStream(file));
            byte[] bytes=new byte[1024*1024];
            dataInputStream.read(bytes);
            String content=(bytes[0]==-17&&bytes[1]==-69&&bytes[2]==-65)?new String(bytes):new String(bytes,"GBK");
            String[] strings=content.split("\n");
            JsonObject jsonObject=new JsonObject();
            for (int j=0;j<strings.length;j++){
                String[]s=strings[j].split(",");
                if (s.length<2){continue;}
                jsonObject.addProperty(s[0].substring(s[0].indexOf('.')+1),s[1].replace("\r",""));
            }
            JsonArray jsonArray=new JsonArray();
            for(String key:jsonObject.keySet()){
                JsonObject jsonObject1=new JsonObject();
                jsonObject1.addProperty("stuname",key);
                jsonObject1.addProperty("points",jsonObject.get(key).getAsDouble());
                jsonArray.add(jsonObject1);
            }
            rankJsonArray=jsonArray;
            List l=new ArrayList<>();
            for (Object jsonObject2:rankJsonArray){
                JsonObject jsonObject1=(JsonObject)jsonObject2;
                l.add(jsonObject1);
            }
            l.sort(new Comparator<JsonObject>() {
                @Override
                public int compare(JsonObject o1, JsonObject o2) {
                    return o2.get("points").getAsBigDecimal().compareTo(o1.get("points").getAsBigDecimal());
                }
            });
            JsonArray newRankJsonArray=new JsonArray();
            for(int i=0;i<50&&i<l.size();i++){
                JsonObject jsonObject1=(JsonObject) l.get(i);
                newRankJsonArray.add(jsonObject1);
            }
//            for (Object jsonObject3:l){
//                JsonObject jsonObject1=(JsonObject)jsonObject3;
//                newRankJsonArray.add(jsonObject1);
//            }
            //写入展板数据到文件
            String csrcPath = jsonPath+"csrc-industry.json";
            BufferedWriter csrcBufferedWriter = new BufferedWriter(new FileWriter(csrcPath));
            csrcBufferedWriter.write(csrcJsonArray.toString());
            csrcBufferedWriter.close();
            String rankPath = jsonPath+"ranking-list.json";
            BufferedWriter rankBufferedWriter = new BufferedWriter(new FileWriter(rankPath));
            rankBufferedWriter.write(newRankJsonArray.toString());
            rankBufferedWriter.close();
            String monthPath = jsonPath+"month-count.json";
            BufferedWriter monthBufferedWriter = new BufferedWriter(new FileWriter(monthPath));
            monthBufferedWriter.write(monthJsonArray.toString());
            monthBufferedWriter.close();
            String machinePath = jsonPath+"rank-machine-list.json";
            BufferedWriter machineBufferedWriter = new BufferedWriter(new FileWriter(machinePath));
            machineBufferedWriter.write(machineJsonArray.toString());
            machineBufferedWriter.close();
            String countPath = jsonPath+"count-data.json";
            BufferedWriter countBufferedWriter = new BufferedWriter(new FileWriter(countPath));
            countBufferedWriter.write(countJsonObject.toString());
            countBufferedWriter.close();
                Thread.currentThread().sleep(300000);
            }
        } catch (Exception e) {e.printStackTrace();
        }
    }
}
