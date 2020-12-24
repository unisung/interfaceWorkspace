package ch04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//���ڿ� ������ ���� ����
public class FileStringCopyExample {

	public static void main(String[] args) {
	    File src=new File("c:\\windows\\system.ini");//����
	    File dest=new File("c:\\temp\\system.txt");//Ÿ��
	    
	    int c;
	    try {
	    	    //���ڴ��� ����� ��Ʈ����ü ����
	    	     FileReader fr = new FileReader(src);
	    	     FileWriter fw = new FileWriter(dest);
	    	     while((c=fr.read())!=-1) {//2byte���� ����Ÿ �о int c�� ����-���� �ϳ��а�
	    	    	      fw.write((char)c);//[][] �����ϳ� ����
	    	     }
	    	    fr.close(); fw.close();
	    	    System.out.println(src.getPath() +"�� "+dest.getPath()+" �� �����Ͽ����ϴ�.");
	    }catch(Exception e) {
	    	System.out.println("���� ���� ����");
	    }
	}
	  

}
