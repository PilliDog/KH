package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {

	public static void main(String[] args) {
		
		Member engine = new Member();
		
		engine.setMemberId("kjun815");
		engine.setMemberPwd("1234");
		engine.setMemberName("박광준");
		engine.setAge(29);
		engine.setGender('남');
		engine.setPhone("01045082267");
		engine.setEmail("kjun815@hanmail.net");
		
		String info = engine.getMemberId() + "\n"
					+ engine.getMemberPwd() + "\n"
					+ engine.getMemberName() + "\n"
					+ engine.getAge() + "\n"
					+ engine.getGender() + "\n"
					+ engine.getPhone() + "\n"
					+ engine.getEmail() + "\n";
		
		System.out.println(info);
		

	}

}
