/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package io.renren.modules.job.task;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.modules.phpems.entity.ExamHistoryEntity;
import io.renren.modules.phpems.mapper.ExamHistoryMapper;
import io.renren.modules.sys.entity.SysMenuEntity;
import io.renren.modules.sys.service.SysMenuService;
import org.apache.ibatis.annotations.Select;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试定时任务(演示Demo，可删除)
 *
 * testTask为spring bean的名称
 *
 * @author Mark sunlightcs@gmail.com
 */
@Component("testTask")
public class TestTask implements ITask {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ExamHistoryMapper examHistoryMapper;
    int totalScore = 0, fini_count = 0, previousEhid = 54;
    double average_score = 0, mid_ratio = 0, high_ratio = 0, diffcult_coef = 0;
    Map regionMap = new HashMap<Integer, Integer>();

    @Override
    public void run(String params) throws IOException {
        ExamHistoryEntity examHistoryEntity = examHistoryMapper.selectOne(new QueryWrapper<>());
        BufferedReader rankBufferedReader = new BufferedReader(new FileReader("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/ranking-list.json"));
        BufferedReader countBufferedReader = new BufferedReader(new FileReader("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/count-data.json"));
        BufferedReader regionBufferedReader = new BufferedReader(new FileReader("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/region-count.json"));
        BufferedReader monthBufferedReader = new BufferedReader(new FileReader("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/month-count.json"));
        BufferedReader csrcBufferedReader = new BufferedReader(new FileReader("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/csrc-industry.json"));
        char[] rankCharArray = new char[1024];
        char[] countCharArray = new char[1024];
        char[] regionCharArray = new char[1024];
        char[] monthCharArray = new char[1024];
        char[] csrcCharArray = new char[1024];
        rankBufferedReader.read(rankCharArray, 0, 1024);
        String rankString = String.valueOf(rankCharArray);
        JSONArray rankJsonArray = new JSONArray(rankString);
        countBufferedReader.read(countCharArray, 0, 1024);
        String countString = String.valueOf(countCharArray);
        JSONObject countJsonObject = new JSONObject(countString);
        regionBufferedReader.read(regionCharArray, 0, 1024);
        String regionString = String.valueOf(regionCharArray);
        JSONArray regionJsonArray = new JSONArray(regionString);
        monthBufferedReader.read(monthCharArray, 0, 1024);
        String monthString = String.valueOf(monthCharArray);
        JSONArray monthJsonArray = new JSONArray(monthString);
        csrcBufferedReader.read(csrcCharArray, 0, 1024);
        String csrcString = String.valueOf(csrcCharArray);
        JSONArray csrcJsonArray = new JSONArray(csrcString);
        if (examHistoryEntity.getEhid() > previousEhid) {
            //若不相同则添加一个ranklist文件的json对象
            JSONObject newRank = new JSONObject();
            newRank.put("stuname", examHistoryEntity.getEhusername());
            newRank.put("points", examHistoryEntity.getEhscore());
            rankJsonArray.put(newRank);
            totalScore += examHistoryEntity.getEhscore();
            fini_count += 1;
            average_score = totalScore * 1.0 / fini_count;
            if (examHistoryEntity.getEhscore() > 60) {
                mid_ratio += 0.1;
                if (examHistoryEntity.getEhscore() > 90) {
                    high_ratio += 0.1;
                }
            }
            if (examHistoryEntity.getEhscore() > 50 && examHistoryEntity.getEhscore() < 55)
                regionMap.put(0, examHistoryEntity.getEhscore());
            previousEhid = examHistoryEntity.getEhid();
        }
        diffcult_coef = 1 - average_score / 100;
        countJsonObject.put("fini_count", fini_count);
        countJsonObject.put("average_score", average_score);
        countJsonObject.put("mid_ratio", mid_ratio);
        countJsonObject.put("high_ratio", high_ratio);
        countJsonObject.put("diffcult_coef", diffcult_coef);
        BufferedWriter rankBufferedWriter = new BufferedWriter(new FileWriter("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/ranking-list.json"));
        rankBufferedWriter.write(rankJsonArray.toString());
        rankBufferedWriter.close();
        BufferedWriter countBufferedWriter = new BufferedWriter(new FileWriter("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/count-data.json"));
        countBufferedWriter.write(countJsonObject.toString());
        countBufferedWriter.close();
        BufferedWriter regionBufferedWriter = new BufferedWriter(new FileWriter("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/region-count.json"));
        regionBufferedWriter.write(regionJsonArray.toString());
        regionBufferedWriter.close();
        BufferedWriter monthBufferedWriter = new BufferedWriter(new FileWriter("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/month-count.json"));
        monthBufferedWriter.write(monthJsonArray.toString());
        monthBufferedWriter.close();
        BufferedWriter csrcBufferedWriter = new BufferedWriter(new FileWriter("C:/Users/banner/Documents/WeChat Files/wxid_ewv05m3nd92v12/FileStorage/File/2020-10/www/dviz/data/csrc-industry.json"));
        csrcBufferedWriter.write(csrcJsonArray.toString());
        csrcBufferedWriter.close();
        logger.debug("------------TestTask定时任务正在执行，参数为：{}-------------", params);
    }
}
