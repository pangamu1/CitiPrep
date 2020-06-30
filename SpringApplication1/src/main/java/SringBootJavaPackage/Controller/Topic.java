package SringBootJavaPackage.Controller;

public class Topic {
	
	private String name;
	private int num;
	private String pos;
	
	public Topic() {
		
	}
	
	public Topic(String name, int num, String pos) {
		super();
		this.name = name;
		this.num = num;
		this.pos = pos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

}
