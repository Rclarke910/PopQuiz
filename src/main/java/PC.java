public class PC {

    private Case case1;
    private Motherboard motherboard;

    private Moniter moniter;

    public PC(Case case1, Motherboard motherboard, Moniter moniter){

        this.case1 = case1;
        this.moniter = moniter;
        this.motherboard = motherboard;
    }

    private String drawLogo(){

        moniter.drawPixel(1,2,"green");

        return null;
    }

    public void description(){

        System.out.println("Welcome to worst buy below is the description of the pc on sale today ….");

    }

    public void powerUp(){
        Case.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("program");
    }
}
