package model;

public class ThreadModel implements Runnable{

	private String name;
	private static Object lock = new Object();
	public ThreadModel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int s = 0;
		
			for(int i = 0;i<10;i++){
				System.out.println("线程"+getName()+":"+i);
			}
		
		
		}
	}


