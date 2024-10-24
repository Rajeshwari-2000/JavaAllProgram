package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		
				Map<String,Integer> hm=new HashMap<>();
				hm.put("DAC", 240);
				hm.put("DBDA", 60);
				hm.put("DTISS", 65);
				
				Set<String> ks=hm.keySet();  
				for(String s:ks) {
					System.out.println(s+"----->"+hm.get(s));
				}
				
			    Set<Map.Entry<String,Integer>> es=hm.entrySet(); 
			    for(Map.Entry<String,Integer> m:es) {
			    	System.out.println(m.getKey()+"---->"+m.getValue());
			    }
			    
			    
			    System.out.println("DAC students"+hm.get("DAC"));
			
			    System.out.println("DVLSI students " +hm.get("DVLSI"));
				
			    for(String s:ks) {
			    	if(hm.get(s)>62) {
			    		System.out.println(s+"---->"+hm.get(s));
			    	}
			    }
			    System.out.println("check key exists DBDA : "+hm.containsKey("DBDA"));
			    if(!hm.containsKey("DBDA"))
			    	hm.put("DBDA", 100);
			    else 
			    	System.out.println("Duplicate key");
			    
			    hm.remove("DBDA"); 
			   
			    
			    
			

	}

}
