import javax.swing.*;
public class Okno extends JFrame
{
    public Okno()
    {
        setSize(300,200);
        setTitle("Moje pierwsze okienko");
    }
    public static void main(String[] args)
    {
        Okno okno= new Okno();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }
}