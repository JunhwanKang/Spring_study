package kr.or.connect.diexam01;

public class UserBean {
/*
1) 기본 생성자를 가지고 있다.
2) 필드는 private하게 선언한다.
3) getter,setter 메소드를 가진다. getName(), setName() 메소드를 name 프로퍼티(property)라고 한다. (*용어도 중요)
why? 사용자가 직접하는게 아니라 누군가 대신해줘야 될때는 규칙이 있어야댐
*/
	private String name;
	private int age;
	private boolean male;  //2번 규칙
	
	public UserBean() {}
	public UserBean(String name, int age, boolean male) {  //이런 생성자를 갖고 싶어 만들면 기본생성자는 없다. 그래서 1번 규칙에 의해 위처럼 기본 생성자를 만들어줌!!!
		this.name = name;
		this.age = age;
		this.male = male;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	
}
