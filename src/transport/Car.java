package transport;

public class Car {
    final private String brand;
    final private String model;
    private String color;
    private double engineVolume;
    final private String country;
    final private int year;
    private String transmission;
    final private String bodyType;
    final private String regNumber;
    private int seatsCount;
    private boolean summerTires;



    public Car(String brand, String model, String color,
               double engineVolume, String country, int year,
               String transmission,String bodyType,String regNumber,
               int seatsCount, boolean summerTires) {
        if (model == null|| model.isEmpty()){
            model="default";
        }   this.model = model;
        if (brand == null|| brand.isEmpty()){
            brand="default";
        }   this.brand = brand;
        if (color == null|| color.isEmpty()){
            color="белый";
        }   this.color = color;
        setEngineVolume(engineVolume);
        if (country == null|| country.isEmpty()){
            country="default";
        }   this.country = country;
        if (year <=0){
            year=2000;
        }   this.year = year;
        if (bodyType == null|| bodyType.isEmpty()){
            bodyType="купе";
        }   this.bodyType = bodyType;
        if (regNumber == null|| regNumber.isEmpty()){
            regNumber= "х000хх000";
        }   this.regNumber=regNumber;
        setSeatsCount(seatsCount);
        this.summerTires=summerTires;
    }

    public void setSeatsCount(int seatsCount) {
        if (seatsCount <=0) {
            seatsCount = 4;
        }   this.seatsCount = seatsCount;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <=0){
            engineVolume=1.5;
        }   this.engineVolume = engineVolume;
    }
    public String getCountry() {
        return country;
    }
    public int getYear() {
        return year;
    }
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null|| transmission.isEmpty()) {
            this.transmission = "механическая";
        }else this.transmission = transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public int getSeatsCount() {
        return seatsCount;
    }
    public boolean isSummerTires() {
        return summerTires;
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
    public void changeTires() {
        setSummerTires(!summerTires);
    }
    public boolean isCorrectRegNumber() {
        return regNumber.length()==9&&Character.isLetter(regNumber.charAt(0))&&Character.isLetter(regNumber.charAt(4))&&
                Character.isLetter(regNumber.charAt(5))&&Character.isDigit(regNumber.charAt(1))&&
                Character.isDigit(regNumber.charAt(2))&&Character.isDigit(regNumber.charAt(3))&&
                Character.isDigit(regNumber.charAt(6))&&Character.isDigit(regNumber.charAt(7))&&
                Character.isDigit(regNumber.charAt(8));
    }
        public String toString() {
        return this.brand+ " "+this.model+", "+this.year+" года выпуска, сборка - "+this.country+
                ", цвет кузова- "+this.color+", объем двигателя - "+this.engineVolume+
                ", коробка передач -"+getTransmission()+",тип кузова - "+getBodyType()+
                ", регистрационный номер - "+isCorrectRegNumber()+", количество мест - "+getSeatsCount()+
                ", тип резины - "+(isSummerTires()?"летняя":"зимняя");
    }
}


