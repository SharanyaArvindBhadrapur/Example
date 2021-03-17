class LogicGates{
	// ...example: function(int ...a)
	int or_gate(int in1, int in2){
		 int a,b;
		 a = in1;
		 b = in2;
		 int ans;

		 int or_ans;

		 or_ans = a|b;
		 return or_ans;
	}

	int nor_gate(int in1, int in2){
		 int a,b;
		 a = in1;
		 b = in2;
		 int ans;

		 int nor_ans;
		 if(a==0 && b==0)
		 	nor_ans = 1;
		 else
		 	nor_ans = 0;

		 return nor_ans;

	}

	public static void main(String[] args) {
		int a,b;
		a=0;
		b=0;

		LogicGates lg = new LogicGates();
		System.out.println("a "+ "OR "+"b ="+lg.or_gate(a,b));
		System.out.println("a "+ "NOR "+"b ="+lg.nor_gate(a,b));

		
	}
}