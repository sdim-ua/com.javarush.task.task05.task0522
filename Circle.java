/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle() {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        
        this.x = x;
        this.y = y;
        this.radius =10;
        
      
    }

    public Circle() {
        this(5, 5, 1);
}
    
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
}

   

    public static void main(String[] args) {

    }
}
