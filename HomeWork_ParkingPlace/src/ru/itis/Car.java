package ru.itis;

/**
 * 17.10.2017
 * Car
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Car {
    private String model;
    private int number;
    private ParkingPlace parkingPlace;

    public Car(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public void setParkingPlace(ParkingPlace parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public void goToParking() {
        parkingPlace.enterCar(this);
    }
}
