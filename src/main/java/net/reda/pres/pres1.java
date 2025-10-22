package net.reda.pres;

import net.reda.dao.DaoImpl;
import net.reda.dao.IDao;
import net.reda.metier.MetierImpl;

class MainAppStatic {

    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao); // Inject DAO dependency
        double result = metier.calcul();
        System.out.println("Resultat: " + result);
    }
}
