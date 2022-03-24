package peaksoft;

import java.util.Objects;

public class Car {
    private int id;
    private String carNumber;

    public Car() {
    }

    public Car(int id, String carNumber) {
        this.id = id;
        this.carNumber = carNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String  carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(carNumber, car.carNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carNumber=" + carNumber +
                '}';
    }
}
