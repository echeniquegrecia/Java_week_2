public class Factory {


    public Factory() {
    }

    public Toy create(String toy){

        Toy toy_object = null;

        if(toy.equals("teddy")){
            toy_object = new TeddyBear();
        }
        else if(toy.equals("gameboy")){
            toy_object = new GameBoy();
        }

        return toy_object;
    }


    public GiftPaper getPaper(Toy toy){
        GiftPaper giftpaper = null;
        giftpaper = new GiftPaper(toy);
        return giftpaper;
    }
}
