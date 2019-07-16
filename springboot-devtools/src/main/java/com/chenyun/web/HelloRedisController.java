package com.chenyun.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class HelloRedisController {

    @RequestMapping("/test")
    public Map<String,Object> helloRedis(){

        Map<String,Object> map = new HashMap<>();
        map.put("success",true);
        map.put("asadfa","aad");
        map.put("asadfa","aad");
        map.put("asadsdffa","aasdfd");
        map.put("test","chen ");
        map.put("success",true);
        map.put("asadfa","aad");
        map.put("asadfa","aad");
        map.put("asadfa","aad");

        return map;

    }

    @RequestMapping("/tests")
    public Map<String,Object> helloRediss(){

        Map<String,Object> map = new HashMap<>();
        map.put("success",true);
        map.put("asadfa","aad");
        map.put("asadfa","aad");
        map.put("asadsdffa","aasdfd");
        map.put("test","chen ");
        map.put("success",true);
        map.put("asadfa","aad");
        map.put("asadfa","aad");
        map.put("asadfa","aad");

        return map;

    }

}
