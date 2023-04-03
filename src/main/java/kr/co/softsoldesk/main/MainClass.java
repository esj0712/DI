package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TV;
import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		// #1 기본
		TestBean t1=new TestBean();
		t1.printData();
		
		System.out.println("-----------------11111---------------------");
		TestBean obj1=ctx.getBean("obj1", TestBean.class);
		obj1.printData();
		System.out.println("============================================");
		
		// int
		TestBean t2=new TestBean(100);
		t2.printData();
		
		System.out.println("-----------------22222---------------------");
		TestBean obj2=ctx.getBean("obj2", TestBean.class);
		obj2.printData();
		System.out.println("============================================");
		
		// double
		TestBean t3=new TestBean(33.33);
		t3.printData();
		
		System.out.println("-----------------33333---------------------");
		TestBean obj3=ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		System.out.println("============================================");
		
		// string
		TestBean t4=new TestBean("soldesk");
		t4.printData();
		
		System.out.println("-----------------44444---------------------");
		TestBean obj4=ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		System.out.println("============================================");
		
		
		// all
		TestBean t5=new TestBean(200,22.22,"software");
		t5.printData();
		
		System.out.println("-----------------55555---------------------");
		TestBean obj5=ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		System.out.println("============================================");
		
		// 속성 모두 주입시 순서 변경
		// 자바에서는 불가능
		//TestBean t6=new TestBean("softsoldesk",200,22.22);
		//t6.printData();
		
		System.out.println("-----------------66666---------------------");
		TestBean obj6=ctx.getBean("obj6", TestBean.class);
		obj6.printData();
		System.out.println("============================================");
		
		// all
		TestBean t7=new TestBean(200,22.22,"software");
		t7.printData();
		
		System.out.println("-----------------77777---------------------");
		TestBean obj7=ctx.getBean("obj7", TestBean.class);
		obj7.printData();
		System.out.println("============================================");
		
		// java
		DataBean d1=new DataBean();
		DataBean d2=new DataBean();
		TestBean1 t200=new TestBean1(d1, d2);
		t200.printData();
		
		TestBean1 obj8=ctx.getBean("obj8", TestBean1.class);
		obj8.printData();
		System.out.println("============================================");
		
		TestBean1 obj9=ctx.getBean("obj9", TestBean1.class);
		obj9.printData();
		System.out.println("============================================");
		
		//활용
		TV tv=(TV)ctx.getBean("tv", TV.class);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		
		
		ctx.close();
	}

}
