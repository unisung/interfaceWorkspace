package ch02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample2 {
public static void main(String[] args) {
	 Map<Integer, Student> map = new Hashtable<>();
	 //Ű�� �⺻Ÿ��, StringŸ���� ���- Ű �ߺ�üũ ����
	 map.put(2001, new Student(2001,"ȫ�浿",88));
	 map.put(2001, new Student(2001,"ȫ�浿",90));
	 map.put(2002, new Student(2002,"ȫ�浿",89));
	 
	System.out.println(map.size());
	 
	 Map<Student, Student> map2 = new HashMap<>();
	 //��������� ��ü �������δ� - Ű �ߺ�üũ �Ұ�
	 map2.put(new Student(2001,"ȫ�浿",88), new Student(2001,"ȫ�浿",88));
	 map2.put(new Student(2001,"ȫ�浿",90), new Student(2001,"ȫ�浿",90));
	 map2.put(new Student(2002,"ȫ�浿",89), new Student(2002,"ȫ�浿",89));
	 
	System.out.println(map2.size());
	 
	 
}
}
