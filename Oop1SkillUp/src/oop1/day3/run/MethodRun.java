package oop1.day3.run;

import oop1.day1.animal.Animal;
import oop1.day3.method.sample.MethodSample1;

public class MethodRun {

	public static void main(String[] args) {
		MethodSample1 ms1 = new MethodSample1();
		ms1.method1();
		ms1.method2("박광준");
		ms1.method3("박광준", 29);
		ms1.method3("박광준", "박광준", "박광준");
		ms1.method3(new Animal());
		System.out.println(ms1.method4());
		System.out.println(ms1.method4(3, 5));
		System.out.println(ms1.method4(new Animal()));
	}

}
