package com.oop.method.nonstatic.run;

import com.oop.method.nonstatic.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample engine = new NonStaticSample();
		
		engine.printLottoNumbers();
		System.out.println();
		System.out.println();
		
		
		NonStaticSample engine2 = new NonStaticSample();
		
		engine.outputChar(5, 'a');
		System.out.println();
		System.out.println();
		
		NonStaticSample engine3 = new NonStaticSample();
		
		System.out.println(engine.alphabet());
		System.out.println();
		System.out.println();
		
		NonStaticSample engine4 = new NonStaticSample();
		
		System.out.println(engine.mySubstring("안녕하세요", 0, 1));

	}

}
