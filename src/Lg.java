public class Lg extends TV {

    private String screen;
    private int width;
    private int length;

    public Lg(String model, String screen, int width, int length) {
        super(model);
        this.screen = screen;
        this.width = width;
        this.length = length;
    }

    public Lg(String model) {
        super(model);
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }


    @Override
    public void print() {
        System.out.println("\nmodel: " + getModel()+ "," + " color: " + ". " +
                getScreen() + "\n" + "Размер диагонали телевизора -> "
                + calculatePerimeter() + " см.\n" +
                "У LG cамый лучший экран из всех телевизоров!");
    }
    @Override
    public int calculatePerimeter() {
        return width + length;
    }

    @Override
    public String toString() {
        return "LG";
    }
}
