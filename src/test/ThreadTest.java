package test;

import model.ThreadModel;

public class ThreadTest {
	
public static void main(String[] args) {
	ThreadModel tm = new ThreadModel("tr");
	ThreadModel tm1 = new ThreadModel("tr1");
	ThreadModel tm2 = new ThreadModel("tr2");
	ThreadModel tm3 = new ThreadModel("tr3");
	int s=0;
	Thread tr = new Thread(tm);
	Thread tr1 = new Thread(tm1);
	Thread tr2 = new Thread(tm2);
	Thread tr3 = new Thread(tm3);
	tr.start();
	tr1.start();
	tr2.start();
	tr3.start();
}
}
