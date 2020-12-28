package ch02_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
     //점수 리스트
	//Arrays.asList(객체1,객체2,...); 초기값으로 객체 리스트 생성
	private static List<Student> list = Arrays.asList(
			 new Student("홍길동",90,96),
			 new Student("신용권",95,93)
			);	
	
	//문자열 타입 출력메소드
	//객체 -> String 타입변환
	public static void printString(Function<Student, String> function) {
		for(Student student:list) {System.out.print(function.apply(student)+" ");}
		System.out.println();
	}
	
	//정수타입 출력메소드
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student:list) {System.out.print(function.applyAsInt(student)+" ");}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//호출
		System.out.println("[학생 이름]");
		printString(new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		});
		//람다식
		printString(t->t.getName());
		//객체 -> int
		System.out.println("[영어 점수]");
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getEnglishScore();
			}
		});
		//람다식
		printInt(s-> s.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student v) {
				return v.getMathScore();
			}
		});
		
		//람다식
		printInt(v->v.getMathScore());
		
		
	}

}
