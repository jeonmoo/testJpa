package com.example.studyJpa2.notice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter private Long noticeId;
    @Setter private String noticeTitle;
    @Setter private String noticeType;
    @Setter private String noticeContents;
    @Setter private String noticeAttachedFile;
    @Setter private Boolean isShow;
    @Setter private Boolean isPopup;

    @Setter private LocalDateTime createdAt;
    @Setter private String createdBy;
    @Setter private LocalDateTime modifiedAt;
    @Setter private String modifiedBy;

}
