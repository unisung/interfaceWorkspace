package ch03_andornegate;

import java.util.function.Predicate;

//IsEquals()
public class PredicateIsEqualsExample {

	public static void main(String[] args) {
		Predicate<String> predicate;
		
		//�������̽���.�����޼ҵ�() - isEqual(null,���)
		predicate = Predicate.isEqual(null);//predicate�� ��ü�� null �Է�
		System.out.println("null, null: "+predicate.test(null));//��� - null;
		
		//null�� �ƴ� ��ü
		predicate = Predicate.isEqual("Java8");//predicate�� ��ü�� "Java8" �Է�
		System.out.println("��ü, null: "+predicate.test(null));//��� - null;
		
		//null�� ��ü
		predicate = Predicate.isEqual(null);//predicate�� ��ü�� null �Է�
		System.out.println("null, ��ü: "+predicate.test("Java8"));//��� - "Java8";
		
		//null�� �ƴ� ��ü
		predicate = Predicate.isEqual("Java8");//predicate�� ��ü�� "Java8" �Է�
		System.out.println("��ü, ��ü: "+predicate.test("Java8"));//��� - "Java8";
				
		Predicate<Student> predicateStudent;
		//null�� �ƴ� ��ü-����� ���� ��ü
		predicateStudent = Predicate.isEqual(new Student(1, "ȫ�浿", 88));//predicate�� ��ü�� Student��ü �Է�
		System.out.println("��ü, ��ü: "+
		          predicateStudent.test(new Student(1,"ȫ�浿", 88)));//��� - Student;
						
				
		
	}
}
