public class Flower {
    final private String flowerName;
    final private String flowerColor;
    final private String country;
    final private double cost;
    public int lifeSpan;


    public Flower (String flowerName,String flowerColor,String country,double cost,int lifeSpan) {
        if (flowerName== null|| flowerName.isEmpty()){
            this.flowerName="Тип цветка не указан";
        }   else this.flowerName = flowerName;
        if (flowerColor== null|| flowerColor.isEmpty()){
            this.flowerColor="белый";
        }   else this.flowerColor = flowerColor;
        if (country== null|| country.isEmpty()){
            this.country="Россия";
        }   else this.country = country;
        if (cost<=0){
            this.cost=1;
        }   else this.cost = cost;
        if (lifeSpan <= 0) {
            this.lifeSpan=3;
        }else this.lifeSpan=lifeSpan;
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
