import java.awt.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Car[] cars = {
            new Car("Toyota", "Blue", 2010),
            new Car("Honda", "Red", 2015),
            new Car("Ford", "Green", 2012),
            new Car("Chevrolet", "Black", 2018)
        };


        // bubble sort task 1
        for(int i=0;i<cars.length;i++){
            for(int j=0;j<cars.length-1;j++){
                if(Car.yearComparator.compare(cars[j], cars[j+1])>0){
                    Car temp = cars[j];
                    cars[j]=cars[j+1];
                    cars[j+1]=temp;

                }
            }
        }
        System.out.println("Sorted by year:");
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getColor() + " " + car.getYear());
        }

        Arrays.sort(cars, Car.complexComparator);

        // print the sorted array
        System.out.println("Sorted by brand, color, and year:");
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getColor() + " " + car.getYear());
        }
        
        //TODO  2 types of sort (Selection , insertion );
        

    }   
}
