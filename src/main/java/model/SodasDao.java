package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDao implements Sodas {

    public List<Soda> sodas = new ArrayList<>();

    @Override
    public int createIn(Soda soda) {
    soda.setId(sodas.size() +1 );
    sodas.add(soda);
    return (int) soda.getId();
    }

    @Override
    public Soda findById(long id) {
        return sodas.get((int)id-1);
    }

}
