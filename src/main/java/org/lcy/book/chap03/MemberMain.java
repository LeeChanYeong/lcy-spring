package org.lcy.book.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("lcy@msn.com");
		req.setPassword("2012");
		req.setName("lcy");

		// 회원 등록
		regService.regist(req);
	}
}