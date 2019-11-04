import processing.core.PApplet;

public class Main extends PApplet {
    private Drawer drawer;
    public static void main(String[] args) {
        PApplet.main("Main");

    }

    @Override
    public void settings() {
        setSize(500,500);
        drawer = new Drawer(this);
    }

    @Override
    public void setup() {
        drawer.carre();
    }

    @Override
    public void draw() {
    }
}
