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
		
		//iterator�� �̿��� ��� ���� ���
		Iterator<Integer> it=v.iterator();//iterator��ü ���� �޼ҵ� iterator()
		int sum=0;
		while(it.hasNext()) {
			int n=it.next();
			sum+=n;
			System.out.println(n);
		}
     System.out.println("������ ��:"+sum);
	}

}
