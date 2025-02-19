import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ŞifreÇözmeSayfası implements ActionListener {
    JFrame frame;
    JTextField ŞifreÇözülecekMalzeme,BasamakGirdiDeğeri;
    JButton ŞifreÇözme;
    String ÇözülmüşMalzeme;
    int BasamakdDeğeri;

    public ŞifreÇözmeSayfası(){
        frame = new JFrame("Caesar");
        frame.setSize(280,250);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setResizable(false);

        ŞifreÇözülecekMalzeme = new JTextField("Çözülecek Cümle/Kelime");
        ŞifreÇözülecekMalzeme.setPreferredSize(new Dimension(250,50));

        BasamakGirdiDeğeri =new JTextField("Basamak");
        BasamakGirdiDeğeri.setPreferredSize(new Dimension(250,50));

        ŞifreÇözme = new JButton("Çöz");
        ŞifreÇözme.setFocusable(false);
        ŞifreÇözme.setPreferredSize(new Dimension(100,50));
        ŞifreÇözme.addActionListener(this);


        frame.add(ŞifreÇözülecekMalzeme);
        frame.add(BasamakGirdiDeğeri);
        frame.add(ŞifreÇözme);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ÇözülmüşMalzeme = ŞifreÇözülecekMalzeme.getText();
        BasamakdDeğeri = Integer.parseInt(BasamakGirdiDeğeri.getText());
        System.out.println(ÇözülmüşMalzeme + BasamakdDeğeri);
        JOptionPane.showMessageDialog(null,ÇözülmüşMalzeme,"Çözüldü",JOptionPane.PLAIN_MESSAGE);
    }
}

