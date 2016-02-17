package ph.edu.dlsu;

import ph.edu.dlsu.olives.Olive;
import ph.edu.dlsu.ph.edu.dlsu.press.OlivePress;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Olive> olives = new ArrayList<Olive>();

        Olive olive;

        olive = new Olive(2);
        System.out.println(olive.name);
        olives.add(olive);

        olive = new Olive(1);
        System.out.println(olive.name);
        olives.add(olive);

        olive = new Olive(2);
        System.out.println(olive.name);
        olives.add(olive);

        OlivePress press = new OlivePress();
        press.getOil(olives);

        System.out.println("You got " + press.getTotalOil() + " units of oil");

        press.getOil(olives);

        System.out.println("You got " + press.getTotalOil() + " units of oil");

    }
}