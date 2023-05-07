package web.model;

public class Car {
    private String model;
    private String color;
    private int number_car;

    public Car() {
    }

    public Car(String model, String color, int number_car) {
        this.model = model;
        this.color = color;
        this.number_car = number_car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber_car() {
        return number_car;
    }

    public void setNumber_car(int number_car) {
        this.number_car = number_car;
    }
}
