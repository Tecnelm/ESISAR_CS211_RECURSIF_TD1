public class Carres_emboites extends Draw {

    private Turtle turtle;

    public Carres_emboites(Turtle turtle) {
        this.turtle = turtle;
    }

    @Override
    public void draw() {
        drawQuarterRecu(100,35);
    }

    private void drawQuarterRecu(float lg, int indice) {


        if (indice == 1) {
            traceSquare(lg);
        } else {
            traceSquare(lg);
            turtle.avance(lg/2);
            turtle.tourne(-45);
            drawQuarterRecu((float) Math.sqrt((lg*lg)/2),indice-1);

        }
    }

    private void traceSquare(float lg) {
        for (int i = 0; i < 4; i++) {
            turtle.trace(lg);
            turtle.tourne(-90);
        }
    }
}
