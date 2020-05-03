package polimorfismStatic;

public class Main {

	public static void main(String[] args) {
		Pasare pasare1 = new Pasare();
		Gaina pasare2 = new Gaina();
		Cocos pasare3 = new Cocos();
		Pui pasare4 = new Pui();

		pasare1.haveSomething("B");
		pasare1.haveSomething(true);
		System.out.println();
		pasare2.haveSomething(2);
		pasare2.haveSomething(3.5);
		pasare2.haveSomething("cod-co-dac!");
		System.out.println();
		pasare3.haveSomething(5.2);
		pasare3.haveSomething(2);
		pasare3.haveSomething("cu-cu-rigu!");
		System.out.println();
		pasare4.haveSomething(1.1);
		pasare4.haveSomething("pui-pui!");

	}
}
