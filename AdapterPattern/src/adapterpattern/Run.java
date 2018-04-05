package adapterpattern;

public class Run
{
    public static void main(String[] args)
    {
        Client c = new Client(new ClientOneAdapter());
        c.useService();
    }
}
