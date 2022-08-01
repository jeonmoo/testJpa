package com.example.studyJpa2.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @GetMapping("/noticeAll")
    public Map<String, Object> getNoticeAll() {
        Map<String, Object> mp = new HashMap<>();
        mp.put("allNotice", noticeService.getNoticeAll());
        return mp;
    }

    @GetMapping("/notice")
    public Map<String, Object> getNoticeByTitle() {

    }

}
