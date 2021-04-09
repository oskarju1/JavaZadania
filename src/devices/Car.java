package devices;

public class Car {
    final private String producer;
    final private String model;
    final private String color;
    public Double value;

    public Car(String producer, String model, String color, Double value) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }
}


