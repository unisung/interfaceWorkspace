package ch01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) {
		//Set�������̽��� ��ü ����
		Set<Student> set = new HashSet<Student>();
		//����ȭ ��� �߰�
		set = Collections.synchronizedSet(set);
		
		//set�� ������ ��ü�� �ߺ��������� ����.
		set.add(new Student(2001,"ȫ�浿",88));//
		set.add(new Student(2001,"ȫ�浿",88));//������
		set.add(new Student(2002,"ȫ�浿",90));//��������
		//����� ��ü�� ����� ù��° ��ü�� �ι�° ��ü�� ���� �ٸ� ��ü
		System.out.println(set.size());
		System.out.println(set);

		 //��������-������ü(Wrapper)�� ���� ������ ���ϰ�ü�� ����  equivalant
		Set<Integer> intSet = new HashSet<>();
		intSet.add(10);
		intSet.add(10);
		System.out.println(intSet.size());
		System.out.println(intSet);
		
		//���ڿ�(String��ü)�� ���� ������ ���ϰ�ü�� ����-�⺻Ÿ��,StringŸ���� ���� ������ ���ϰ�ü�� ����
		Set<String> strSet = new HashSet<>();
		strSet.add("ȫ�浿");
		strSet.add("ȫ�浿");
		System.out.println(strSet.size());
		System.out.println(strSet);
	}

}
