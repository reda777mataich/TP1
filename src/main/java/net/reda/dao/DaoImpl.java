package net.reda.dao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Version base de données: récupération de la température");
        // Simulate database fetch
        return 25.0;
    }
}
