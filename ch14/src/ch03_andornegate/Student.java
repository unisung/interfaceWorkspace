package ch03_andornegate;

public class Student {
  private int sno;
  private String name;
  private int score;
  
public Student(int sno, String name, int score) {
	this.sno = sno;
	this.name = name;
	this.score = score;
}

public int getSno() {
	return sno;
}

public String getName() {
	return name;
}

public int getScore() {
	return score;
}

//논리적 동등 - hashcode & equals()
@Override
public int hashCode() {
	return sno;
}

@Override
public boolean equals(Object obj) {
	return this.sno==((Student)obj).getSno();
}
  

  
}
