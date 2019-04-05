package org.lcy.book.chap08;

import java.util.List;

import org.lcy.book.chap03.Member;

public interface MemberDao {
	
	Member selectByEmail(String email);

	/**
	 * 회원정보 저장
	 */
	void insert(Member member);

	/**
	 * 회원정보 수정
	 */
	void update(Member member);

	/**
	 * 회원 목록
	 */
	List<Member> selectAll(int offset, int count);
}