package Ex01;

public class Main {
    public static void main(String[] args) {

        MeleeAttackStrategy teste = new MeleeAttackStrategy();
        Unit meleeUnit = new Unit(teste);
        meleeUnit.performAttack();

        Unit rangedUnit = new Unit(new RangedAttackStrategy());
        rangedUnit.performAttack();

        Unit magicUnit = new Unit(new MagicAttackStrategy());
        magicUnit.performAttack();

    }
}
