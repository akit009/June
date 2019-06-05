package Rwatch.Rwatch;

  class Example extends AbstractExample implements InterfaceExample{
	 public void test() {
		 System.out.println("test abstract");
	 }
 
	 public static void main(String[] args) {
	 
		 InterfaceExample x= new Example();
		 x.run();
		 AbstractExample a= new Example();
		 a.test();
	 

}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}
  }