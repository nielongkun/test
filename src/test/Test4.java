package test;



import java.util.ArrayList;
import java.util.List;

import model.Meiju;
import model.TrafficLight;

public class Test4 {
    public static String aa(String nn){
    	nn = "22222";
    	return nn;
    }
    public void path1(){
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nn = " 1111  ";
		String aa = "11111_22222_3333,11111_22222_4444,11111_22222_5555";
		String bb = "11111_22222";
		String cc = "11111";
		//测试拼接字符串
		String dd = "a','b','c";
		String ee = "a";
		String[] sp2 =null;
		if(!dd.isEmpty()){
			sp2 =ee.split("','");
		}
		 
		String[] sp3 = ee.split("','");
		for(int i=0;i<sp2.length;i++){
			String k = sp2[i];
			System.out.println("sp2拼接："+k);
		}
		System.out.println("sp3拼接："+sp3[0]);
		String[] sp1 = aa.split(",");
		Long a = System.currentTimeMillis();
		
		//String kk1 = kk.substring(0, kk.indexOf("."));
		System.out.println(a);
//		Double bb = Double.parseDouble(kk);
		
		System.out.println(bb);
	}
	
}
