package q02_advanced.question02;

import java.util.List;

class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int Id, String newPassword) {
		boolean update = false;

		for (Member member : members) {
			if (member.getId() == Id) {
				member.setPassword(newPassword);
				update = true;
				break;
			}
		}

		if (!update) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
