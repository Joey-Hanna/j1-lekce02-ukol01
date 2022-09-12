package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(90);

        for (int i = 0; i < 18; i++) {
            zofka.move(20);
            zofka.turnRight(20);
        }

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(150);
        zofka.penDown();





        for (int i = 0; i < 4; i++) {
            nakresliDomecek(zofka);
        }



    }

    private void nakresliDomecek(Turtle zofka) {
        for (int i = 0; i < 5; i++) {
            zofka.move(150);
            zofka.turnRight(90);
        }

        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnRight(45);
        zofka.turnRight(45);
        zofka.move(100);

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);

        zofka.penDown();
    }

    private void nakresliPaprsek(Turtle zofka) {
        zofka.move(25);
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnLeft(20);
        zofka.move(20);
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
