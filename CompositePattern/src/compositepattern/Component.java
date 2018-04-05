package compositepattern;

abstract public class Component 
{
    private Container cont;
    private String ComponentName;

    public String getComponentName()
    {
        return ComponentName;
    }

    public void setComponentName(String ComponentName)
    {
        this.ComponentName = ComponentName;
    }

    public Container getCont()
    {
        return cont;
    }

    public void setCont(Container cont)
    {
        this.cont = cont;
    }
    
    
}
