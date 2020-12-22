package ch03;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudenEx {
	public static void main(String[] args) {
		HashMap<String, Student> map=new HashMap<>();
		map.put("황기태", new Student(1, "010-111-2222"));
		map.put("이재무", new Student(2, "010-111-2223"));
		map.put("김남윤", new Student(3, "010-222-2222"));
		
		//
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름:");
			String name=scanner.nextLine();
			if(name.equals("exit")) break;
			Student student =map.get(name);
			if(student==null) System.out.println(name+"은 없는 사람입니다.");
			else
				System.out.println(student);//print()문 매개변수로 넘어가면 toString()자동 호출
		}
		scanner.close();
		
	}
}

class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id=id; this.tel=tel;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		return id==((Student)obj).id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", tel=" + tel + "]";
	}
	
	
}