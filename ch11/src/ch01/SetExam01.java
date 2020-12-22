package ch01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) {
		//Set인터페이스에 객체 저장
		Set<Student> set = new HashSet<Student>();
		//동기화 기능 추가
		set = Collections.synchronizedSet(set);
		
		//set은 동일한 객체를 중복저장하지 않음.
		set.add(new Student(2001,"홍길동",88));//
		set.add(new Student(2001,"홍길동",88));//동일인
		set.add(new Student(2002,"홍길동",90));//동명이인
		//사용자 객체를 저장시 첫번째 객체와 두번째 객체는 서로 다른 객체
		System.out.println(set.size());
		System.out.println(set);

		 //정수저장-정수객체(Wrapper)는 값이 같으면 동일객체로 간주  equivalant
		Set<Integer> intSet = new HashSet<>();
		intSet.add(10);
		intSet.add(10);
		System.out.println(intSet.size());
		System.out.println(intSet);
		
		//문자열(String객체)는 값이 같으면 동일객체로 간주-기본타입,String타입은 값이 같으면 동일객체로 간주
		Set<String> strSet = new HashSet<>();
		strSet.add("홍길동");
		strSet.add("홍길동");
		System.out.println(strSet.size());
		System.out.println(strSet);
	}

}
