package com.company.Task1;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car("Honda", "Insight", 2009, "Black", 6500.00, "AB1234PE"),
                new Car("Honda", "Civic", 2015, "Red", 10600.00, "AB77654AA"),
                new Car("Volkswagen", "Passat", 2017, "White", 23000.00, "AB7777EE"),
                new Car("Volkswagen", "Passat", 2008, "Blue", 5200.00, "AX7798AE"),
                new Car("Mercedes", "GLA", 2015, "Black", 18930.0, "BK6779HK"),
                new Car("Mercedes", "GLA", 2014, "Blue", 19999.0, "BC3151PA"),
                new Car("Mercedes", "GLA", 2015, "Black", 20999.0, "BC5943OT")};

        CarProcessor processor1 = new CarProcessor();
        processor1.searchByName(cars, "Honda");
        processor1.searchByName("Honda");
        processor1.searchByModel(cars, "GLA", 5);
        processor1.searchByYear(cars, 2015, 6000.0);

        CarProcessor processor2 = new CarProcessor(cars);
        processor2.searchByName("Mercedes");
        processor2.searchByModel("Insight", 5);
        processor2.searchByYear(2008, 5000.0);

    }
}
