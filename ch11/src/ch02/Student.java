package ch02;


class Student extends Object{
	
	private int sno;
	private String name;
	private int score;
	
	@Override
	public int hashCode() {
		return sno+name.hashCode();//String��ü�� ������ ������ hash�ڵ尪 ����
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		return this.sno==((Student)obj).sno && this.name.equals(((Student)obj).name);
		}
		return false;
	}
	
	//������
	public Student(int sno, String name, int score) {
		super();
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	
}