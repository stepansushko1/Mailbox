package client;

public class ClientID {
    public static Client client;
    private static int counter = 0;

    public static void setCounter(int counter) {
        ClientID.counter = counter;
    }

    public static int getCounter(){
        counter = counter + 1;
        return counter;
    }
}

