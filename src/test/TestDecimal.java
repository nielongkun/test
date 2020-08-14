package test;

import java.math.BigDecimal;

public class TestDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a = 1.23;
		
		BigDecimal decimal = new BigDecimal("1.1223454");
        System.out.println(decimal);
        BigDecimal setScale = decimal.setScale(6,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(setScale);
        int i = 0;
        int x = 0;
        while(i <10){
        	x = x++;
        	i++;
        }
        System.out.println("x:"+x);
	}

}
