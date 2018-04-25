package decorator;

public class MainTest {

    public static void main(String[] args){
        Person xc = new Person("小明");
        System.out.println("第一种装扮:");
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        bigTrouser.decorate(xc);
        tShirts.decorate(bigTrouser);
        tShirts.show();
    }
}
