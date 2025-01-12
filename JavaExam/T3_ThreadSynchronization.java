class Pyramid {
	synchronized void draw(char ch) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

class A extends Thread {
	Pyramid p;

	A(Pyramid p1) {
		p = p1;
	}

	public void run() {
		p.draw('*');
	}
}

class B extends Thread {
	Pyramid p;

	B(Pyramid p1) {
		p = p1;
	}

	public void run() {
		p.draw('#');
	}
}

public class T3_ThreadSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramid pobj = new Pyramid();
		A a1 = new A(pobj);
		B b1 = new B(pobj);

		a1.start();
		b1.start();
	}

}
