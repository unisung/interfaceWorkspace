package ch01;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		  try(FileWriter writer = new FileWriter("c:\\temp\\test2.txt")){//���� ������ ���� �� �����
			       writer.write('A');//2byte��ü ����
		  }catch(Exception e) {}

	}

}
