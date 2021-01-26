public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            System.out.println("Кот наелся!");
            return true;
        } else {
            System.out.println("В тарелке недостаточно еды для того, чтобы накормить этого кота!");
            return false;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int n) {
        if (n > 0){
            food += n;
            System.out.println("Тарелка пополнена на " + n + " еды.");
        }else {
            System.out.println("Невозможно пополнить тарелку на "+ n + " еды!");
        }
    }
}
