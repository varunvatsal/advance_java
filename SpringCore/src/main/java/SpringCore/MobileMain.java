package SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("Mobile.xml");
		
		Mobile mobile = (Mobile) beanfactory.getBean("mobile");
		
		mobile.used();
	}
}
