package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);


    }

    private void nakresliPrasatko(Turtle zofka) {
        nakresliDomecekVlevo(zofka);
        nakresliNozicky(zofka);
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(25);
        nakresliDalsiNozicky(zofka);
    }

    private void nakresliDomecekVlevo(Turtle zofka) {
        for (int i = 0; i < 5; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(225);
        zofka.move(70);
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(45);
        }
        zofka.move(70);
    }

    private void nakresliDalsiNozicky(Turtle zofka) {
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnRight(90);
        zofka.move(25);
    }

    private void nakresliNozicky(Turtle zofka) {
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(25);
            zofka.turnLeft(180);
            zofka.move(25);
        }
    }
}
