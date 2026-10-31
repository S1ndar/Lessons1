package Enumeration;

public enum Season {
   SUMMER(+30), WINTER(-30), AUTUMN(+15), SPRING(+15);
// 0            1            2            3          индексы	
   private int temperature;
   Season(int temperature) {
	   this.temperature = temperature;
   }
   
   public int getTemperature() {
	   return temperature;
   }
}

/*SUMMER, WINTER, AUTUMN, SPRING это объекты класса (enum) Season, причем все константы (public static final)
 *Это тоже самое если бы мы делали так:
 *Season SUMMER = new Season;
 *Season WINTER = new Season;
 *Season AUTUMN = new Season;
 *Season SPRINT = new Season;
 *Но это долго, вот зачем нужен Enum
 */