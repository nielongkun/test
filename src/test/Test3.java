package test;

import java.util.HashMap;
import java.util.Map;

import model.DatePreProcess;
import model.SETool;
import model.Shadowcut;
import model.Tools;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Map<Integer,Double>> a =new HashMap<String,Map<Integer,Double>>();
		Map<String,Map<Integer,Double>> a1 =new HashMap<String,Map<Integer,Double>>();
		Map<String,Map<Integer,Double>> a2 =new HashMap<String,Map<Integer,Double>>();
		Map<String,Map<Integer,Double>> a3 =new HashMap<String,Map<Integer,Double>>();
		Map<String,Map<String,Integer>> a4 =new HashMap<String,Map<String,Integer>>();
	      Map<Integer,Double> b =new HashMap<Integer,Double>();
	      Map<Integer,Double> c =new HashMap<Integer,Double>();
	      Map<Integer,Double> g =new HashMap<Integer,Double>();
	      Map<String,Map<Integer,Double>> d =new HashMap<String,Map<Integer,Double>>();
	      Map<String,Integer> g1 = new HashMap<String,Integer>();
	      g1.put("a1", 1);
	      g1.put("a2", 2);
	      g1.put("a", 3);
	      Tools tool=new Tools();
	      b.put(1, 1.0);
	      b.put(2, 2.0);
	      c.put(1, 3.0);
	      c.put(2, 4.0);
	      c.put(3, 5.0);
	      g.put(1, 1.0);
	      g.put(2, 7.0);
	      a.put("abc", b);
	      a.put("bcd", c);
	      a.put("cde", g);
	      a1.put("a11", b);
	      a1.put("a12", c);
	      a2.put("a21", c);
	      a2.put("a22", g);
	      a3.put("a31", b);
	      a3.put("a32", g);
	      a4.put("a41", g1);
////	    Test t2= new Test();
////	    Map<String,Map<Integer,Double>> e=t2.Usecen(a);
////	    System.out.println(e.toString());
//	    Shadowcut sc =new Shadowcut();
//	    d =sc.Usesh(a, 0.1, 9);
//	    System.out.println("----------");
//	    System.out.println(d.toString());
		
		DatePreProcess datePre = new DatePreProcess();
		String k = datePre.fixedWidthIntegertoSpace("ssss", 5);
		System.out.println(k);
		System.out.println("-------------------");
		SETool setool = new SETool(a4, a, a1, a2);
		Map<String,Map<Integer,Double>> kk =setool.SelectFileAlgorithmIncreasePhi(2.0, 3.0, 0.5);
		System.out.println(kk.toString());
	    
	}

}
