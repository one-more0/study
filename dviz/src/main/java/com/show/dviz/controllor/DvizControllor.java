package com.show.dviz.controllor;

import com.show.dviz.utils.AutoWriteJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DvizControllor {
    @Autowired
    AutoWriteJsonUtil autoWriteJsonUtil;
    @RequestMapping("/")
    public void writeDvizJson() throws Exception {
        System.out.println("----------开始循环定时写入json------------");
       autoWriteJsonUtil.run();
    }
}
