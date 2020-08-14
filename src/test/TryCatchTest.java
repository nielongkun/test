package test;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest c = new TryCatchTest();
		c.method();
	}
	public void method(){
		try{
			System.out.println("A");
			int i = 10/0;
			System.out.println("B");
		}catch(Exception e){
			System.out.println("C");
		}finally{
			System.out.println("D");
		}
		
	}
}
