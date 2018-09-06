package kh.java.operator;

public class Operator {

	public static void main(String[] args) {
		
		//o 변수에는 Operator의 주소값이 들어있다.
		Operator o = new Operator();
		
		//단항 연산자
		//o.test1();
		//o.test1_();
		//o.test2();
		//o.test3();
		//o.test4();
		//o.test5();
		//o.test6();
		o.test7();
	}
	
	public void test1() {
		
		System.out.println("1. 부호 연산자");
		byte a = 5;
		short b = -9;
		System.out.println(+a);//5
		System.out.println(-b);//9
		
		
		
		System.out.println("2. 증감연산자");
		int c = 7;
		long d = 3L;
		float e = 6.2F;
		double f = 7.3;
		
		c++;
		d++;
		e--;
		f--;
		
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		
		
		
		int k = 10, l = 20;
		//1. 전위증감연산자 ++k, --k
		System.out.println("++k : " + ++k);
		System.out.println("k : " + k);
		
		
		//2. 후위증감연산자 l++, l--
		//인접한 연산을 마친 후에 1이 증감한다.
		System.out.println("l++ : " + l++);
		System.out.println("l : " + l);
		
		System.out.println(l++ + l); 
		System.out.println("l : " + l);
	}
	
	
	public void test1_() {
		
		int x = 10;
		int y = 10;
		
		int z = ++x; //z = 11
		
		System.out.println("z : " + z); // 11
		System.out.println("x : " + x); // 11
		
		z = y++; // z = 10
		System.out.println("z : " + z); // 10 
		System.out.println("y : " + y); // 11
		
		x = 20;
		z = x++; // z = 20
		System.out.println("z : " + z); // 20
		System.out.println("x : " + x); // 21
		
		
		int a = 10;
		int b = a++; // b = 10
		System.out.println(a + b++ ); // 21, b = 11
		System.out.println("b : " + b); // 11
		
		int c = 20;
		int d = c++ + c; //d = 41? ,  c = 21
		System.out.println("c : " + c); // 21
		System.out.println("d : " + d); // 41?
		
	}
	
	
	//논리부정 연산자
	public void  test2() {
		
		boolean bool = true;
		bool = !bool;
				
		System.out.println("bool : " + bool); // false
		System.out.println("!!!!!!!!!!!!bool : " + !!!!!!!!!!!!bool); // false
		
	}
	
	
	//이항연산자, 산술연산자
	public void test3() {
		int a = 10;
		int b = 20;
		int c = 0;
		
		c = a * b;
		System.out.println("c : " + c);
		
		c = a / b; //int와 int의 연산은 결과 int다. 따라서 정수 '0'만 들어간다. (몫만 봄)
		System.out.println("c : " + c); // 0
		
		c = a % b;
		System.out.println("c : " + c); // 10
		
	}
	
	
	public void test4() {
		
		int a = 3;
		int b = 50;
		int c = 11;
		boolean bool = (a==b);
		
		System.out.println("bool : " + bool); // false
		
		bool = (a != b);
		System.out.println("bool : " + bool); // true
		
		bool = (a < b); //lt로도 표기함
		System.out.println("bool : " + bool); // true
		
		bool = (a > b); //gt로도 표기함
		System.out.println("bool : " + bool); // false
		
		bool = (a <= b); //le로도 표기함
		System.out.println("bool : " + bool); // true
		
		bool = (a >= b); //ge로도 표기함
		System.out.println("bool : " + bool); // false
		
		
		char ch = 'A';
		System.out.println(a + b + c < ch); //true 
		//a = 3, b = 50, c = 11, ch = 65
		
	}
	
	
	//논리비교 연산자
	public void test5() {
		
		int a = 1;
		int b = 1;
		
		//&&(and) 좌항이 true일때
		System.out.println(a > 0 && ++b > 0); //true
		System.out.println("a : " + a + ", b : " + b); //false
		
		a = 1;
		b = 1;
		//&&(and) 좌항이 false일때
		System.out.println(a < 0 && ++b > 0); //false
		System.out.println("a : " + a + ", b : " + b); //false
		
		
		a = 1;
		b = 1;
		//||(or) 좌항이 false일때
		System.out.println(a < 0 || ++b > 0); //true
		System.out.println("a : " + a + ", b : " + b);
		
		
		a = 1;
		b = 1;
		//||(or) 좌항이 true일때
		System.out.println(a > 0 || ++b > 0); //true
		System.out.println("a : " + a + ", b : " + b); // 1, 1
		
	}
	
	public void test6() {
		
		int a = 5;
		int b = 7;
		//(조건식)?(참일때 값_true일때 넣고) : (거짓일때 값_false일때 넣어) >> 이건 값만 처리할 수 있다.
		a = (a > b)?0:100;
		System.out.println("a : " + a + ", b :  " + b);
		
		
		a = 5;
		b = 7;
		//이중삼항연산자
		a = a > b ? 0 : (a == 5 ? 200 : a + b);
		System.out.println("a : " + a + ", b :  " + b);

	}
	
	
	//복합대입연산자
	public void test7() {
		
		int a = 15;
		a = (a + 10);
		a += 10;
		System.out.println("a : " + a); //35
		
		a = (a - 10);
		a -= 10;
		System.out.println("a2 : " + a); //15
		
		//a = (a * 10);
		a *= 10;
		System.out.println("a3 : " + a); //150
		
		a /= 10;
		System.out.println("a : " + a); //15
		
		a %= 10;
		System.out.println("a : " + a); //5
		
	}

}
