package ch02_function;

public class Student {
	private String name;//학생명
	private int englishScore;//영어성적
	private int mathScore;//수학성적
	
	//매개변수 있는 생성자
	public Student(String name, int englishScore,
			int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	//get 메소드
	public String getName() {return name;	}
	public int getEnglishScore() {		
		  return englishScore;	}
	public int getMathScore() {		
		return mathScore;	}
	

	
	
	

}
