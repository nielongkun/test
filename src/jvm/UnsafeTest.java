package jvm;

import java.io.IOException;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class UnsafeTest {
	public static final long  _1GB = 1024*1024*1024;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unsafe unsafe = getUnsafe();
		try {
		System.out.println("分配内存");
		long base = unsafe.allocateMemory(_1GB);
		System.in.read();
		System.out.println("释放内存");
		unsafe.freeMemory(base);
		System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static  Unsafe getUnsafe(){
		Unsafe unsafe =null;
		try {
			Field f = Unsafe.class.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			unsafe = (Unsafe) f.get(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return unsafe;
		
	} 

}
