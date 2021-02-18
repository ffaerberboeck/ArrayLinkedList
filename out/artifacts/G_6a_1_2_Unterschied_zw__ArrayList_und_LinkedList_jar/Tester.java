import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        System.out.println("--------------------------Ab hier beginnt die List Liste--------------------------");

        ListTester o1 = new ListTester();
        List<Integer> list1 = new ArrayList<Integer>();
        o1.addEnd(list1,1);
        long s1 = System.currentTimeMillis();
        o1.addEnd(list1,20000);
        long e1 = System.currentTimeMillis();
        System.out.println(e1-s1+"ms | addEnd");

        long s2 = System.currentTimeMillis();
        o1.addFirst(list1,20000);
        long e2 = System.currentTimeMillis();
        System.out.println(e2-s2+"ms | addFirst");

        long s3 = System.currentTimeMillis();
        o1.deleteHalf(list1);
        long e3 = System.currentTimeMillis();
        System.out.println(e3-s3+"ms | DeleteHalf");

        long s4 = System.currentTimeMillis();
        int summe = o1.summeIterator(list1);
        long e4 = System.currentTimeMillis();
        System.out.println(e4-s4+"ms | summeIterator | Ergebnis = "+summe);

        long s5 = System.currentTimeMillis();
        int summe2 = o1.summeIndex(list1);
        long e5 = System.currentTimeMillis();
        System.out.println(e5-s5+"ms | summeIndex | Ergebnis = "+summe2);

        long s6 = System.currentTimeMillis();
        String liste = o1.listeIterator(list1);
        long e6 = System.currentTimeMillis();
        System.out.println(e6-s6+"ms | listeIterator");

        long s7 = System.currentTimeMillis();
        String liste2 = o1.listeIndex(list1);
        long e7 = System.currentTimeMillis();
        System.out.println(e7-s7+"ms | listeIndex");

        System.out.println("--------------------------Ab hier endet die List Liste--------------------------");
        System.out.println("--------------------------Ab hier beginnt die Collection Liste--------------------------");

        ListTester o2 = new ListTester();
        Collection<Integer> list2 = new ArrayList<Integer>();

        long cs1 = System.currentTimeMillis();
        o1.addEnd(list2,20000);
        long ce1 = System.currentTimeMillis();
        System.out.println(ce1-cs1+"ms | addEnd");

        long cs2 = System.currentTimeMillis();
        o1.addFirst(list2,20000);
        long ce2 = System.currentTimeMillis();
        System.out.println(ce2-cs2+"ms | addFirst");

        long cs3 = System.currentTimeMillis();
        o1.deleteHalf(list2);
        long ce3 = System.currentTimeMillis();
        System.out.println(ce3-cs3+"ms | DeleteHalf");

        long cs4 = System.currentTimeMillis();
        int csumme = o1.summeIterator(list2);
        long ce4 = System.currentTimeMillis();
        System.out.println(ce4-cs4+"ms | summeIterator | Ergebnis = "+csumme);

        long cs5 = System.currentTimeMillis();
        int csumme2 = o1.summeIndex(list2);
        long ce5 = System.currentTimeMillis();
        System.out.println(ce5-cs5+"ms | summeIndex | Ergebnis = "+csumme2);

        long cs6 = System.currentTimeMillis();
        String cliste = o1.listeIterator(list2);
        long ce6 = System.currentTimeMillis();
        System.out.println(ce6-cs6+"ms | listeIterator");

        long cs7 = System.currentTimeMillis();
        String cliste2 = o1.listeIndex(list2);
        long ce7 = System.currentTimeMillis();
        System.out.println(ce7-cs7+"ms | listeIndex");

        System.out.println("--------------------------Ab hier endet die Collection Liste--------------------------");
    }
}
