package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans2.LgTV;
import kr.co.softsoldesk.beans2.TV;
import kr.co.softsoldesk.beans2.TestBean;

public class MainClass2 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans2.xml");

		TestBean t1 = ctx.getBean("t1", TestBean.class);

		System.out.println("t1.data1 : " + t1.getData1());
		System.out.println("t1.data2 : " + t1.getData2());
		System.out.println("t1.data3 : " + t1.isData3());
		System.out.println("t1.data4 : " + t1.getData4());
		System.out.println("t1.data5 : " + t1.getData5());
		System.out.println("t1.data6 : " + t1.getData6());
		System.out.println();
		System.out.println("=================================================");
		/* 활용 */
		// TV 메소드 호출
		/*
		 * TV tv = (TV) ctx.getBean("tv"); 
		 * tv.powerOn(); 
		 * tv.powerOff(); 
		 * tv.volumeUp();
		 * tv.volumeDown();
		 */
		// TV[인터페이스] + LgTV : TV와 LgTV메솓 호출
		LgTV tv = ctx.getBean("tv", LgTV.class);
		tv.getPrice();
		tv.getSpeaker();
		tv.powerOff();
		
		ctx.close();
	}

}
