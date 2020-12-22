package ch04;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {
	public static void main(String[] args) {
		TreeSet<Person>  treeSet = new TreeSet<>();
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("������", 25));
		treeSet.add(new Person("�Ӳ���", 31));
		
		Iterator<Person> it=treeSet.iterator();
		while(it.hasNext()) {
			 Person person=it.next();
			 System.out.println(person);
		}
		
	}

}

class Person implements Comparable<Person>{
	String name;
	int age;
	//������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		return this.age-o.age;//�񱳴��(o)�� ����ũ�� ����(��), ������0, �񱳴���� ������ ���(��)
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}