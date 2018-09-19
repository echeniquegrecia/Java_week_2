public class BasicWarrior extends Warrior{


    public BasicWarrior() {
        this.setHp(this.getHtp());
        this.setDmg(this.getDmg());
    }

    @Override
    public int getHtp() {
        return 40;
    }


    @Override
    public int getDmg() {
        return 70;
    }
}
