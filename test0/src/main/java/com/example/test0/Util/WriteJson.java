//package com.example.test0.Util;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.JSONArray;
//import java.io.*;
//import java.sql.*;
//import java.util.Collections;
//
//public class WriteJson {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, JSONException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//     Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.12:3306/efo?serverTimezone=UTC","info","info");
//        Statement statement=conn.createStatement();
//        String sql="select count(*),suffix,sum(size) from file group by suffix";
//        ResultSet resultSet=statement.executeQuery(sql);
//        BufferedReader csrcBufferedReader = new BufferedReader(new FileReader("data/csrc-industry.json"));
//        char[] csrcCharArray = new char[1024];
//        csrcBufferedReader.read(csrcCharArray, 0, 1024);
//        String csrcString = String.valueOf(csrcCharArray);
//        JSONArray csrcJsonArray = new JSONArray(csrcString);
//        System.out.println(csrcJsonArray);
//        int csrcCount = csrcJsonArray.length(),count=0;
//        while (resultSet.next()){
//            if (count>=csrcCount){
//                csrcJsonArray.put(new JSONObject());
//            }
//        JSONObject jsonObject = csrcJsonArray.getJSONObject(count++);
//        jsonObject.put("stock",resultSet.getInt(1));
//        jsonObject.put("alias",resultSet.getString("suffix"));
//        jsonObject.put("totalSize",Math.round(resultSet.getInt(3)/(1024*1024*1.0)*100)/100.0);
//        }
//        String path="../../../../../../Program Files\\Tomcat\\apache-tomcat-9.0.27\\webapps\\dviz\\data\\csrc-industry.json".replaceAll("\\\\","/");
//        BufferedWriter csrcBufferedWriter = new BufferedWriter(new FileWriter(path));
//        csrcBufferedWriter.write(csrcJsonArray.toString());
//        csrcBufferedWriter.close();
//        resultSet.close();
//        statement.close();
//        conn.close();
//
////        System.out.println(path);
//        File file=new File(path);
//        System.out.println(file.exists());
//        System.out.println(file.getAbsolutePath());
//    }
//}
