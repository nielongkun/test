package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import model.Animial;
import model.Dog;
import model.Fish;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试反射机制
		Fish f = new Fish();
		Class<? extends Fish> class1 = f.getClass();
		Class class2 = Dog.class;
		System.out.println("class1:"+class1.getName());
		System.out.println("class2:"+class2.getName());
		try {
			Class c = Class.forName(class2.getName());
			Object o = c.newInstance();
			Method m = c.getMethod("habit1",String.class);
			m.invoke(o,"骨头");
			/*Animial an = (Animial) c.newInstance();
		    an.habit();*/
			Field[] fs = c.getDeclaredFields();
            for(Field field:fs){  
                System.out.println("获得属性的修饰符，例如public，static等等 >>"+Modifier.toString(field.getModifiers()));
                System.out.println("属性的类型的名字 >>"+field.getType());
                System.out.println("属性的名字 >>"+field.getName());
            }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
