package ch01;

import java.util.HashSet;
import java.util.Set;

public class SetExam2 {

	public static void main(String[] args) {
		//Set�������̽��� ��ü ����
		Set<Student> set = new HashSet<Student>();
		//set�� ������ ��ü�� �ߺ��������� ����.
		set.add(new Student(2001,"ȫ�浿",88));//
		set.add(new Student(2001,"ȫ�浿",88));//������
		set.add(new Student(2002,"ȫ�浿",90));//��������
		
		//����� ��ü�� ����� ù��° ��ü�� �ι�° ��ü�� ���� �ٸ� ��ü
		
		//�й��� ������ ������ ��ü�� �ν�
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
		if(obj instanceof Student) {//����Ÿ���̸�
			return this.sno==((Student)obj).sno;//Ű�� ���Ǵ� �Ӽ��� ���� �񱳰�� ����
		}
		return false;// Ÿ���� �ٸ��� false����;
	}
	private int sno;
	private String name;
	private int score;
	//������
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