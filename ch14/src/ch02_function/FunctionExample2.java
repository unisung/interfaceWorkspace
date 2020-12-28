package ch02_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> list 
      = Arrays.asList(new Student("ȫ�浿", 90, 96),
    		                  new Student("�ſ��",95,93)
    		                );
	
   //���� �Լ�-��ü ��
    //��ü -> int
    public static int sum(ToIntFunction<Student> function) {
    	 int sum=0;
    	 for(Student student:list) {
    		 sum+=function.applyAsInt(student);
    	 }
    	 return sum;
     }
    //��� 
   public static double avg(ToIntFunction<Student> function) {
	   int sum=0;
	   double avg=0.0;
  	 for(Student student:list) {
  		 sum+=function.applyAsInt(student);
  	 }
  	  avg = sum/list.size();
  	  return avg;
    }
   
   
	public static void main(String[] args) {
		//���ձ��ϱ�
		int sum=sum(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getEnglishScore();
			}
		});
		System.out.println("�������� ����: "+sum);
		
		//���ٽ�
		sum=sum( value->  value.getMathScore()	);
		System.out.println("�������� ����: "+sum);
		
		//��� 
		double avg=avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getEnglishScore();
			}
		});
       System.out.println("�������� ���:"+avg);
       //���ٽ�
       avg = avg(s->s.getMathScore());
       System.out.println("�������� ���: "+avg);
       
       
		
	}

}
