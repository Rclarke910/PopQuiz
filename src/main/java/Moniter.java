public class Moniter {

    private Resolution resolution;
    private String manufacturer;

    private int model;

    public Moniter(Resolution resolution, String manufacturer, int model){
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color "+ color);
    }


}

