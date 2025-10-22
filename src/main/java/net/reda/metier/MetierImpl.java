package net.reda.metier;

import net.reda.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        // Call getData from DAO layer and perform calculation
        double data = dao.getData();
        System.out.println("Calculating with data: " + data);
        // example calculation
        return data * 2;
    }
}
