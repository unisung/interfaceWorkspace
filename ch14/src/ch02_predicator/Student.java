package ch02_predicator;

public class Student {
	private String name;//�л���
	private int englishScore;//�����
	private int mathScore;//���м���
	private String gender;//����
	
	//�Ű����� �ִ� ������
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



	//get �޼ҵ�
	public String getName() {return name;	}
	public int getEnglishScore() {		
		  return englishScore;	}
	public int getMathScore() {		
		return mathScore;	}

	public String getGender() {
		return gender;
	}
	

	
	
	

}
