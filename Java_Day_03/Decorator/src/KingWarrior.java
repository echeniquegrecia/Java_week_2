public class KingWarrior extends Warrior {

    public KingWarrior() {
        this.setHp(this.getHtp());
        this.setDmg(this.getDmg());
    }

    @Override
    public int getHtp() {
        return 60;
    }


    @Override
    public int getDmg() {
        return 10;
    }
}
