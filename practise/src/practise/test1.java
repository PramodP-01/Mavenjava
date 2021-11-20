package practise;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test1 methodchain = new test1();
		a1().a2().a3();

	}

	public static test1 a1() {
		System.out.println("hello");
		return new test1();
	}

	public test1 a2() {
		System.out.println("welcome");
		return new test1();
	}

	public test1 a3() {
		System.out.println("super");
		return new test1();
	}
}
