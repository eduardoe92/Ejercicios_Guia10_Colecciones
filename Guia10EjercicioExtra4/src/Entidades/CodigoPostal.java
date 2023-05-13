package Entidades;

import java.util.HashMap;

public class CodigoPostal {

    private HashMap<Integer, String> hm;

    public CodigoPostal() {
        hm = new HashMap();
    }

    public HashMap<Integer, String> getHm() {
        return hm;
    }

    public void setHm(HashMap<Integer, String> hm) {
        this.hm = hm;
    }

    @Override
    public String toString() {
        return "CodigoPostal{" + "hm=" + hm + '}';
    }
}
