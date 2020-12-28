package ch02_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
     //���� ����Ʈ
	//Arrays.asList(��ü1,��ü2,...); �ʱⰪ���� ��ü ����Ʈ ����
	private static List<Student> list = Arrays.asList(
			 new Student("ȫ�浿",90,96),
			 new Student("�ſ��",95,93)
			);	
	
	//���ڿ� Ÿ�� ��¸޼ҵ�
	//��ü -> String Ÿ�Ժ�ȯ
	public static void printString(Function<Student, String> function) {
		for(Student student:list) {System.out.print(function.apply(student)+" ");}
		System.out.println();
	}
	
	//����Ÿ�� ��¸޼ҵ�
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student:list) {System.out.print(function.applyAsInt(student)+" ");}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//ȣ��
		System.out.println("[�л� �̸�]");
		printString(new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		});
		//���ٽ�
		printString(t->t.getName());
		//��ü -> int
		System.out.println("[���� ����]");
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getEnglishScore();
			}
		});
		//���ٽ�
		printInt(s-> s.getEnglishScore());
		
		System.out.println("[���� ����]");
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student v) {
				return v.getMathScore();
			}
		});
		
		//���ٽ�
		printInt(v->v.getMathScore());
		
		
	}

}
