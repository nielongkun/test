package test;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "('a'='b'),('c'='d')";
		String[] str1 = str.split(",");
		String str2 = "";
		for(int i = 0;i <str1.length; i++){
		  String a = str1[i].replaceAll("\\(", "").replaceAll("\\)", "");
		  String a1 = a.substring(0, a.indexOf("="));
		  String a2 = a.substring(a.indexOf("=")+1);
		  str2 += a1+",";
		  System.out.println(a1+":"+a2);
		}
		System.out.println(str2);
	}

}
