package ch05;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsExample {
public static void main(String[] args) {
	LinkedList<String> myList = new LinkedList<>();
	myList.add("트랜스포머");
	myList.add("스타워즈");
	myList.add("매트릭스");
	myList.add(0,"터미네이터");
	myList.add(2,"아바타");
	
	System.out.println(myList.toString());
	
	 Collections.reverse(myList);
	 System.out.println(myList.toString());
	 
	 
	Collections.sort(myList);
	System.out.println(myList.toString());
	
	 Collections.reverse(myList);
	 System.out.println(myList.toString());
	 
	 int index = Collections.binarySearch(myList, "아바타");
	 System.out.println("아바타는"+(index+1)+"번째 요소입니다.");
}
}
