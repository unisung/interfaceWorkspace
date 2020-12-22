package ch03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> score
		=new HashMap<>();
		
		//��������
		score.put("�輺��", 97);
		score.put("Ȳ����", 88);
		score.put("�賲��", 98);
		score.put("���繮", 70);
		score.put("�ѿ���", 99);
		
		System.out.println("��ü ��� ����:"+score.size());
		
        //���� ���
		Set<String> keys=score.keySet();
		Iterator<String> it=keys.iterator();
		
		int sum=0;
		while(it.hasNext()) {
			String name=it.next();
			int s=score.get(name);
			sum+=s;
			System.out.println(name+":"+s);
		}
		
		System.out.println("����:"+sum);
		System.out.println("���:"+sum/score.size());
	}

}
