package com.example.studyJpa2.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    @Autowired
    NoticeRepository noticeRepository;

    public List<Notice> getNoticeAll() {
        return noticeRepository.findAll();
    }


}
