package ch05;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsExample {
public static void main(String[] args) {
	LinkedList<String> myList = new LinkedList<>();
	myList.add("Ʈ��������");
	myList.add("��Ÿ����");
	myList.add("��Ʈ����");
	myList.add(0,"�͹̳�����");
	myList.add(2,"�ƹ�Ÿ");
	
	System.out.println(myList.toString());
	
	 Collections.reverse(myList);
	 System.out.println(myList.toString());
	 
	 
	Collections.sort(myList);
	System.out.println(myList.toString());
	
	 Collections.reverse(myList);
	 System.out.println(myList.toString());
	 
	 int index = Collections.binarySearch(myList, "�ƹ�Ÿ");
	 System.out.println("�ƹ�Ÿ��"+(index+1)+"��° ����Դϴ�.");
}
}
