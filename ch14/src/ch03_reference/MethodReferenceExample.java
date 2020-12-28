package ch03_reference;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
	public static void main(String[] args) {
      IntBinaryOperator operator;
      
      //�����޼ҵ� ����
      operator = new IntBinaryOperator() {
		@Override
		public int applyAsInt(int left, int right) {
			return Calculator.staticMethod(left,right);//�����޼ҵ� ȣ��
		}
	};
	//���ٽ�
	operator=(left,right)->Calculator.staticMethod(left,right);
	System.out.println(operator.applyAsInt(10, 20));
	
	//static�޼ҵ� ����
	operator = Calculator::staticMethod;//jvm�� �޼ҵ��� �Ű�����Ÿ��, ����Ÿ�� �ľ�
	System.out.println(operator.applyAsInt(10, 20));
	
	//�ν��Ͻ��޼ҵ� ����
	//�޼ҵ尡 �����ε� �Ǿ�������
	//�Ѱ��� �Ű������� Ÿ��,���� �µ��� jvm�� ã�Ƽ� ����.
	Calculator cal = new Calculator();//�ν��Ͻ� ��ü
	operator = new IntBinaryOperator() {
		@Override
		public int applyAsInt(int left, int right) {
			return cal.instanceMethod(left, right);
		}
	};
	
	System.out.println(operator.applyAsInt(10, 20));
	//���ٽ�
	operator=(left,right)->cal.instanceMethod(left, right);
	
	//�ν��Ͻ� �޼ҵ� ���� - ��������::�ν��Ͻ��޼ҵ��
	//�޼ҵ尡 �����ε� �Ǿ�������
	//�Ѱ��� �Ű������� Ÿ��,���� �µ��� jvm�� ã�Ƽ� ����.
	operator=cal::instanceMethod;
	System.out.println(operator.applyAsInt(10, 20));
	
	
	
      

	}
}
