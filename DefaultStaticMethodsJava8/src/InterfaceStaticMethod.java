
interface interf{
	
	public static void m1() {
		System.out.println("Interface Static Method");
	}
}

public class InterfaceStaticMethod implements interf{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interf.m1();

	}

}



//===================

//   If I create object of class then also it will not call Inteface Static Method
//   A Class cannot implement static interface method which implements that interface also
//   Interface Static Method cannot be called by direct Class name ex.Test.m1()