public class Car {
    private String brand;
    private String model;
    private String color;
    private double engineVolume;
    private String country;
    private int year;

    public Car(String brand, String model, String color, double engineVolume, String country, int year) {
        if (model == null|| model.isEmpty()){
            this.model="default";
        }   else this.model = model;
        if (brand == null|| brand.isEmpty()){
            this.brand="default";
        }   else this.brand = brand;
        if (color == null|| color.isEmpty()){
            this.color="белый";
        }   else this.color = color;
        if (engineVolume <=0){
            this.engineVolume=1.5;
        }   else this.engineVolume = engineVolume;
        if (country == null|| country.isEmpty()){
            this.country="default";
        }   else this.country = country;
        if (year <=0){
            this.year=2000;
        }   else this.year = year;
    }

    public String toString() {
        return this.brand+ " "+this.model+", "+this.year+" года выпуска, сборка - "+this.country+", цвет кузова- "+this.color+", объем двигателя - "+this.engineVolume;
    }
}


