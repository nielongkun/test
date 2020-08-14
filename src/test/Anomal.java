package test;

import java.util.ArrayList;
import java.util.List;

import model.Dog;

public class Anomal extends Dog{
	
	public static void main(String[] args) {
		List<Dog> list = new ArrayList<Dog>();
		Dog dog = new Dog();
		for (int i = 0; i < 5; i++) {
			dog.setFood("food"+i);
			list.add(dog);
		}
		System.out.println(list.toString());
	}
	
}
