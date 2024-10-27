package SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("School.xml");
		
		Gurukul gurukul = (Gurukul) beanfactory.getBean("gurukul");
		DAV dav = (DAV) beanfactory.getBean("dav");
		
		gurukul.name();
		System.out.println(gurukul.getFees());
		
		dav.name();
		System.out.println(dav.getFees());
	}
}
