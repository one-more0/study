//package info.rayee.modules.student.controller;
//
//import com.alibaba.fastjson.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/scoreAnalysis")
//public class ScoreAnalysisController {
//    @Autowired
//    info.rayee.modules.student.mapper.KnowsMapper knowsMapper;
//    @RequestMapping("/display")
//    public List<info.rayee.modules.student.entity.KnowsEntity> display(){
//        System.out.println("grhnruitititititititititiroooooooooooooooooooooooo");
//        List<info.rayee.modules.student.entity.KnowsEntity> knowsEntity = knowsMapper.selectList(null);
//        return knowsEntity;
//    }
//    @RequestMapping(value = "/queryById",method = RequestMethod.POST)
////    @ResponseBody
//    public info.rayee.modules.student.entity.KnowsEntity queryById(@RequestBody JSONObject id){
//        System.out.println(id);
//        info.rayee.modules.student.entity.KnowsEntity knowsEntity = knowsMapper.selectById(id.getInteger("id"));
//        return knowsEntity;
//    }
//    @PostMapping("/add")
//    public void  add(@RequestBody info.rayee.modules.student.entity.KnowsEntity knowsEntity){
//        knowsMapper.insert(knowsEntity);
//    }
//    @PostMapping("/delById")
//    public void delById(@RequestBody JSONObject id){
//        System.out.println(id);
//        knowsMapper.deleteById(id.getInteger("id"));
//    }
//    @PostMapping("/update")
//    public void update(@RequestBody info.rayee.modules.student.entity.KnowsEntity knowsEntity){
//        knowsMapper.updateById(knowsEntity);
//    }
//}
