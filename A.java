class A{
	int a=10;
	int b=20;
	void display(){
		System.out.println("a "+a);
	}
}

class Amain{
	public static void main(String args[]){
		String a[] = {"Hello", "World"};
		A obj = new A();
		Amain Am = new Amain();
		obj.display();
		Am.main(a);
		System.out.println(args[0]);

	}
}