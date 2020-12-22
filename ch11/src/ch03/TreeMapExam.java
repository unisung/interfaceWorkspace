package ch03;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {
public static void main(String[] args) {
	
	//key�������� �������� ����
	TreeMap<Integer,String> scores=new TreeMap<>();
	
	scores.put(new Integer(87), "ȫ�浿");
	scores.put(new Integer(98), "������");
	scores.put(75, "�Ӳ���");
	scores.put(95, "��浿");
	scores.put(80,"���浿");
	
	Set<Integer> keys = scores.keySet();
	Iterator<Integer> it = keys.iterator();
	while(it.hasNext()) {
		int key=it.next();
		System.out.println(key+":"+scores.get(key));
	}
	
	
}
}
