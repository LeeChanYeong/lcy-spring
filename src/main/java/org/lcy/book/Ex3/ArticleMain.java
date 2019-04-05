package org.lcy.book.Ex3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap2.xml");
		ArticleService articleService = ctx.getBean("articleService", org.lcy.book.Ex3.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", org.lcy.book.Ex3.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}