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
        p.add(b); // Adiciona o botão "You bet"
        p.add(c); // Adiciona o botão "Shoot me"
        f.add(p); // Adiciona o painel ao frame
        f.setSize(300, 200); // Define o tamanho da janela
        f.setVisible(true); // Torna a janela visível

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

        // Fecha a janela ao clicar no X
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
