
package culclataer;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Panel extends JPanel{
 private JPanel panel;
 private JButton[] buttons;
 private JTextField text;

    public Panel() {
        GridLayout d=new GridLayout(4,4);
        d.setVgap(6);
        d.setHgap(6);
        panel=new JPanel(d);
        buttons=new JButton[16];
        String test[]={"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
        for (int i = 0; i < test.length; i++) {
            buttons[i]=new JButton(test[i]);
             }
      
       
       // EventHandler eventHandler = new EventHandler();
        for(JButton button:buttons){
        //   button.addActionListener(eventHandler);
           button.setFont(new Font("Serif", Font.BOLD, 14));
           
           panel.add(button);
        }
         text=new JTextField("LCD");
         text.setFont(new Font("Arial",Font.BOLD,20));
         text.setForeground(Color.BLUE);
         this.setLayout(new BorderLayout());
         add(text,BorderLayout.NORTH);
         add(panel,BorderLayout.CENTER);
    }
// private class EventHandler implements ActionListener{
//     @Override
//        public void actionPerformed(ActionEvent e) {
//            text.setText(
//                    ((AbstractButton) e.getSource()).getText());
//
//         }
//
//     }
}


