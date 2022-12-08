public class Flower {
    final private String flowerName;
    final private String flowerColor;
    final private String country;
    final private double cost;
    public int lifeSpan;


    public Flower (String flowerName,String flowerColor,String country,double cost,int lifeSpan) {
        if (flowerName== null|| flowerName.isEmpty()){
            flowerName="Тип цветка не указан";
        }   this.flowerName = flowerName;
        if (flowerColor== null|| flowerColor.isEmpty()){
            flowerColor="белый";
        }   this.flowerColor = flowerColor;
        if (country== null|| country.isEmpty()){
            country="Россия";
        }   this.country = country;
        if (cost<=0){
            cost=1;
        }   this.cost = cost;
        if (lifeSpan <= 0) {
            lifeSpan=3;
        }   this.lifeSpan=lifeSpan;
  }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
    return "Название цветка- "+getFlowerName()+", цвет цветка - "+getFlowerColor()+", страна происхождения- "+getCountry()+", стоимость штуки - "+getCost()+", срок стояния - "+lifeSpan;
}


}
