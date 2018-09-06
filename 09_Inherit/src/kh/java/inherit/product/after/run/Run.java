package kh.java.inherit.product.after.run;

import java.util.Date;

import kh.java.inherit.product.after.model.vo.Desktop;
import kh.java.inherit.product.after.model.vo.SmartPhone;
import kh.java.inherit.product.after.model.vo.Television;

public class Run {

	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "S01234", "매직스테이션2", 2000000, new Date(), "Windows10", "어떤모니터", "어떤키보드", "어떤마우스");
		SmartPhone s = new SmartPhone("삼성", "gnote9", "갤럭시노트9", 1000000, new Date(), "안드로이드", "KT");
		Television t = new Television("LG", "lgtv01234", "엘지스마트tv", 1500000, new Date(), "UHD", 32);
		
		d.printInfo();
		s.printInfo();
		t.printInfo();
		
		//자식객체에서 부모클래스에 선언된 메소드를 사용하는것이 가능한가
		System.out.println(d.printProductInfo());
		
	}

}






