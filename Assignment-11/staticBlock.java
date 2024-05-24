// Write a program which has a static block and constructor 

public class staticBlock {

	public String name;
	public int age;

	public staticBlock() {
		System.out.println("No arg constructor");
	}

	public staticBlock(int age) {
		super();
		this.age = age;
	}

	public staticBlock(String name) {
		super();
		this.name = name;
	}

	public staticBlock(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StaticBlock [name=" + name + ", age=" + age + "]";
	}

	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		staticBlock block = new staticBlock(20);
		System.out.println(block.age);
		staticBlock block2 = new staticBlock("Kohli");
		System.out.println(block2.name);
		staticBlock block3 = new staticBlock("Mahi", 30);
		System.out.println(block3.toString());
	}
}
