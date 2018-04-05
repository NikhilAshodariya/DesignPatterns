package adapterpattern;

public class Service implements OriginalInterface
{

    @Override
    public String getBirdName()
    {
        return "BhaiBhai";
    }

    @Override
    public void setBirdName(String name)
    {
        System.out.println("Name = " + name + " setted successfully");
    }
}
