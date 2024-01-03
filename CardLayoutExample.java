package cardlayoutexample;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExample extends JFrame implements ActionListener
{
    CardLayout card;
    JButton b1,b2,b3;
    Container c;
CardLayoutExample()
{
    c=getContentPane();
    card=new CardLayout(40,30);
    //create cardLayout objects with 40 hor spaceand 30 ver space
    c.setLayout(card);
b1=new JButton("Hello");
b2=new JButton("Good");
b3=new JButton("Morning");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
c.add(b1);
c.add(b2);
c.add(b3);
}
public void actionPerformed(ActionEvent e)
{
card.next(c);
}
    public static void main(String[] args)
{
CardLayoutExample cl=new CardLayoutExample();
cl.setSize(400,400);
cl.setVisible(true);
cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
