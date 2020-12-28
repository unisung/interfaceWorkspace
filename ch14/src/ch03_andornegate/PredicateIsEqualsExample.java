package ch03_andornegate;

import java.util.function.Predicate;

//IsEquals()
public class PredicateIsEqualsExample {

	public static void main(String[] args) {
		Predicate<String> predicate;
		
		//인터페이스명.정적메소드() - isEqual(null,대상)
		predicate = Predicate.isEqual(null);//predicate의 객체에 null 입력
		System.out.println("null, null: "+predicate.test(null));//대상 - null;
		
		//null이 아닌 객체
		predicate = Predicate.isEqual("Java8");//predicate의 객체에 "Java8" 입력
		System.out.println("객체, null: "+predicate.test(null));//대상 - null;
		
		//null인 객체
		predicate = Predicate.isEqual(null);//predicate의 객체에 null 입력
		System.out.println("null, 객체: "+predicate.test("Java8"));//대상 - "Java8";
		
		//null이 아닌 객체
		predicate = Predicate.isEqual("Java8");//predicate의 객체에 "Java8" 입력
		System.out.println("객체, 객체: "+predicate.test("Java8"));//대상 - "Java8";
				
		Predicate<Student> predicateStudent;
		//null이 아닌 객체-사용자 정의 객체
		predicateStudent = Predicate.isEqual(new Student(1, "홍길동", 88));//predicate의 객체에 Student객체 입력
		System.out.println("객체, 객체: "+
		          predicateStudent.test(new Student(1,"홍길동", 88)));//대상 - Student;
						
				
		
	}
}
