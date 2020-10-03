package kr.or.connect.diexam01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kr.or.connect.diexam01") //자동으로 읽어들여서 지정  사용자가 일일이 다 알려주지 않아도 어노테이션이 붙어있는것들을 등록해줌, 정확한 패키지를 알려줘야함.
public class ApplicationConfig2 {

}
