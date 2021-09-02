package vit.labs;

public class Lab6 {
	int Sweets;
	int Students;
	Lab6(int Sweets,int Students){
		this.Sweets = Sweets;
		this.Students = Students;
	}
	void distribute() {
		int result;
		result = this.Sweets/this.Students;
		System.out.println(result);
	}
	public static void main(String[] args) {
		Lab6 l1 = new Lab6(15,5);
		Lab6 l2 = new Lab6(10,0);
		try {
			l1.distribute();
			l2.distribute();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
