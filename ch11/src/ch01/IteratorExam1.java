package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExam1 {

	public static void main(String[] args) {
		//Vector<Integer> v = new Vector<>();
		//ArrayList<Integer> v = new ArrayList<>();
		//LinkedList<Integer> v= new LinkedList<>();
		Set<Integer> v= new HashSet<>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		//v.add(2,100);
		v.add(100);
		
		//iterator를 이용한 모든 정수 출력
		Iterator<Integer> it=v.iterator();//iterator객체 생성 메소드 iterator()
		int sum=0;
		while(it.hasNext()) {
			int n=it.next();
			sum+=n;
			System.out.println(n);
		}
     System.out.println("정수의 합:"+sum);
	}

}
