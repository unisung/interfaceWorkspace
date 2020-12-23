package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamReaderExample {

	public static void main(String[] args){
		
		try(FileInputStream fin=new FileInputStream("c:\\Temp\\hangul.txt");
				//InputStream객체로 Reader생성시 문자셋 설정 
				//new InputStreamReader(byte스트림, 문자셋);
				InputStreamReader in = new InputStreamReader(fin,"MS949");){
		System.out.println(in.getEncoding());
		
		int c;
		while((c=in.read())!=-1) {
			   System.out.print((char)c);
		}
		}catch(Exception e) {}
	}
}
