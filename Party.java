import java.awt.*;
import java.awt.event.*;

class Party {
    public void buildInvite() {
        Frame f = new Frame();
        Label l = new Label("Party at Tim's");
        Button b = new Button("You bet");
        Button c = new Button("Shoot me");
        Panel p = new Panel();
        p.add(l);
        p.add(b);
        p.add(c);
        f.add(p); 
        f.setSize(300, 200); 
        f.setVisible(true); 

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Você clicou em 'You bet'");
            }
        });

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Você clicou em 'Shoot me'");
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        Party p = new Party();
        p.buildInvite();
    }
}
