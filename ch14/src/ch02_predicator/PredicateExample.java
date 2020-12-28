package ch02_predicator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
 private static List<Student> list
 =Arrays.asList(new Student("홍길동", 90, 88,"남자"),
		 new Student("일지매",90,87,"남자"),
		 new Student("유관순",95,80,"여자"),
		 new Student("홍길순",92,89,"여자")
		 );
	
 //성별 평균함수
 public static double avg(Predicate<Student> predicate) {
	 int count=0,sum=0;
	 for(Student student:list) {
		   if(predicate.test(student)) {
			     count++;
			     sum+=student.getEnglishScore();
		   }
	 }
	 return (double)sum/count;
 }
 
 public static double avg2(Predicate<Student> predicate) {
	 int count=0,sum=0;
	 for(Student student:list) {
		   if(predicate.test(student)) {
			     count++;
			     sum+=student.getEnglishScore();
		   }
	 }
	 return (double)sum/count;
 }
 
	public static void main(String[] args) {
		//남학생
  double maleAvg =avg(new Predicate<Student>() {
	@Override
	public boolean test(Student t) {
		return t.getGender().equals("남자");
	}
});
   System.out.println("남학생 평균: "+maleAvg);
   
 //
 double femaleAvg=avg(t->t.getGender().equals("여자"));
 System.out.println("여학생 평균:"+femaleAvg);
  
 double topAvg = avg2(t->t.getEnglishScore()>=92);
 System.out.println("상위 평균:"+topAvg);
 
 
	}
}
