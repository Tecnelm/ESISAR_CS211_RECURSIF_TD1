import processing.core.PApplet;

public class Drawer {

    private Turtle turtle ;
    private PApplet pApplet;
    public Drawer(PApplet applet) {
        pApplet = applet;
        turtle = new Turtle(pApplet,false);
    }

    public void arbre()
    {
        new ArbreDraw(turtle).draw();
    }
    public void carre()
    {
        new Carres_emboites(turtle).draw();
    }

}
