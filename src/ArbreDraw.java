public class ArbreDraw extends Draw {
    private Turtle turtle;

    public ArbreDraw(Turtle turtle) {

        this.turtle = turtle;
    }

    public void draw() {
        turtle.tourne(-90);
        recusifdraw(4, 50);
    }

    private void recusifdraw(int indice, double lg) {

        if (indice == 1) {
            turtle.trace((int) lg);
            turtle.tourne(180);
            turtle.avance((int) lg);
            turtle.tourne(180);

        } else {
            turtle.trace((int) lg);
            turtle.tourne(45);
            recusifdraw(indice - 1, lg / 2);
            turtle.tourne(-90);
            recusifdraw(indice - 1, lg / 2);
            turtle.tourne(-135);
            turtle.avance((int) lg);
            turtle.tourne(180);
        }

    }
}
