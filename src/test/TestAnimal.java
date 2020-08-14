package test;

import java.io.IOException;

import model.Animial;
import model.Dog;
import model.Fish;

public class TestAnimal {
	//-XX: -UseCompressedOops
	//-XX: -UseCompressedClassPointers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animial a = new Dog();
		Animial b = new Fish();
		a.habit();
		b.habit();
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
