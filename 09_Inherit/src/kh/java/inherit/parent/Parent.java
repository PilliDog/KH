package kh.java.inherit.parent;

public class Parent {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	private int num;
	
	public Parent() {}
	public Parent(String id, int num)
	{
		
	}
	
	
	
	public void say()
	{
		System.out.println("난 애비다.");
	}
	
	@Override
	public String toString() {
		return "id : " + id + ", num : " + num;
	}
}
