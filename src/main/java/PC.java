public class PC {


    private Case case1;

    public Motherboard getMotherboard() {
        return motherboard;
    }

    private Motherboard motherboard;

    public Moniter getMoniter() {
        return moniter;
    }

    private Moniter moniter;

    public PC(Case case1, Motherboard motherboard, Moniter moniter){

        this.case1 = case1;
        this.moniter = moniter;
        this.motherboard = motherboard;
    }

    public Case getCase1() {
        return case1;
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
