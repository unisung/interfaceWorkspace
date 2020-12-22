package ch03;

import java.util.TreeSet;

public class TreeSetMainEx {
	public static void main(String[] args) {
		//데이타 저장시 오름차순으로 자동 정렬되어 저장
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(6);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(9);
		
		System.out.println(set.first());//작은값
		System.out.println(set.last());//큰값
		
		Integer h1 =set.higher(3);//보다 큰값
		System.out.println(h1);
		
		Integer l1 = set.lower(3);//보다 작은 값
		System.out.println(l1);
		
		
	}

}
