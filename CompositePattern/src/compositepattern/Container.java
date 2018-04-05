package compositepattern;

import java.util.ArrayList;

public class Container extends Component
{

    private String containerName;
    private ArrayList<Component> listOfComponents;

    public Container()
    {
        this.listOfComponents = new ArrayList<>();
    }

    public boolean addComponent(Component c)
    {
        this.listOfComponents.add(c);
        return true;
    }

    public void printListOfComponents()
    {
        System.out.println("------------------------------------");
        listOfComponents.stream().forEach(a
                -> 
                {
                    if (a.getClass() == NJPanel.class)
                    {
                        System.out.println("Going inside if");
                        Container k = (Container) a;
                        k.printListOfComponents();
                    }
                    else
                    {
                        System.out.println("Going inside else");
                        System.out.println(a.getComponentName());
                    }
        });
        System.out.println("------------------------------------");

    }

    public String getContainerName()
    {
        return containerName;
    }

    public void setContainerName(String containerName)
    {
        this.containerName = containerName;
    }

}
