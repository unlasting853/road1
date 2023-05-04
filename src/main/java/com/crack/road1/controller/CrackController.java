package com.crack.road1.controller;

import com.crack.road1.classz.CrackReport;
import com.crack.road1.service.CrackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class CrackController {
    @Autowired
    CrackService crackService;
    @PostMapping("/app/upload_crack")
    public Map<String,Object> crackUpload(@RequestBody CrackReport crackReport){
        Map<String,Object> resultMap = new HashMap<>();
        crackService.CRACK_REPORT_LIST(crackReport);



        resultMap.put("code", 0);//0为失败，1为成功
        resultMap.put("msg","接口调用成功");//信息
        resultMap.put("data", "sadffasdf");
        return resultMap;
    }
}
