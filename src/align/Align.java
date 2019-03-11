
package align;

import java.awt.*;

import javax.swing.*;


public class Align extends JFrame{

    public Align() {
       this.setLayout(new FlowLayout(FlowLayout.LEFT));
     
        //*******************************
    JCheckBox   box1=new JCheckBox("Snap to Grid");
    JCheckBox   box2=new JCheckBox("Show Grid");
     JPanel pan1=new JPanel();
     pan1.setLayout(new GridLayout (2,1));
     pan1.add(box1);
      pan1.add(box2);
      add(pan1);
      //**************************************
JLabel label1=new JLabel("X :");
JLabel label2=new JLabel("Y :");
JTextField text1=new JTextField();
 JTextField text2=new JTextField();
  text1.setColumns(5);
  text2.setColumns(5);
JPanel pan2=new JPanel();
JPanel pan4=new JPanel();
 GridLayout grid= new GridLayout(2,1);
 grid.setVgap(10);
pan2.setLayout(grid);
pan4.setLayout(grid);
pan2.add(label1);
pan2.add(label2);
pan4.add(text1);
pan4.add(text2);

add(pan2);
add(pan4);
//*********************************************
//new Buttons
  JButton   ok=new JButton("OK");
  
   JButton  cancel=new JButton("Cancel");
   
   JButton  help =new JButton("Help");
     
  //add Buttons in Panel
  JPanel pan3=new JPanel();
 GridLayout gr= new GridLayout(3,2);
 gr.setVgap(15);
pan3.setLayout(gr);
     pan3.add(ok );
     pan3.add(cancel);
     pan3.add(help);
   
     add(pan3);
          this.setResizable(false);
         setLocationRelativeTo(null);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          Dimension d = new Dimension(300, 170);
        setSize(d);
       
        setVisible(true);
    }
    
   public static void main(String [] args){
       new Align();
   }  
}
