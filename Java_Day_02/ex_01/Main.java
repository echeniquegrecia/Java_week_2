public class Main{

    public static void main(String[] args){
        Solo<String> strSolo = new Solo<>("toto");
        String strValue = strSolo.getValue();
        System.out.println(strSolo.getValue());
        strSolo.setValue("tata");

        Solo<Integer> intSolo = new Solo<>(new Integer(42));
        Integer intValue = intSolo.getValue();
        intSolo.setValue(new Integer(1337));
    }
}