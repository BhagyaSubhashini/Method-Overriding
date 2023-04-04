public class CentralBank {
    int getInerestRate(){
        return 0;
    }
}
class BOC extends CentralBank{
    @Override
    int getInerestRate() {
        return 8;
    }
}
class PeoplesBank extends CentralBank{
    @Override
    int getInerestRate() {
        return 10;
    }
}
class CommercialBank extends CentralBank{
    @Override
    int getInerestRate() {
        return 12;
    }
}
class TestOverriding{
    public static void main(String[] args) {
        BOC b = new BOC();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();
        System.out.println("Interest Rate :- " + b.getInerestRate() );
        System.out.println("Interest Rate :- " + p.getInerestRate() );
        System.out.println("Interest Rate :- " + c.getInerestRate() );
    }
}
