public class SportCar extends Vehicle {
  
  public enum driveUnit{BACK, FRONT, BOTH};

    private driveUnit unit;
    private int carSpeed;
    private int numberSeats;
    
      public SportCar(Type type, int passengers, int price, String name, int carSpeed, int numberSeats, driveUnit unit){
      super(type, passengers, price);
      this.carSpeed = carSpeed;
      this.numberSeats = numberSeats;
      this.unit = unit;
      }
      
      public void carDetails() {
      System.out.println("This is " + this.type + " with " + this.numberSeats " and speed" + this.speed); 
      } 
      
      public void fullcarDetails() {
      System.out.println("This is " + this.type + " With " + this.passengers + " passengers " + " price " + this.price + " name " + this.name + " speed " + this.carSpeed + " number of Seats " + this.numberSeats + "and drive unit is" + this.unit); 
    }