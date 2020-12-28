package ch03_reference;

public class Member {
 private String name;
 private String id;
 
 //매개변수 2개짜리 생성자
public Member(String name, String id) {
	this.name = name;
	this.id = id;
}
//매개변수 1개짜리 생성자
public Member(String id) {
	this.id = id;
}



public String getName() {
	return name;
}

public String getId() {
	return id;
}
 

 
}
