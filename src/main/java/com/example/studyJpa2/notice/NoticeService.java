package com.example.studyJpa2.notice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    private final NoticeRepositorySupport noticeRepositoryImpl;

    public List<Notice> findAll() {
        return noticeRepository.findAll();
    }

    public Optional<Notice> findNoticeById(Long id) {
        return noticeRepository.findById(id);
    }

    public Notice findNotice(Long id) {
        return noticeRepositoryImpl.findNotice(id);
    }


}
