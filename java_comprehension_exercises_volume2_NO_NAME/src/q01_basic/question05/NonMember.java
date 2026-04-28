package q01_basic.question05;

public class NonMember extends AbstMember {

	public NonMember(String name) {
		this.name = name;
	}

	public void buyItem() {
		System.out.println(name + " purchased the item at a fixed price");
	}

	public void showMember() {
		System.out.println(name + "is a non-member");
		System.out.println("*****************");
	}
}
