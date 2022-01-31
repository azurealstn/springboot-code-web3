package com.azurealstn.springbootcodeweb3.repository;

import com.azurealstn.springbootcodeweb3.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    void insertMember() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Member member = Member.builder()
                    .email("r" + i + "@aaa.com")
                    .pw("2111")
                    .nickname("reviewer" + i)
                    .build();
            memberRepository.save(member);
        });
    }

    @Commit
    @Transactional
    @Test
    void testDeleteMember() {
        Long mid = 1L;
        Member member = Member.builder().mid(mid).build();

        reviewRepository.deleteByMember(member); //FK로 걸려있는 테이블 먼저 삭제
        memberRepository.deleteById(mid);

    }

}