package ch01_rpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClientEx {
	public static void main(String[] args) {
	//��Ʈ�� ��ü ����
		BufferedReader in=null;
		BufferedWriter out=null;
		//Ŭ���̾�Ʈ ���� ����
		Socket socket=null;
		//��ĳ�� ��ü ����
		Scanner scanner = new Scanner(System.in);
		
		try {
			     //Ŭ���̾�Ʈ ���� ����
			socket = new Socket("localhost",9988);
			//��Ʈ�� ��ü ����
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//���� ����� ó��
			while(true) {
				 System.out.println("����(��ĭ���� ��� �Է�,��:24 + 42)>>");//������Ʈ
				 //Ű����κ��� ���� �б�
				 String outputMessage = scanner.nextLine();//�� �� ������ �б� - nextLine()�� ���� ���ڿ����� '\r\n'�� ���� �� ����
				 //���� ����Ȯ��
				 if(outputMessage.equalsIgnoreCase("bye")) {//bye����
					  out.write(outputMessage+"\n");// ���� ������ ���� "\n" �߰�
					  //buffered��Ʈ���� �޸� ���� ����
					  out.flush();
					  //Ŭ���̾�Ʈ �ڽ� ���� ó��
					  break;
				 }
				 //����޼����� �ƴ� ���
				 out.write(outputMessage+"\n");//�� �� ������ ���� "\n"
				 //�о��
				 out.flush();
				 //����ޱ�
				 String inputMessage = in.readLine();//�� �� ������ �б� readLine()
				 //������ ����ϱ�
				 System.out.println("��� ���: "+inputMessage);
			}
		}catch(Exception e) {
			 System.out.println(e.getMessage());
		}finally {
			 try {
				  scanner.close();
				  if(socket!=null) socket.close();//Ŭ���̾�Ʈ ���� �ݱ�
			 }catch(Exception e) {
				 System.out.println("�����߻�");
			 }
		}

	}
}
