package adapterpattern;

public class Client
{

    ClientOneInterface c;

    public Client(ClientOneInterface c)
    {
        this.c = c;
    }

    public void useService()
    {
        String animalName = this.c.getAnimalName();
        System.out.println("animal Name is = "+animalName);
        this.c.setAnimalName("Hello brother");
    }
}
