package base.mapa;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main (String args[]) {
        Map<Integer, String> mapa = new HashMap<Integer, String>();

        //Insert O(n)
        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Tres");

        //consulta O(n)
        System.out.println(mapa.get(2));

        // percorrer mapa
        for( Integer key: mapa.keySet()){
            System.out.println(mapa.get(key));
        }

        mapa.remove(2);
        for( Integer key: mapa.keySet()){
            System.out.println(mapa.get(key));
        }

    }

}
