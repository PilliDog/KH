package member.run;

import member.controller.MemberManager;
import member.model.vo.Gold;
import member.model.vo.Ruby;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class Run {

	public static void main(String[] args) {
		MemberManager mgr = new MemberManager();
		
		mgr.insertMember(new Silver("홍길동", "Silver", 1000));
		mgr.insertMember(new Silver("고길동", "Silver", 2000));
		mgr.insertMember(new Silver("홍동민", "Silver", 3000));
		mgr.insertMember(new Gold("김회장", "Gold", 1000));
		mgr.insertMember(new Gold("이회장", "Gold", 2000));
		mgr.insertMember(new Gold("오회장", "Gold", 3000));
		mgr.insertMember(new Vip("최순실", "Vip", 10000));
		mgr.insertMember(new VVip("박근혜", "VVip", 100000));
		mgr.insertMember(new Ruby("문재인", "Ruby", 500000));
		System.out.print("========== 정보출력 ==========\n"
					   + "이름  등급  포인트  이자포인트\n");
		mgr.printData();
		
		
	}
	
	

}
