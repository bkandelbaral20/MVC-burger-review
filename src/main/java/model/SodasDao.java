package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDao implements Sodas {

    public List<Soda> sodas = new ArrayList<>();

    public SodasDao (){
        Soda coke = new Soda("Coca_Cola",3);
        coke.setId(1L);
//        add it to the our local array list of sodas
        sodas.add(coke);

        Soda drPepper = new Soda("drPepper",3);
        coke.setId(1L);
//        add it to the our local array list of sodas
        sodas.add(drPepper);

        Soda sprite = new Soda("sprite",3);
        coke.setId(1L);
//        add it to the our local array list of sodas
        sodas.add(sprite);


    }

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
