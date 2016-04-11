public class Hauler extends Vehicle{
  private int cargoSpace;
  private int fuelTank;
  
  public Hauler(Type type, int price, int passengers, String name, int cargoSpace, int fuelTank){
    super(type, price, passengers, name);
    this.cargoSpace = cargoSpace;
    this.fuelTank = fuelTank;
  }
  public int getCargoSpace(){return this.cargoSpace;}
  public int getFuelTank(){return fuelTank;}
  
  public void carDetails(){
    System.out.println("The " + this.name + " is a hauling truck that can handle " + this.cargoSpace + " cubic metres of cargo, and has a " + this.fuelTank + " fuel tank capacity.");
  }
  public void fullDetails(){
    System.out.println("Vehicle type: " + this.type);
    System.out.println("Vehicle price: " + this.price);
    System.out.println("Vehicle passengers: " + this.passengers);
    System.out.println("Vehicle name: " + this.name);
    System.out.println("Vehicle cargo capacity: " + this.cargoSpace + "m3");
    System.out.println("Vehicle fuel capacity: " + this.fuelTank + " gallons");
  }}
                                                
