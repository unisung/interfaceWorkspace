package ch01;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		  try(FileWriter writer = new FileWriter("c:\\temp\\test2.txt")){//파일 없으면 생성 후 저장됨
			       writer.write('A');//2byte객체 저장
		  }catch(Exception e) {}

	}

}
