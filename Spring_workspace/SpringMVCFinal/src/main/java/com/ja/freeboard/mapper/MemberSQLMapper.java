package com.ja.freeboard.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ja.freeboard.vo.MemberVo;

//DAO 
public interface MemberSQLMapper {
	//key를 먼저 구하는 방식
	@Select("select fb_member_seq.nextval from dual")
	public int createKey();
	
	@Insert("INSERT INTO FB_Member VALUES(#{member_no}, #{member_id}, #{member_pw},#{member_nick},#{member_sex},SYSDATE)")
	public void insert(MemberVo vo);//getter를 받아와서 세팅
	
	
}
