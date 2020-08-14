package test;

public class MyThead extends Thread {
	private String name;
	
	public MyThead(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		tt1("1",name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThead mt = new MyThead("线程1");
		MyThead mt1 = new MyThead("线程2");
		mt.start();
		mt1.start();
	}
	public void tt1(String a,String name){
		for (int i = 0; i <10; i++) {
			a+="1";
			tt2(a,name);
		}
	}
	public static void tt2(String b,String name){
		System.out.println(name+":"+b);
	}	

}
