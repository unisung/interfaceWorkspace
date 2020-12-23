package ch01;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteExample2InputConsole {
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       FileWriter fout=null;
       try {
    	         fout=new FileWriter("c:\\temp\\test3.txt");
    	         System.out.println("저장할 문자열을 입력하세요>");
    	         while(true) {
    	        	 String line=scanner.nextLine();//한줄 단위로 문자열 입력
    	        	 if(line.length()==0) break;
    	        	 //char타입배열 -> String
    	        	 //writer(char타입변수,시작index,길이);
    	        	 fout.write(line,0,line.length());
    	        	 fout.write("\r\n",0,2);
    	         }
    	      System.out.println("저장완료");
       }catch(Exception e) {System.out.println("오류");}
       finally {
    	   try {
    	   fout.close(); scanner.close();
    	   }catch(Exception e) {}
       }

	}

}
