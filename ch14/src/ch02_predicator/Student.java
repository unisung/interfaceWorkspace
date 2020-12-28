package ch02_predicator;

public class Student {
	private String name;//학생명
	private int englishScore;//영어성적
	private int mathScore;//수학성적
	private String gender;//성별
	
	//매개변수 있는 생성자
	public Student(String name, int englishScore,
			int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public Student(String name, int englishScore,
			int mathScore, String gender) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.gender = gender;
	}



	//get 메소드
	public String getName() {return name;	}
	public int getEnglishScore() {		
		  return englishScore;	}
	public int getMathScore() {		
		return mathScore;	}

	public String getGender() {
		return gender;
	}
	

	
	
	

}
