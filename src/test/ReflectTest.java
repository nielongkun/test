package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.omg.CORBA.portable.InvokeHandler;

import model.Dog;

public class ReflectTest {
	public static void methodInvoke(Object obj,String methodName,String[] args){
		Class<?> objClass=obj.getClass();
	try {
			Method method1=objClass.getMethod(methodName, String.class,String.class);
			method1.invoke(objClass.newInstance(), args);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       try {    	   
		Class<Dog> clazz=(Class<Dog>)Class.forName("model.Dog");
		/*Constructor con= clazz.getConstructor();
		Dog dog1=(Dog) con.newInstance();*/
		//Dog dog2=(Dog) Class.forName("model.Dog").getConstructor().newInstance();
		String name ="天天";
		String food ="骨头";
		String[] param={name,food};
		String[] methodName={"feed","play"};
		/*for(int i=0;i<methodName.length;i++){
			String methodname1=methodName[i];
			methodInvoke(dog1, methodname1,param);
		}*/
		
		//dog1.feed(name);
		Method method1= clazz.getMethod("feed", String.class,String.class);
		method1.invoke(clazz.newInstance(), name,food);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	}
	
}
