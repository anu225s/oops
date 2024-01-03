package oops;

public class Demoobject {

	public static void main(String[] args) {
		
		System.out.println("this is main method");
		parent p1=new parent();
		p1.cash();
		p1.mony();
	
		
		child1 c1=new child1();
		c1.gold();
		c1.cash();
		c1.mony();
		
		
		
	}

}

class parent {
	
	public void cash() {
		System.out.println(" paranet cash property");
		
	}
	public void mony() {
		System.out.println(" paranet money property");
		
	}
	
	}
class child1 extends parent {
	public void gold() {
		System.out.println(" Child property -Gold");
	}
}