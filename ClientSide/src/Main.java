import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        Client client =  new Client();
        DummyServer server = new DummyServer(4000, InetAddress.getByAddress(host), 50);

        client.avviaClient();
    }
}
