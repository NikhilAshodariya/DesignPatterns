package compositepattern;

public class CompositePattern
{

    public static void main(String[] args)
    {
        System.out.println("Entering CompositePattern");

        NJFrame f = new NJFrame("Nikhil JFrame");
        NJButton njb = new NJButton("Nikhil JButton");
        f.addComponent(njb);

        NJPanel njp = new NJPanel("Nikhil JPanel");
        NJLabel njl = new NJLabel("Nikhil JLabel");
        njp.addComponent(njl);
        f.addComponent(njp);
        f.printListOfComponents();
        
    }
}
