package ch01.verify;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteAndReader {
	public static void main(String[] args) {
		final String PATH="c:\\temp\\test4.txt";
		Scanner scanner = new Scanner(System.in);
	       FileWriter fout=null;
	       //���� ���� 
	       try {
	    	         fout=new FileWriter(PATH);
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
	    	     fout.close();//��� ��Ʋ�� �ڿ����� 
	    	   scanner.close();
	    	   }catch(Exception e) {}
	       }
	       
	       //���� �б�
	   	FileReader fin=null;
		
		  try {
			  //���ϰ� java���α׷����� ���ڴ��� ����Ÿ ���� ��� ����
			    fin=new FileReader(PATH);
			    int c;// 
			    char[] buff = new char[256];//���� ���ڵ��� �����ϱ� ���� �迭
			    
			    //2byte�� ���Ϸ� ���� �о ����Ϳ� ���
			    while((c=fin.read(buff))!=-1) {//c�� ���ϵǴ� ���� buff�� ����� ���� 
			    	 System.out.println("���Ͽ� ����� ���ڱ���:"+c);
			    	//new String(���ڹ迭,����index,����);
			    	   String str = new String(buff,0,c);
			    	   System.out.println(str);
			    }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			fin.close();//�ڿ�����
			}catch(Exception e) {}
		}    
	       
	}
}
