package ch02_function;

public class Student {
	private String name;//�л���
	private int englishScore;//�����
	private int mathScore;//���м���
	
	//�Ű����� �ִ� ������
	public Student(String name, int englishScore,
			int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	//get �޼ҵ�
	public String getName() {return name;	}
	public int getEnglishScore() {		
		  return englishScore;	}
	public int getMathScore() {		
		return mathScore;	}
	

	
	
	

}
