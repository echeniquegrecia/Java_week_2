public class StuffDecorator extends Warrior{

    protected Warrior holder;


    @Override
    public int getDmg() {
        return holder.getDmg();
    }

    @Override
    public int getHtp() {
        return holder.getHtp();
    }
}
