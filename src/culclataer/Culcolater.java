
package culclataer;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;



public class Culcolater extends JFrame {
   Panel panel;

    public Culcolater() throws HeadlessException {
       
         panel=new Panel();
         add(panel,BorderLayout.CENTER);
         setTitle("Culcalater");
         setSize(240,280);
         setResizable(false);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
    }
   
    
    public static void main(String [] args){
        new Culcolater();
    }
    
}
