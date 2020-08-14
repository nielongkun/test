package test;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("张三");
		list.add(1234);
		int k = (int) list.get(1);
		System.out.println("1:"+list.get(0)+",2:"+k);
	}

}
