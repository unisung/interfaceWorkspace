package ch01;

import java.util.HashSet;
import java.util.Set;

public class SetExam2 {

	public static void main(String[] args) {
		//Set인터페이스에 객체 저장
		Set<Student> set = new HashSet<Student>();
		//set은 동일한 객체를 중복저장하지 않음.
		set.add(new Student(2001,"홍길동",88));//
		set.add(new Student(2001,"홍길동",88));//동일인
		set.add(new Student(2002,"홍길동",90));//동명이인
		
		//사용자 객체를 저장시 첫번째 객체와 두번째 객체는 서로 다른 객체
		
		//학번이 같으면 동등한 객체로 인식
		System.out.println(set.size());
		System.out.println(set);
		
		
	}
}

class Student extends Object{
	@Override
	public int hashCode() {
		return sno;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {//동일타입이면
			return this.sno==((Student)obj).sno;//키로 사용되는 속성값 끼리 비교결과 리턴
		}
		return false;// 타입이 다르면 false리턴;
	}
	private int sno;
	private String name;
	private int score;
	//생성자
	public Student(int sno, String name, int score) {
		super();
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
}