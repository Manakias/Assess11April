public class Vehicle{
  public enum Type{CAR,VAN,TRUCK};
  public Type type;
  public int price;
  public int passengers;
  public String name;
  
  public Vehicle(Type type, int price, int passengers, String name){
    this.type = type;
    this.price = price;
    this.passengers = passengers;
    this.name = name;
  }
  public Type getType(){return this.type;}
  public int getPrice(){return this.price;}
  public int getPassengers(){return this.passengers;}
  public String getName(){return this.name;}
  
  public void carDetails(){System.out.println("The " + this.name + " is a " + this.type + " that can hold " + this.passengers + " people.");}
}
        
