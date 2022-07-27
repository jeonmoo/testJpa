package com.example.studyJpa2.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/connection")
    public Map<String, Object> connectionTest() {

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("cdoe", "1");
        return returnMap;

    }

}
