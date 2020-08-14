package jvm;

public class TestJMM {
	static int num = 0;
	static Object obj = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(() ->{
			for(int i = 0 ; i < 5000 ; i++){
				synchronized (obj) {
					num++;
					}
				/*num++;*/
				
			}
		});
		Thread th2 = new Thread(() ->{
			for(int i = 0 ; i < 5000 ; i++){
				synchronized (obj) {
					num--;
					}
				/*num--;*/
			}
		});
		
		th1.start();
		th2.start();
		
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(num);
	}

}
