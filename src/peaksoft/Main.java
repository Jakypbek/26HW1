package peaksoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car, CarInfo> garage = new HashMap<>();
        garage.put(new Car(1, "B 1298 AY"), new CarInfo(2003, "runx", 8500, "golden"));
        garage.put(new Car(2, "k 1343 AY"), new CarInfo(2012, "RAV-4", 12300, "white"));
        garage.put(new Car(3, "B 4345 AT"), new CarInfo(2009, "X4", 11000, "black"));
        garage.put(new Car(4, "R 9876 AL"), new CarInfo(2018, "prius", 15000, "yellow"));


        System.out.println(garage.entrySet());

        System.out.println();

        Iterator<Map.Entry<Car, CarInfo>> iterator = garage.entrySet().iterator();

        while (iterator.hasNext())  {
            System.out.println(iterator.next());
        }





    }
}
