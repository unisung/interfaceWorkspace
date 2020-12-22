package ch03;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudenEx {
	public static void main(String[] args) {
		HashMap<String, Student> map=new HashMap<>();
		map.put("Ȳ����", new Student(1, "010-111-2222"));
		map.put("���繫", new Student(2, "010-111-2223"));
		map.put("�賲��", new Student(3, "010-222-2222"));
		
		//
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("�˻��� �̸�:");
			String name=scanner.nextLine();
			if(name.equals("exit")) break;
			Student student =map.get(name);
			if(student==null) System.out.println(name+"�� ���� ����Դϴ�.");
			else
				System.out.println(student);//print()�� �Ű������� �Ѿ�� toString()�ڵ� ȣ��
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