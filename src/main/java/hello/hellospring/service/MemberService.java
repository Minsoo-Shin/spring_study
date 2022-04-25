package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

//    public Long join(Member member) {
//        //같은 이름이 있는 중복 회원
//        Optional<Member> result = memberRepository.findByName(Member.getName());
//
//        result.isPresent( m -> {
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        });
//    }
}
