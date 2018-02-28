package petrolstation;

public class Station {
  String name;
  int gasAmount = 1000;

  public void refill(String car) {
    Car car1 = new Car(car);
    gasAmount -= car1.capacity;
    car1.gasAmount = car1.capacity;
    System.out.println(this.gasAmount + " " + car1.gasAmount);
  }

  public static void main(String[] args) {
    Station station = new Station();
    station.refill("auto");
    System.out.println(station.gasAmount);
  }
}
