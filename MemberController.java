package board;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

	Scanner sc = new Scanner(System.in);
	ArrayList<Member> members = new ArrayList<>();
	
	void doCommand(String cmd) {
		if(cmd.equals("signup")) {
			Member member = new Member();

			System.out.println("아이디를 입력해주세요");
			member.setLoginId(sc.nextLine());

			System.out.println("비밀번호를 입력해주세요");
			member.setLoginPw(sc.nextLine());
			
			System.out.println("이름을 입력해주세요");
			member.setUserName(sc.nextLine());

			members.add(member);
		}
	}
}