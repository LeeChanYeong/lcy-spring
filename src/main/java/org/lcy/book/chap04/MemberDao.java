package org.lcy.book.chap04;

import java.util.HashMap;
import java.util.Map;

import org.lcy.book.chap03.Member;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	Map<String, Member> map = new HashMap<>();

	/**
	 * 이메일로 회원 정보 가져옴
	 */
	public Member selectByEmail(String email) {
		return map.get(email);
	}

	/**
	 * 회원정보 저장
	 */
	public void insert(Member member) {
		map.put(member.getEmail(), member);
	}
}
