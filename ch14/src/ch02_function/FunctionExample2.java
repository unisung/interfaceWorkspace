package ch02_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> list 
      = Arrays.asList(new Student("홍길동", 90, 96),
    		                  new Student("신용권",95,93)
    		                );
	
   //집계 함수-전체 합
    //객체 -> int
    public static int sum(ToIntFunction<Student> function) {
    	 int sum=0;
    	 for(Student student:list) {
    		 sum+=function.applyAsInt(student);
    	 }
    	 return sum;
     }
    //평균 
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
		//총합구하기
		int sum=sum(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getEnglishScore();
			}
		});
		System.out.println("영어점수 총합: "+sum);
		
		//람다식
		sum=sum( value->  value.getMathScore()	);
		System.out.println("수학점수 총합: "+sum);
		
		//평균 
		double avg=avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getEnglishScore();
			}
		});
       System.out.println("영어점수 평균:"+avg);
       //람다식
       avg = avg(s->s.getMathScore());
       System.out.println("수학점수 평균: "+avg);
       
       
		
	}

}
