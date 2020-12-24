package ch04;

import java.io.File;

//File������ ������ File��ü-���ϳ��� ����Ÿ�� �а� ���� ����� ����
public class FileExample {
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath()+"�� ���긮��Ʈ�Դϴ�.------");
		File[] subFiles = dir.listFiles();//�ش� ���丮�� ���ϰ� ���丮 ������ File�迭�� ����.
		for(int i=0;i<subFiles.length;i++) {
			 File f=subFiles[i];
			 long t=f.lastModified();//���� ���� �Ͻ�, Ȥ�� ������ ������ �Ͻ� lastModifed()�� ����Ÿ���� long��
			 System.out.print(f.getName());
			 if(f.isDirectory()) {
				   System.out.print("\t���丮[.]"); 
			 }else {
			    System.out.print("\t����ũ��:"+f.length());//���� ������
			 }
			 System.out.printf("\t������ �ð�: %tb %td %ta %tT \n",t,t,t,t);
		}
		
	}
	
	public static void main(String[] args) {
		//���� ���� ��ü ����
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+", "+f1.getParent()+", "+f1.getName());
		String res="";
		if(f1.isFile()) res="����";//�����̸� true
		else if(f1.isDirectory()) res="���丮";//���丮�̸� true
		System.out.println(f1.getPath()+"�� "+res+"�Դϴ�.");
      	
		//�������� ��ü ����
		File f2 = new File("c:\\temp\\java_sample");
		//���ϰ�ü�� ����� ���������� ������ �����ϴ��� üũ exists() ������ true, ������ false
		if(!f2.exists()) {//������ ���� Ȯ��
			 f2.mkdir();//�ش���丮 ���� - ��������.mkdir();
		}
		//temp���� ����,���丮 ���� 
		listDirectory(new File("c:\\temp"));
		
		//���丮�� ����- ��������.renameTo(������);
		f2.renameTo(new File("c:\\temp\\javasample"));
		
		//���丮�� ���� �� ���� ����
		listDirectory(new File("c:\\temp"));

	}
}
