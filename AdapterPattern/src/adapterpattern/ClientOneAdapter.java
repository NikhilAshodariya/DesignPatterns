package adapterpattern;

public class ClientOneAdapter implements ClientOneInterface
{
    Service s = new Service();
    
    @Override
    public String getAnimalName()
    {
        return s.getBirdName();
    }

    @Override
    public void setAnimalName(String name)
    {
        s.setBirdName(name);
    }
    
}
