package ch01;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteExample2InputConsole {
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       FileWriter fout=null;
       try {
    	         fout=new FileWriter("c:\\temp\\test3.txt");
    	         System.out.println("������ ���ڿ��� �Է��ϼ���>");
    	         while(true) {
    	        	 String line=scanner.nextLine();//���� ������ ���ڿ� �Է�
    	        	 if(line.length()==0) break;
    	        	 //charŸ�Թ迭 -> String
    	        	 //writer(charŸ�Ժ���,����index,����);
    	        	 fout.write(line,0,line.length());
    	        	 fout.write("\r\n",0,2);
    	         }
    	      System.out.println("����Ϸ�");
       }catch(Exception e) {System.out.println("����");}
       finally {
    	   try {
    	   fout.close(); scanner.close();
    	   }catch(Exception e) {}
       }

	}

}
