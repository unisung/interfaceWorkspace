package ch03_reference;

public class Member {
 private String name;
 private String id;
 
 //�Ű����� 2��¥�� ������
public Member(String name, String id) {
	this.name = name;
	this.id = id;
}
//�Ű����� 1��¥�� ������
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
