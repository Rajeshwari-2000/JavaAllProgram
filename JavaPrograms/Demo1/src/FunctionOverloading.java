
public class FunctionOverloading {


	public static int add(byte x,byte y) {
		System.out.println("in add ---byte");
		return x+y;
	}
	
	public static long add(Integer x,Integer y) {
		System.out.println("in add ---Integer");
		return x+y;
	}
	public static Long add(Long x,Long y) {
		System.out.println("in add ---Long");
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(add(((byte)10),((byte)20))); 
		System.out.println(add(10,20));
		System.out.println(add(10l,20l)); 
	}

}


