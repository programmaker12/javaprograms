package WrapperClass;

public class AllDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 20;
		short s = 10;
		int i = 5;
		float f = 60.0F;
		double d = 50.0D;
		char c = 'a';
		boolean b2 = true;
		
		// Coverting datatypes into wrapper classes
		 
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean booleanobj = b2;
		
		System.out.println(byteobj+" "+ shortobj+" "+ intobj+" "+ floatobj+" "+ doubleobj +" "+charobj
				+" "+booleanobj);

	}

}

