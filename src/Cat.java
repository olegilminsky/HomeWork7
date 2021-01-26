public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)){
            satiety = true;
        } else {
            satiety = false;
        }
    }

    public void satietyInfo(){
        if (satiety){
            System.out.println("Кот " + name + " сыт!");
        }else {
            System.out.println("Кот " + name + " голоден!");
        }
    }
}
