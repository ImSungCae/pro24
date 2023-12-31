package com.spring.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.member.vo.MemberVO;

public interface MemberDAO {
	public List selectAllMembersList() throws DataAccessException;
	public int insertMember(MemberVO memberVO) throws DataAccessException; 
	public int deleteMember(String id) throws DataAccessException; 
}
