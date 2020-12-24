package ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//byte������ ����� ����Ÿ(�̹���,����,����)������ ����
public class BinaryCopyExample2 {

	public static void main(String[] args) {
		//���� ���� ��ü ����
		File src=new File("c:\\temp\\copyimg.jpg");//
		File dest=new File("c:\\temp\\copyimg2.jpg");
		
		//byte������ ����Ÿ�� intŸ���� c�� �����ϱ����� ���� ����
		int c;
		try {
			     //byte���� ���̳ʸ� ���� ��Ʈ�� ��ü ����
			    FileInputStream fi = new FileInputStream(src);
			    FileOutputStream fo=new FileOutputStream(dest);
			    //buff����
			    byte[] buf = new byte[1024*10];//10kb ����, [][][][][][][][][][]
			    
			   /* while(true) {
			    	c=fi.read(buf);
			    	fo.write(buf,0,c);
			    	if(c<buf.length) break;
			    }
			    */
			    while((c=fi.read(buf))!=-1){// read(buf)�� ���� ���� ����Ÿ�� buf�迭�� ����, ���ϰ��� ���� ����
			    	      fo.write(buf,0,c);//���� ���̸�ŭ ���Ͽ� ����
			    }
			    
			    //�ڿ�����
			    fi.close();
			    fo.close();
			    System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�.");
			
		}catch(Exception e) {
			System.out.println("���� ���� ����");
		}
	

	}

}
