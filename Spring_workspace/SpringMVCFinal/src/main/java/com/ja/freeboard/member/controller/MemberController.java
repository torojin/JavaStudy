package com.ja.freeboard.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.freeboard.member.service.MemberServiceImpl;
import com.ja.freeboard.vo.MemberVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	//참조주소를 넣어주겠다.
	@Autowired
	private MemberServiceImpl memberService;
	
	//로그인 페이지
	@RequestMapping("/login_page.do")
	public String loginPage() {
		return "member/login_page";
	}
	
	//회원가입 페이지
	@RequestMapping("/join_member_page.do")
	public String joinMemberPage() {
		return "member/join_member_page";
	}
	
	//hobby는 배열 형태로 받아서 처리
	@RequestMapping("/join_member_process.do")
	public String joinMemberProcess(MemberVo memberVo, int[] member_hobby) {
		memberService.joinMember(memberVo, member_hobby);
		return "redirect:./login_page.do"; //redirect로 처리
	}
}
