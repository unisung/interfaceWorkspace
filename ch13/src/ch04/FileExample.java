package ch04;

import java.io.File;

//File정보를 가지는 File객체-파일내의 데이타를 읽고 쓰는 기능은 없음
public class FileExample {
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath()+"의 서브리스트입니다.------");
		File[] subFiles = dir.listFiles();//해당 디렉토리의 파일과 디렉토리 정보를 File배열로 리턴.
		for(int i=0;i<subFiles.length;i++) {
			 File f=subFiles[i];
			 long t=f.lastModified();//최초 생성 일시, 혹은 마지막 수정된 일시 lastModifed()의 리턴타입은 long형
			 System.out.print(f.getName());
			 if(f.isDirectory()) {
				   System.out.print("\t디렉토리[.]"); 
			 }else {
			    System.out.print("\t파일크기:"+f.length());//파일 사이즈
			 }
			 System.out.printf("\t수정한 시간: %tb %td %ta %tT \n",t,t,t,t);
		}
		
	}
	
	public static void main(String[] args) {
		//파일 정보 객체 생성
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+", "+f1.getParent()+", "+f1.getName());
		String res="";
		if(f1.isFile()) res="파일";//파일이면 true
		else if(f1.isDirectory()) res="디렉토리";//디렉토리이면 true
		System.out.println(f1.getPath()+"은 "+res+"입니다.");
      	
		//파일정보 객체 생성
		File f2 = new File("c:\\temp\\java_sample");
		//파일객체에 저장된 파일정보가 실제로 존재하는지 체크 exists() 있으면 true, 없으면 false
		if(!f2.exists()) {//파일이 없는 확인
			 f2.mkdir();//해당디렉토리 생성 - 파일정보.mkdir();
		}
		//temp내의 파일,디렉토리 정보 
		listDirectory(new File("c:\\temp"));
		
		//디렉토리명 수정- 파일정보.renameTo(새파일);
		f2.renameTo(new File("c:\\temp\\javasample"));
		
		//디렉토리명 수정 후 정보 보기
		listDirectory(new File("c:\\temp"));

	}
}
