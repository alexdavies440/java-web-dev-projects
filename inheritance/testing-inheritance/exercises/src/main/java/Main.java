public class Main {
    public static void main(String[] args) {
        HouseCat looney = new HouseCat("Looney");
        System.out.println(looney.isTired());
        System.out.println(looney.isSatisfied());
        looney.eat();
        System.out.println(looney.isTired());
        System.out.println(looney.isSatisfied());
        System.out.println();
        Cat emptyCat = new Cat();
        System.out.println(emptyCat.getWeight());
        System.out.println(looney.getWeight());
    }
}
