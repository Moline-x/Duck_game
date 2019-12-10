public class MiniDuckSimulator{
    public static void main(String[] args) {
        Duck mallar = new MallardDuck();
        mallar.performQuack();
        mallar.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
