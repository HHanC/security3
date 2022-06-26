package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import web.domain.member.MemberEntity;
import web.domain.member.MemberRepository;
import web.dto.MemberDto;

@Service
public class MemberService{

    @Autowired
    private MemberRepository memberRepository;



    public boolean signup(MemberDto memberDto){
        MemberEntity memberEntity = memberDto.toentity();
        memberRepository.save(memberEntity);
        return true;
    }

}
