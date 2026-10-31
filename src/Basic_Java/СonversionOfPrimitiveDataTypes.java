package Basic_Java;



public class СonversionOfPrimitiveDataTypes {

	public static void main(String[] args) {
	    int k = 123;
		long l = k; // неявное приведение типов 
		
		int x = (int)l; // явное 
        System.out.println(x);
        
        float f = 123.1F;
        float f1 = (float)123.1;
        
        double d = 100.99;
        float fd = (float)d;
        
        double dl = 123.999;
        long ld = Math.round(dl);
        System.out.println(ld);
      
        byte t = (byte)128; // от -128 до 127
        System.out.println(t);
        
        
	}

}
