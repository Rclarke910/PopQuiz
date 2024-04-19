public class Main {
    public static void main(String[] args){

        Motherboard motherboard1 = new Motherboard("dell",
                "microsoft",
                500,
                30,
                "best computer ever!"
        );

        Resolution resolution1 = new Resolution(50,50);

        Moniter moniter1 = new Moniter(resolution1,"microsoft",14);

        Dimension dimension1 = new Dimension(1,1,20);

        Case case1 = new Case("dell", "microsoft", "usc",dimension1);



        PC pc1 = new PC(case1,motherboard1, moniter1);

        pc1.description();

        pc1.powerUp();


    }
}
