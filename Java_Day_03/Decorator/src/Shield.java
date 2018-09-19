public class Shield extends StuffDecorator{


    public Shield(Warrior warrior) {
        this.holder = warrior;
        System.out.println("May this shield protect me against every enemy.");
    }

    @Override
    public int getHtp() {
        return this.holder.getHtp() + 10;

    }
}
