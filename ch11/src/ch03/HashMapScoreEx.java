package ch03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> score
		=new HashMap<>();
		
		//점수저장
		score.put("김성동", 97);
		score.put("황기태", 88);
		score.put("김남윤", 98);
		score.put("이재문", 70);
		score.put("한원선", 99);
		
		System.out.println("전체 등록 갯수:"+score.size());
		
        //점수 출력
		Set<String> keys=score.keySet();
		Iterator<String> it=keys.iterator();
		
		int sum=0;
		while(it.hasNext()) {
			String name=it.next();
			int s=score.get(name);
			sum+=s;
			System.out.println(name+":"+s);
		}
		
		System.out.println("총점:"+sum);
		System.out.println("평균:"+sum/score.size());
	}

}
