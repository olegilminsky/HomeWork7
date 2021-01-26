import java.util.Random;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat cats[] = new Cat[5];
        Plate plate = new Plate(100);
        Random random = new Random();
        for (int i = 0; i < cats.length; i++) {
            String catName = "Кот №" + (i + 1);
            cats[i] = new Cat(catName, random.nextInt(100));
        }
        plate.info();
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " хочет съесть " + cat.getAppetite() + " еды.");
            if (cat.getAppetite() > plate.getFood()) {
                plate.addFood(random.nextInt(50));
            }
            cat.eat(plate);
        }
        for (Cat cat : cats) {
            cat.satietyInfo();
        }
    }
}
