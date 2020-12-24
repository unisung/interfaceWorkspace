package ch01_03_nestedClass;

public class ThisExample2 {
	public int field1=10;
	
	//중첩클래스
	class Inner{
		int field2=20;
	//	{}
	//	if(true) {}
	//	while(ture) {}
		
		void method() {
			 //람다식
			MyFunctInterface fi
			 = () -> {
					System.out.println("바깥쪽클래스 필드: "+field1);
					System.out.println("바깥쪽클래스 필드: "+ThisExample2.this.field1);//
					
					System.out.println("안쪽클래스 필드: "+field2);
					//무명인터페이스 실체 내에서는 this.내부 클래스 필드로 접근 불가 
					System.out.println("안쪽클래스 필드: "+this.field2);//람다식으로는 this.내부클래스필드로 접근 가능
				}
			;

			fi.method();
			
		}
		
	}

}
