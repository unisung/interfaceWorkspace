package ch03;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
public static void main(String[] args) {
	  HashMap<String, String> dic = new HashMap<>();
	  
	  //<key,value>
	   dic.put("baby", "아기");
	   dic.put("love", "사랑");
	   dic.put("apple", "사과");
	   
	   //검색
	   Scanner scanner = new Scanner(System.in);
	   while(true) {
		   System.out.println("찾고싶은 단어?");
		   String eng = scanner.next();
		   if(eng.equals("exit")) break;
		   String kor=dic.get(eng);
		   if(kor==null) System.out.println(eng+"는 없는 단어입니다.");
		   else
			   System.out.println(kor);
	   }
	   scanner.close();//자원해제
}
}
