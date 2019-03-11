
package printer;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class Printer extends JFrame{

JButton ok,cancel,help,setup;
 JLabel jla,jla1;
 JTextArea j1,j2,j3;
JCheckBox  box1,box2,box3 ,box4;
JComboBox<String> comb;
    public Printer() {
        //new Panel
    JPanel  panelAll=new JPanel(new FlowLayout());
    JPanel  panel1=new JPanel(new GridLayout(3,1));
    JPanel  panel11=new JPanel(new GridLayout(1,1));
    jla=new JLabel("Printer  :  MyPrinter");
     panel11.add(jla);
      panel1.add(panel11); 
     //***********************************
      JPanel  panel12=new JPanel(new GridLayout(1,5));
      
      j1=new JTextArea();
      j2=new JTextArea();
      j3=new JTextArea();
      j1.setSize(40, 50);
      j1.setEnabled(false);
      j2.setEnabled(false);
      j3.setEnabled(false);
       JPanel  panel121=new JPanel(new GridLayout(3,1));
       box1=new JCheckBox("Image");
       box2=new JCheckBox("Text");
       box3=new JCheckBox("Code");
       panel121.add(box1);
       panel121.add(box2);
       panel121.add(box3);
    //new and add JRadioButton
      JPanel  panel122=new JPanel(new GridLayout(3,1));
      ButtonGroup group = new ButtonGroup(); 
      JRadioButton but1 = new JRadioButton("Selection", false); 
      JRadioButton but2 = new JRadioButton("All", true); 
      JRadioButton but3 = new JRadioButton("Applet", true); 
      group.add(but1);
      group.add(but2);
      group.add(but3);
      
       panel122.add(but1);
       panel122.add(but2);
       panel122.add(but3);
     panel12.add(j1);
     panel12.add(panel121);
     panel12.add(j2);
     panel12.add(panel122);
     panel12.add(j3);
     panel1.add(panel12);

//new jlabel
JPanel panel13=new JPanel(new FlowLayout());

  jla1=new JLabel("Print Quality:");
  
     
//new JComboBox
 comb =new JComboBox<>();
 comb.addItem(" High");
 comb.addItem("Medium");
 comb.addItem("Low");
 
 
comb.setEditable(true);
comb.setSelectedIndex(0);
 //new JCheckBox
 box4=new JCheckBox("Print to File");
panel13.add(jla1);
panel13.add(comb);
panel13.add(box4);
panel1.add(panel13);
 
 panelAll.add(panel1);
//BUtton
      JPanel  panell2=new JPanel();
      GridLayout gr1= new GridLayout(4,1);
      gr1.setVgap(15);
       panell2.setLayout(gr1);
      //new Buttons
     ok=new JButton("OK");
     cancel=new JButton("Cancel");
     setup =new JButton("Setup...");
     help =new JButton("Help");
     panell2.add(ok);
     panell2.add(cancel);
     panell2.add(setup);
     panell2.add(help);
     panelAll.add(panell2);
//private Frame
    add(panelAll);
     Dimension d = new Dimension(510, 240);
        setSize(d);
    setTitle("Printer");
             
      
        setLocationRelativeTo(null);
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
   
        setVisible(true);
    }
    
   public static void main(String [] args){
       new Printer();
   }
}


