package ch01;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamExmaple1 {

	public static void main(String[] args) {
		
	 //byte������ �ԷµǴ� ���� char������ ��ȯ�Ͽ� �����ϴ� ��ü
		 InputStreamReader rd = new InputStreamReader(System.in);
		  try {
			// int c=System.in.read();
		   int c=rd.read();//read()�޼ҵ��� ���ϰ��� intŸ��-���Ǵ� charŸ�Ա����� 2byte
			System.out.println(c);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
