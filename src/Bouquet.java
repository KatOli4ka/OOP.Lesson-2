import java.util.Arrays;

public class Bouquet {
  final private  Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    private double calculateCostOfBouquet() {
        double sum=0;
        for (Flower flower:flowers) {
            sum+= flower.getCost();

        }return sum*1.1;
    }
    private double calculateLifeSpanOfBouquet() {
        int minLifeSpan=Integer.MAX_VALUE;
            for (Flower flower:flowers) {
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan=flower.getLifeSpan();
            }
        }return minLifeSpan;
    }
    public void printCostOfFlowers() {
        double sum=calculateCostOfBouquet();
        int minLifeSpan= (int) calculateLifeSpanOfBouquet();
        StringBuilder result = new StringBuilder("Состав букета: ").append("\n");
        for (Flower flower:flowers) {
            result.append(flower).append("\n");
        }
        result.append("Срок стояния букета: ").append(minLifeSpan).append("дней");
        result.append("Стоимость букета: ").append(sum).append("руб");
    }
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Состав букета: ").append("\n");
        double sum=calculateCostOfBouquet();
        int minLifeSpan= (int) calculateLifeSpanOfBouquet();
        for (Flower flower:flowers) {
            result.append(flower).append("\n");
        }
        result.append("Срок стояния букета: ").append(minLifeSpan).append(" дней").append("\n");
        result.append("Стоимость букета: ").append(sum).append("руб");
        return result.toString();
    }
}
