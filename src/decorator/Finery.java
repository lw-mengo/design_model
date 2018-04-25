package decorator;

public class Finery extends Person {
    protected  Person component;

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if (component!=null){
            component.show();
        }
    }
}

class TShirts extends Finery{
    @Override
    public void show() {
        System.out.println("T恤");
        super.show();
    }
}

class BigTrouser extends Finery{
    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
