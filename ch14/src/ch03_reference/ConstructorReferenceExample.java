package ch03_reference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
	   Function<String, Member> function1 = new Function<String, Member>() {
		@Override
		public Member apply(String t) {
			return new Member(t);
		}
	};
	
	//���ٽ�
	function1 = t->new Member(t);
	//����-������ ���� Ŭ����::new; -jvm�� �Ű����� �ñ״�ó�� �´� ������ ȣ��
	function1=Member::new;
	
	BiFunction<String, String, Member> function2=new BiFunction<String, String, Member>() {
		@Override
		public Member apply(String t, String u) {
			return new Member(t,u);
		}
	};
	
	//���ٽ�
    function2 = (t,u)->new Member(t,u);
    //����-������ ���� Ŭ����::new -jvm�� �Ű����� �ñ״�ó�� �´� ������ ȣ��
    function2=Member::new;

	}

}
