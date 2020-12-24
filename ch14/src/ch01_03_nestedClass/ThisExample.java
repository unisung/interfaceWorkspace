package ch01_03_nestedClass;

public class ThisExample {
	public int field1=10;
	
	//중첩클래스
	class Inner{
		int field2=20;
		
		void method() {
			 //람다식
			MyFunctInterface fi
			 = new MyFunctInterface() {
				
				@Override
				public void method() {
					System.out.println("바깥쪽클래스 필드: "+field1);
					System.out.println("바깥쪽클래스 필드: "+ThisExample.this.field1);//
					
					System.out.println("안쪽클래스 필드: "+field2);
					//무명인터페이스 실체 내에서는 this.내부 클래스 필드로 접근 불가 
					//System.out.println("안쪽클래스 필드: "+this.field2);//무명인터페이스에서 this는 무명인터페이스 자신을 가리킴(Inner클래스를 가리키는것이 아님)
				}
			};

			fi.method();
			
		}
		
	}

}
