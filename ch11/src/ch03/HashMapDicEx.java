package ch03;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
public static void main(String[] args) {
	  HashMap<String, String> dic = new HashMap<>();
	  
	  //<key,value>
	   dic.put("baby", "�Ʊ�");
	   dic.put("love", "���");
	   dic.put("apple", "���");
	   
	   //�˻�
	   Scanner scanner = new Scanner(System.in);
	   while(true) {
		   System.out.println("ã����� �ܾ�?");
		   String eng = scanner.next();
		   if(eng.equals("exit")) break;
		   String kor=dic.get(eng);
		   if(kor==null) System.out.println(eng+"�� ���� �ܾ��Դϴ�.");
		   else
			   System.out.println(kor);
	   }
	   scanner.close();//�ڿ�����
}
}
