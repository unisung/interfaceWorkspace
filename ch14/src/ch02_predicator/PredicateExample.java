package ch02_predicator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
 private static List<Student> list
 =Arrays.asList(new Student("ȫ�浿", 90, 88,"����"),
		 new Student("������",90,87,"����"),
		 new Student("������",95,80,"����"),
		 new Student("ȫ���",92,89,"����")
		 );
	
 //���� ����Լ�
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
		//���л�
  double maleAvg =avg(new Predicate<Student>() {
	@Override
	public boolean test(Student t) {
		return t.getGender().equals("����");
	}
});
   System.out.println("���л� ���: "+maleAvg);
   
 //
 double femaleAvg=avg(t->t.getGender().equals("����"));
 System.out.println("���л� ���:"+femaleAvg);
  
 double topAvg = avg2(t->t.getEnglishScore()>=92);
 System.out.println("���� ���:"+topAvg);
 
 
	}
}
