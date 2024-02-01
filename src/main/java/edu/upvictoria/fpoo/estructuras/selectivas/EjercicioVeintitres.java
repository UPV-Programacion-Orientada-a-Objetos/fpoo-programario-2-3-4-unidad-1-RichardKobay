package edu.upvictoria.fpoo.estructuras.selectivas;

import com.sun.source.tree.BreakTree;
import edu.upvictoria.fpoo.helpers.Prices;

public class EjercicioVeintitres {

    public double newCost (String type, int extra) {
        Prices prices = new Prices();
        double total = 0;

        if (type.equalsIgnoreCase("a"))
            total = 1200;
        if (type.equalsIgnoreCase("b"))
            total = 950;

        if (extra == 1)
            return prices.addPercentage(total, 10);
        if (extra == 2)
            return prices.addPercentage(total, 5);
        if (extra == 3)
            return prices.addPercentage(total, 5);
        if (extra == 4)
            return prices.addPercentage(total, 20);

        return prices.addPercentage(total, 10);
    }

    public EjercicioVeintitres () {

    }
}
