package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ApplicationContextExam04 {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig2.class);
		
//		Car car = (Car) ac.getBean("car");
		Car car = (Car) ac.getBean(Car.class);  //메소드명을 실수해도 사용 가능하기에 에러를 피할 수 있다.
		car.run();
	}

}
