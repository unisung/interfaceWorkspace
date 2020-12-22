package ch03;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {
public static void main(String[] args) {
	
	//key기준으로 오름차순 정렬
	TreeMap<Integer,String> scores=new TreeMap<>();
	
	scores.put(new Integer(87), "홍길동");
	scores.put(new Integer(98), "일지매");
	scores.put(75, "임꺽정");
	scores.put(95, "김길동");
	scores.put(80,"강길동");
	
	Set<Integer> keys = scores.keySet();
	Iterator<Integer> it = keys.iterator();
	while(it.hasNext()) {
		int key=it.next();
		System.out.println(key+":"+scores.get(key));
	}
	
	
}
}
