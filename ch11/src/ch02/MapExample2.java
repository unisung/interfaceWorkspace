package ch02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample2 {
public static void main(String[] args) {
	 Map<Integer, Student> map = new Hashtable<>();
	 //키를 기본타입, String타입을 사용- 키 중복체크 가능
	 map.put(2001, new Student(2001,"홍길동",88));
	 map.put(2001, new Student(2001,"홍길동",90));
	 map.put(2002, new Student(2002,"홍길동",89));
	 
	System.out.println(map.size());
	 
	 Map<Student, Student> map2 = new HashMap<>();
	 //사용자정의 객체 원형으로는 - 키 중복체크 불가
	 map2.put(new Student(2001,"홍길동",88), new Student(2001,"홍길동",88));
	 map2.put(new Student(2001,"홍길동",90), new Student(2001,"홍길동",90));
	 map2.put(new Student(2002,"홍길동",89), new Student(2002,"홍길동",89));
	 
	System.out.println(map2.size());
	 
	 
}
}
