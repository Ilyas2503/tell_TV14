public class Chigo extends TV {

    private String sound;

    private int width;
    private int height;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public Chigo(String model, String sound, int width, int height) {
        super(model);
        this.sound = sound;
        this.width = width;
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("\n" + "Model: " + getModel() + "," +
                ". " + getSound() + " \n" + "Размер диагонали телевизора -> "
                + calculatePerimeter() + " см." +
                "\nУ Chigo cамое лучшее качество звука из всех телевизоров!");
    }


    public int calculatePerimeter() {
        return width + height;
    }

    @Override
    public String toString() {
        return "Chigo";
    }
}