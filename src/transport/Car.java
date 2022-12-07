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
    private String registrationNumber;
    final private int seatsCount;
    private boolean summerTires;



    public Car(String brand, String model, String color,
               double engineVolume, String country, int year,
               String transmission,String bodyType,String registrationNumber,
               int seatsCount, boolean summerTires) {
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
        this.transmission = "механическая";
        this.bodyType="купе";
        this.registrationNumber="х000хх000";
        if (seatsCount <=0){
            this.seatsCount= 4;
        }   else this.seatsCount = seatsCount;
        this.summerTires=summerTires;
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
        this.engineVolume = engineVolume;
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
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null|| transmission.isEmpty()){
            this.registrationNumber= "х000хх000";
        }   else this.registrationNumber=registrationNumber;
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
        summerTires=!summerTires;
    }

    public boolean isCorrectRegistrationNumber() {
        if (registrationNumber.length()!=9){
            return false;
        }
        char[] chars=registrationNumber.toCharArray();
            if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4])
                    || !Character.isAlphabetic(chars[5])) {
                return false;

        }  if (!Character.isDigit(chars[1])||!Character.isDigit(chars[2])||!Character.isDigit(chars[3])
                    ||!Character.isDigit(chars[6])||!Character.isDigit(chars[7])||!Character.isDigit(chars[8])){
                return  false;
            }
            return true;
    }

        public String toString() {
        return this.brand+ " "+this.model+", "+this.year+" года выпуска, сборка - "+this.country+
                ", цвет кузова- "+this.color+", объем двигателя - "+this.engineVolume+
                ", коробка передач -"+getTransmission()+",тип кузова - "+getBodyType()+
                ", регистрационный номер - "+getRegistrationNumber()+", количество мест - "+getSeatsCount()+
                ", тип резины - "+(isSummerTires()?"летняя":"зимняя");
    }
}


