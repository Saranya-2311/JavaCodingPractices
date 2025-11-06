package mayPractise;

public class classDemo {
    public static void main(String[] args){
        Car carOne = new Car("Suzuki","Grey");
        Car carTwo = new Car("Kwid","Dark Green");
        carTwo.getCarDetails();;
        carOne.getCarDetails();
    }
}
class Car{

    String model;
    String color;
    Car(String model,String color){
        this.model = model;
        this.color = color;
    }
    public void getCarDetails(){
        System.out.println("mayPractise.Car Model = "+ model);
        System.out.println("mayPractise.Car Color = "+ color);
    }
}
