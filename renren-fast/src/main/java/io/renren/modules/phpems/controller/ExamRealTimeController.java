//package io.renren.modules.phpems.controller;
//
//import com.alibaba.fastjson.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/examRealTime")
//public class ExamRealTimeController {
//    @Autowired
//    info.rayee.modules.student.mapper.ExamHistoryMapper examHistoryMapper;
//    @RequestMapping("/display")
//    public List<info.rayee.modules.student.entity.ExamHistoryEntity> display(){
//        System.out.println("grhnruitititititititititiroooooooooooooooooooooooo");
//        List<info.rayee.modules.student.entity.ExamHistoryEntity> examRealTimeEntities= examHistoryMapper.selectList(null);
//        return examRealTimeEntities;
//    }
//    @RequestMapping(value = "/queryById",method = RequestMethod.POST)
////    @ResponseBody
//    public info.rayee.modules.student.entity.ExamHistoryEntity queryById(@RequestBody JSONObject id){
//        System.out.println(id);
//        info.rayee.modules.student.entity.ExamHistoryEntity examHistoryEntity = examHistoryMapper.selectById(id.getInteger("id"));
//        return examHistoryEntity;
//    }
//    @PostMapping("/add")
//    public void  add(@RequestBody info.rayee.modules.student.entity.ExamHistoryEntity examHistoryEntity){
//        examHistoryMapper.insert(examHistoryEntity);
//    }
//    @PostMapping("/delById")
//    public void delById(@RequestBody JSONObject id){
//        System.out.println(id);
//        examHistoryMapper.deleteById(id.getInteger("id"));
//    }
//    @PostMapping("/update")
//    public void update(@RequestBody info.rayee.modules.student.entity.ExamHistoryEntity examHistoryEntity){
//        examHistoryMapper.updateById(examHistoryEntity);
//    }
//}
