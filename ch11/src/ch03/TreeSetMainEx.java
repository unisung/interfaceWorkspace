package ch03;

import java.util.TreeSet;

public class TreeSetMainEx {
	public static void main(String[] args) {
		//����Ÿ ����� ������������ �ڵ� ���ĵǾ� ����
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(6);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(9);
		
		System.out.println(set.first());//������
		System.out.println(set.last());//ū��
		
		Integer h1 =set.higher(3);//���� ū��
		System.out.println(h1);
		
		Integer l1 = set.lower(3);//���� ���� ��
		System.out.println(l1);
		
		
	}

}
