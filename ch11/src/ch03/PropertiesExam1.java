package ch03;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesExam1 {
	public static void main(String[] args) {
		//키=값 형태로 저장, 키,값 모두  String타입
		Properties props = new Properties();
	    props.put("driver", "jdbc.oracle.Driver");	
	    props.put("url", "jdbc:oracle:thin@localhost:1521:xe");
	    props.put("user", "scott");
	    props.put("password", "tiger");
	    
	    Set<String> keySet = (Set)props.keySet();
	    Iterator<String> it=keySet.iterator();
	    
	    while(it.hasNext()) {
	    	  String key=it.next();
	    	  System.out.println(key+":"+props.get(key));
	    }
	    
	    
	}
}
