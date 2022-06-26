package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import web.dto.MemberDto;
import web.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/signup")
    public String signup(){
        return "member/signup";
    }

    @PostMapping("/signup")
    @ResponseBody
    public boolean save(MemberDto memberDto){
        boolean result = memberService.signup(memberDto);
        return result;
    }

}
