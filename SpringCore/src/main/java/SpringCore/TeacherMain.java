package SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("Teacher.xml");
		
		Teacher teacher = (Teacher) beanfactory.getBean("teacher");
		System.out.println(teacher);
	}
}
