package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import model.Tools;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<String,Map<Integer,Double>> a =new HashMap<String,Map<Integer,Double>>();
      Map<Integer,Double> b =new HashMap<Integer,Double>();
      Tools tool=new Tools();
      b.put(1, 2.0);
      b.put(2, 3.0);
      a.put("abc", b);
      System.out.println("----------------");
      Set<Map.Entry<Integer, Double>> tempSet = b
				.entrySet();
		for (Iterator<Map.Entry<Integer, Double>> it = tempSet
				.iterator(); it.hasNext();) {
			Map.Entry<Integer, Double> me = it.next();
			System.out.println(me.getKey()+"----"+me.getValue()/3);
			
		}

	}

}
