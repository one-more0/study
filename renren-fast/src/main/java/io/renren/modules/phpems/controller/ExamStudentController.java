//package info.rayee.modules.student.controller;
//
//import com.alibaba.fastjson.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/examStudent")
//public class ExamStudentController {
//    @Autowired
//    info.rayee.modules.student.mapper.Quest2KnowsMapper examMapper;
//    @GetMapping("/display")
//    public List<info.rayee.modules.student.entity.Quest2KnowsEntity> display(){
//        System.out.println("grhnruitititititititititiroooooooooooooooooooooooo");
//        List<info.rayee.modules.student.entity.Quest2KnowsEntity> examEntities=examMapper.selectList(null);
//        return examEntities;
//    }
//    @RequestMapping(value = "/queryById",method = RequestMethod.POST)
////    @ResponseBody
//    public info.rayee.modules.student.entity.Quest2KnowsEntity queryById(@RequestBody JSONObject id){
//        System.out.println(id);
//        info.rayee.modules.student.entity.Quest2KnowsEntity examEntity=examMapper.selectById(id.getInteger("id"));
//        return examEntity;
//    }
//    @PostMapping("/add")
//    public void  add(@RequestBody info.rayee.modules.student.entity.Quest2KnowsEntity examEntity){
//        examMapper.insert(examEntity);
//    }
//    @PostMapping("/delById")
//    public void delById(@RequestBody JSONObject id){
//        System.out.println(id);
//        examMapper.deleteById(id.getInteger("id"));
//    }
//    @PostMapping("/update")
//    public void update(@RequestBody info.rayee.modules.student.entity.Quest2KnowsEntity examEntity){
//        examMapper.updateById(examEntity);
//    }
//}
