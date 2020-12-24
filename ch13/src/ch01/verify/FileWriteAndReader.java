package ch01.verify;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteAndReader {
	public static void main(String[] args) {
		final String PATH="c:\\temp\\test4.txt";
		Scanner scanner = new Scanner(System.in);
	       FileWriter fout=null;
	       //파일 저장 
	       try {
	    	         fout=new FileWriter(PATH);
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
	    	     fout.close();//출력 스틀림 자원해제 
	    	   scanner.close();
	    	   }catch(Exception e) {}
	       }
	       
	       //파일 읽기
	   	FileReader fin=null;
		
		  try {
			  //파일과 java프로그램간에 문자단위 데이타 전달 통로 생성
			    fin=new FileReader(PATH);
			    int c;// 
			    char[] buff = new char[256];//읽은 문자들을 저장하기 위한 배열
			    
			    //2byte씩 파일로 부터 읽어서 모니터에 출력
			    while((c=fin.read(buff))!=-1) {//c에 리턴되는 값은 buff에 저장된 길이 
			    	 System.out.println("파일에 저장된 문자길이:"+c);
			    	//new String(문자배열,시작index,길이);
			    	   String str = new String(buff,0,c);
			    	   System.out.println(str);
			    }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			fin.close();//자원해제
			}catch(Exception e) {}
		}    
	       
	}
}
