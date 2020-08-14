package jvm;

import java.lang.ref.SoftReference;

public class StringTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1 = "a";
		String s2 = "b";
		String s3 = "ab";
		String s4 = s1+s2;
		String s5 = "a"+"b";
		String s6 = s3.intern();
		System.out.println(s3==s4?"true":"false");		//false
		System.out.println(s3==s5?"true":"false");		//true
		System.out.println(s3==s6?"true":"false");		//true
		System.out.println(s4==s5?"true":"false");		//false
*/		
		String s1 = "a";
		String s2 = "b";
		String s4 = s1+s2;
		String s6 = s4.intern();
		String s3 = "ab";
		String s5 = "a"+"b";
		
		
		System.out.println(s3==s4?"true":"false");		//true
		System.out.println(s3==s5?"true":"false");		//true
		System.out.println(s4==s6?"true":"false");		//true
		System.out.println(s4==s5?"true":"false");		//true
		
	}

}
