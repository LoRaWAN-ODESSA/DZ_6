package com.company.Task1;

public class CarProcessor {

    Car[] cars;
    private static final int CURRENT_YEAR = 2022;

    public CarProcessor(Car[] cars) {
        this.cars = cars;
    }

    public CarProcessor() {
        cars = new Car[]{};
    }

    public void searchByName(Car[] cars, String name) {
        findName(cars, name);
    }

    public void searchByName(String name) {
        if (this.cars.length != 0) {
            findName(this.cars, name);
        } else {
            System.out.println("Cars array is empty!\n");
        }
    }

    public void searchByModel(Car[] cars, String model, int yearsOperation) {
        findModel(cars, model, yearsOperation);
    }

    public void searchByModel(String model, int yearsOperation) {
        if (this.cars.length != 0) {
            findModel(this.cars, model, yearsOperation);
        } else {
            System.out.println("Cars array is empty!\n");
        }
    }

    public void searchByYear(Car[] cars, int year, double price) {
        findYear(cars, year, price);
    }

    public void searchByYear(int year, double price) {
        if (this.cars.length != 0) {
            findYear(this.cars, year, price);
        } else {
            System.out.println("Cars array is empty!\n");
        }

    }

    private void printInfo(Car car) {
        System.out.println("Name: " + car.name + "; " +
                "Model: " + car.model + "; " +
                "Year: " + car.year + "; " +
                "Color: " + car.color + "; " +
                "Price: " + car.price + " USD; " +
                "Registration number: " + car.regNumber + ";");
    }

    private void findName(Car[] cars, String name) {
        int carNumber = 1;
        System.out.println("Search for cars with a name \"" + name + "\":");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].name.equals(name)) {
                System.out.print(carNumber + ". ");
                printInfo(cars[i]);
                carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("Not found");
        }
        System.out.println();
    }

    private void findModel(Car[] cars, String model, int yearsOperation) {
        int carNumber = 1;
        System.out.println("Search for cars with a model \"" + model + "\", that has been in operation for more than \"" + yearsOperation + "\" years:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].model.equals(model) && yearsOperation < CURRENT_YEAR - cars[i].year) {
                System.out.print(carNumber + ". ");
                printInfo(cars[i]);
                carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("Not found");
        }
        System.out.println();
    }

    private void findYear(Car[] cars, int year, double price) {
        int carNumber = 1;
        System.out.println("Search for cars with a year \"" + year + "\", whose price is more than \"" + price + " USD\":");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year == year && cars[i].price > price) {
                System.out.print(carNumber + ". ");
                printInfo(cars[i]);
                carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("Not found");
        }
        System.out.println();
    }
}
