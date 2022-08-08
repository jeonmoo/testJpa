package com.example.studyJpa2.notice;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NoticeRepositorySupport {

    private final JPAQueryFactory jpaQueryFactory;

//    public NoticeRepositorySupport(JPAQueryFactory jpaQueryFactory) {
//        this.jpaQueryFactory = jpaQueryFactory;
//    }

    public Notice findNotice(Long id) {
        QNotice notice = QNotice.notice;
        return jpaQueryFactory.selectFrom(notice)
                .where(notice.noticeId.eq(id))
                .fetchOne();
    }

}
