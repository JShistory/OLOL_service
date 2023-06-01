package com.ll.olol.boundedContext.member.repository;

import com.ll.olol.boundedContext.member.entity.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findById(Long id);
}
