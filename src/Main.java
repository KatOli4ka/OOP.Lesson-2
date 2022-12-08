import transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ-1.Здание 1");

        Human maksim = new Human(null, -1988, "бренд-менеджер", "Минск");
        System.out.println(maksim.toString());
        Human anya = new Human("Аня", 1993, "", "Москва");
        System.out.println(anya.toString());
        Human katya = new Human("Катя", 1992, "продакт-менеджер", "Калининград");
        System.out.println(katya.toString());
        Human artem = new Human("Артём", 1995, null, "Москва");
        System.out.println(artem.toString());

        System.out.println("Задание 2");
        Car lada = new Car("", "Granta", "желтый", 1.7, "Россия", 2015,
                "", "седан", "ю122юю122", 5, true);
        System.out.println(lada.toString());
        Car audi = new Car("Audi", "null", "черный", 3.0, "Германия", 2020,
                "", "", "", 7, false);
        System.out.println(audi.toString());
        Car bmw = new Car("BMW", "Z8", "черный", 0, "Германия", 2021,
                "автомат", "", "125369874", 2, true);
        System.out.println(bmw.toString());
        Car kia = new Car("Kia", "Sportage 4-го поколения", "", 2.4, "Южная Корея",
                2018, "автомат", "седан", "д123д123д", 4, false);
        System.out.println(kia.toString());
        Car hyundai = new Car("Hyundai", "Avante", "оранжевый", 1.6, "Южная Корея",
                0, "", "седан", "э123ээ111", 6, true);
        System.out.println(hyundai.toString());

        ///
        System.out.println();
        Human vladimir = new Human("Владимир", 2001, "", "Казань");
        System.out.println(vladimir.toString());
        System.out.println();

        System.out.println("Задача 2");
        Flower rose = new Flower("Роза", "желтый", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15, 5);
        Flower peony = new Flower("Пион", "розовый", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "синий", "Турция", 19.5, 10);

        System.out.println(rose.toString());
        System.out.println(chrysanthemum.toString());
        System.out.println(peony.toString());
        System.out.println(gypsophila.toString());
        Bouquet bouquet = new Bouquet(
                new Flower[]{rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                        chrysanthemum,gypsophila}
        );
        bouquet.printInfo();
    }
}