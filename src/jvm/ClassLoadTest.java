package jvm;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

public class ClassLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?> aclass = Class.forName("model.TestLoad");
			System.out.println(aclass.getClassLoader());
			ServiceLoader<FileSystemProvider> sl= ServiceLoader.load(java.nio.file.spi.FileSystemProvider.class);
			Iterator<FileSystemProvider> it = sl.iterator();
			System.out.println(sl);
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
