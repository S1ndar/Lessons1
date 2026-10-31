package InnerClass;

public class Car {
       private int id;
       
       private class Motor{ // 1.Нестатический(приватный), имеют доступ к полям объекта 
    	   public void startMotor(){                   
    		   System.out.println("Motor of car number "+id+" is starting");
    	   }
       } // Нужны для того, чтобы разложить основной класс на объекты(подклассы)
       
       public static class Battery{ // 2.Статический, не имеет доступа к нестатическим полям объекта(в остальном Battery и Car никак не связаны)
    	   public void charge() {  
    		   System.out.println("Battery is charging");
    	   }
       } // 
       public Car(int id){
    	   this.id = id;
	   }
       public void start() {
    	   Motor motor = new Motor(); //1.
    	   motor.startMotor();
    	   
    	   System.out.println("Car "+id+" is staring");
    	   final int x = 1;
    	   class SomeClass{// 3.В методе, имеет доступ и к полям объекта, и к переменным константам внутри метода
    		   public void someMethod(){
    			   System.out.println(x);
    			   System.out.println(id);
    		   }
    	   }
    	   SomeClass Someclass = new SomeClass();
    	   
       }
       // Motor часть машины, а Battery нет
       
       public void test(Object object) {
    	 
       }
}
