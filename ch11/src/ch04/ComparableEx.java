package ch04;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {
	public static void main(String[] args) {
		TreeSet<Person>  treeSet = new TreeSet<>();
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("일지매", 25));
		treeSet.add(new Person("임꺽정", 31));
		
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
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		return this.age-o.age;//비교대상(o)의 값이크면 음수(앞), 같으면0, 비교대상값이 작으면 양수(뒤)
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}