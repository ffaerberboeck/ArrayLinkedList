import java.util.*;

public class ListTester{
    /**
     * Die Methode addEnd soll der Integer Liste eine bestimmte Anzahl an Zufallszahlen mithilfe der Methode .add am Ende der Liste hinzufügen
     * @param liste     Die Liste
     * @param anzahl    Die anzahl der Zufallszahlen
     */
    public void addEnd(Collection<Integer> liste, int anzahl) {
        for(int z = 0; z < anzahl;z++) {
            int zufall = (int)((Math.random() * 100));
            Integer zufallI = zufall;
            liste.add(zufallI);
        }
    }

    /**
     * Die Methode addEnd soll der Integer Liste eine bestimmte Anzahl an Zufallszahlen mithilfe der Methode .add am Anfang der Liste hinzufügen
     * @param liste     Die Liste
     * @param anzahl    Die anzahl der Zufallszahlen
     */
    public void addFirst(Collection<Integer> liste, int anzahl) {
        List<Integer> list = new ArrayList<Integer>();
        list = (List)liste;
        for(int z = 0; z < anzahl;z++) {
            int zufall = (int)((Math.random()) * 100);
            Integer zufallI = zufall;
            list.add(0,zufallI);
        }
    }

    /**
     * Diese Methode soll die hälfte aller ELemente löschen
     * @param liste die Liste
     */
    public <Integer> void deleteHalf(Collection<Integer> liste) {

        Iterator<Integer> it = liste.iterator();
        int zaehler = 0;
        int size = liste.size()/2;
        while(it.hasNext()) {
            if(zaehler%2 == 0 && size > zaehler) {
                liste.remove(zaehler);
                zaehler++;
            }if (zaehler%2 != 0 && size > zaehler) {
                liste.remove(zaehler);
                zaehler++;
            }else { break; }
        }

    }

    /**
     * Diese Methode gibt die Summe der in der Liste gespeicherten Elemente zurück
     * @param liste die Liste
     */
    public <Integer> int summeIterator(Collection<Integer> liste) {
        Iterator<Integer> it = liste.iterator();
        int zaheler1 = 0;
        for(Integer zaehler2 : liste) {
            zaheler1 += (int) zaehler2;
        }
        return zaheler1;
    }


    /**
     * Diese Methode gibt die Summe der in der Liste gespeicherten Elemente zurück
     * @param liste die Liste
     */
    public <Integer> int summeIndex(Collection<Integer> liste) {
        Iterator<Integer> it = liste.iterator();
        int zaehler = 0;
        for(int z = 0; z < liste.size();z++) {
            int azahl = (int) it.next();
            zaehler += azahl;
        }
        return zaehler;
    }

    /**
     * Diese Methode soll die Zahlen in der Liste als String zurückgeben
     * @param liste die Liste
     * @return      die Zeichenkette der Liste
     */
    public <Integer> String listeIterator(Collection<Integer> liste) {
        Iterator<Integer> it = liste.iterator();
        String zahlen = "";
        for(Integer zaehler2 : liste) {
            int azahl = (int) it.next();
            zahlen = zahlen + String.valueOf(azahl) + ",";
        }
        return zahlen;
    }

    /**
     * Diese Methode soll die Zahlen in der Liste als String zurückgeben
     * @param liste die Liste
     * @return      die Zeichenkette der Liste
     */
    public <Integer> String listeIndex(Collection<Integer> liste) {
        Iterator<Integer> it = liste.iterator();
        String zahlen = "";
        for(int z = 0; z < liste.size(); z++) {
            int azahl = (int) it.next();
            zahlen = zahlen + String.valueOf(azahl) + ",";
        }
        return zahlen;
    }
}
