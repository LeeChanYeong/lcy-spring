package org.lcy.jdbc.sping;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpingMain {

		public static void main(String[] args) {
			ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
					"chap2.xml");
			Greeter g = ctx.getBean("greeter", Greeter.class);
			System.out.println(g.greet());
			ctx.close();
		}
	}

