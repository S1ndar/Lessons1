package Basic_Java;

public class Break_Continue {

	public static void main(String[] args) {
		int y = 0;
		while(true) {
			if(y == 10) {
				break;
			}
			System.out.println(y);
			y++;
			
		}
        System.out.println("Вы вышли из цикла");
        
        for(int i = 0; i < 10; i++) {
        	if(i%2==0) {
        		continue;
        	}
        	System.out.println("Это нечетное число "+i);
        }
        
        
	}

}
