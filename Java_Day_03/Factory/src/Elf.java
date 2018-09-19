import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elf {

    private Toy toy;
    private List<GiftPaper> list_giftpaper = new ArrayList<>();
    private Factory factory = new Factory();


    public void listening(){
        Scanner sc = new Scanner(System.in);
        this.toy = null;

        while(true){
            //Input
            System.out.println("What is your command today?");
            String response = sc.nextLine();
            String response_splt[] = response.split(" ", 3);

            if(response_splt[0].equals("get")) {
                switch (response_splt[1]) {
                    case "teddy":
                        if (this.toy == null) {
                            this.toy = factory.create("teddy");
                            System.out.println("What a nice one! I would have liked to keep it ...");
                        } else {
                            System.out.println("Minute please?! I’m not that fast.");
                        }
                        break;

                    case "gameboy":
                        System.out.println("Hello " + response_splt[1]);
                        if (this.toy == null) {
                            this.toy = factory.create("gameboy");
                            System.out.println("What a nice one! I would have liked to keep it ...");
                        } else {
                            System.out.println("Minute please?! I’m not that fast.");
                        }
                        break;
                    default:
                        if (Integer.parseInt(response_splt[1]) == (Integer) Integer.parseInt(response_splt[1])) {
                            if (response_splt[2].equals("giftpapers")) {
                                for (int i = 0; i < Integer.parseInt(response_splt[1]); i++) {
                                    list_giftpaper.add(new GiftPaper());
                                }
                                System.out.println("You have " + (Integer) Integer.parseInt(response_splt[1]) + " giftpapers");
                                System.out.println(list_giftpaper);
                                System.out.println(list_giftpaper.size());
                            } else {
                                System.out.println("Error in the command.");
                            }
                        } else {
                            System.out.println("Error in the command.");
                        }
                }
            } else if (response_splt[0].equals("pack")){
                    if(list_giftpaper.size() == 0){
                        System.out.println("Wait... I can’t pack it with my shirt.");
                        System.out.println("get a giftpaper please");
                    }else{
                        list_giftpaper.get(0).wrap(this.toy);
                        list_giftpaper.remove(list_giftpaper.get(0));
                        this.toy = null;
                        System.out.println("And an other kid will be happy !");
                    }
            }
            else{
                System.out.println("Error in the command. Please introduce a get to start.");
            }
        }
    }
}

