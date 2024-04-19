public class Case {
    private String model;

    private  String manufacturer;

    private String powerSupply;

    private Dimension dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimension ){

        this.dimension = dimension;
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerSupply = powerSupply;

    }

    public static void pressPowerButton(){
        System.out.println("PowerButton Pressed");
    }


}
