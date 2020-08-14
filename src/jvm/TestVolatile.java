package jvm;

public class TestVolatile {
	
	volatile static boolean runn = true;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thr = new Thread(() -> {
			while(runn){
				
			}
		});
		thr.start();
		try {
			thr.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		runn = false;
	}

}
