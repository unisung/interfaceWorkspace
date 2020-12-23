package ch01;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamExmaple1 {

	public static void main(String[] args) {
		
	 //byte단위로 입력되는 값을 char단위로 변환하여 저장하는 객체
		 InputStreamReader rd = new InputStreamReader(System.in);
		  try {
			// int c=System.in.read();
		   int c=rd.read();//read()메소드의 리턴값은 int타입-길의는 char타입길이의 2byte
			System.out.println(c);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
