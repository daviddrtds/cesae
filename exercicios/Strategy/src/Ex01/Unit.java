package Ex01;

public class Unit {

    private Strategy attackStrategy;

    public Unit(Strategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

}
