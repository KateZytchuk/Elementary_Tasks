package envelopes;

import envelopes.domain.Envelope;

import java.util.ArrayList;

public class TestData {


    private static ArrayList<Envelope> threeEnvelopes = initThreeEnvelopes();
    private static ArrayList<Envelope> twoEnvelopes = initTwoEnvelopes();
    private static ArrayList<Envelope> tenEnvelopes = initTenEnvelopes();



    public static String threeEnvelopesStr = "\nYou can put in your 1 envelope such envelopes:" +
            "\nYou can put in your 2 envelope such envelopes: 1 3" +
            "\nYou can put in your 3 envelope such envelopes:";
    public static String twoEnvelopesStr = "\nYou can put in your 1 envelope such envelopes: 2" +
            "\nYou can put in your 2 envelope such envelopes:";
    public  static  String tenEnvelopesStr = "\nYou can put in your 1 envelope such envelopes: 2 3 4" +
            "\nYou can put in your 2 envelope such envelopes:" +
            "\nYou can put in your 3 envelope such envelopes:" +
            "\nYou can put in your 4 envelope such envelopes:" +
            "\nYou can put in your 5 envelope such envelopes: 2 3 4" +
            "\nYou can put in your 6 envelope such envelopes: 2 3 4" +
            "\nYou can put in your 7 envelope such envelopes: 2 3 4 5 6" +
            "\nYou can put in your 8 envelope such envelopes: 2 3 4 5 6" +
            "\nYou can put in your 9 envelope such envelopes:" +
            "\nYou can put in your 10 envelope such envelopes: 1 2 3 4 5 6 7 8 9";


    public static ArrayList<Envelope> getThreeEnvelopes() {
        return threeEnvelopes;
    }

    public static ArrayList<Envelope> getTwoEnvelopes() {
        return twoEnvelopes;
    }
    public static ArrayList<Envelope> getTenEnvelopes() {
        return tenEnvelopes;
    }

    private static ArrayList<Envelope> initThreeEnvelopes() {
        ArrayList<Envelope> listEnv = new ArrayList<Envelope>();
        listEnv.add(new Envelope(2.0, 2.2));
        listEnv.add(new Envelope(10, 5));
        listEnv.add(new Envelope(4.0, 1.8));
        return listEnv;
    }

    private static ArrayList<Envelope> initTwoEnvelopes() {
        ArrayList<Envelope> listEnv = new ArrayList<Envelope>();
        listEnv.add(new Envelope(3.25, 3.5));
        listEnv.add(new Envelope(3.0, 2.45));
        return listEnv;
    }
    private static ArrayList<Envelope> initTenEnvelopes() {
        ArrayList<Envelope> listEnv = new ArrayList<Envelope>();
        listEnv.add(new Envelope(3.0, 6.0));
        listEnv.add(new Envelope(4.0, 2.0));
        listEnv.add(new Envelope(3.95, 2.85));
        listEnv.add(new Envelope(3.95, 2.85));
        listEnv.add(new Envelope(5.8, 4.23));
        listEnv.add(new Envelope(4.23, 5.2));
        listEnv.add(new Envelope(5.1, 6.0));
        listEnv.add(new Envelope(5.2, 6.0));
        listEnv.add(new Envelope(10, 2));
        listEnv.add(new Envelope(9, 9));
        return listEnv;
    }


}
