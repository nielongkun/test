package jvm;

public final class SingletonTest {
	static{
		System.out.println("SingletonTest init");
	}
	private SingletonTest(){};
	private static class LazyHolder{
		static{
			System.out.println("LazyHolder init");
		}
		static final SingletonTest singleton = new SingletonTest();
	}
	
	public static SingletonTest instance(){
		return LazyHolder.singleton;
	}
	public static void test(){
		System.out.println("test singletonTest");
	}
}
