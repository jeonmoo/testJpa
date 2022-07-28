package com.example.studyJpa2.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member ,Long> {
    @Query("SELECT m FROM Member m WHERE m.id = :id")
    Member findById2(@Param("id") Long id);
}
