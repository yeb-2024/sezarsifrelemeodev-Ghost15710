import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ŞifreÇözmeSayfası implements ActionListener {
    JFrame frame;
    JTextField ŞifreÇözülecekMalzeme, BasamakGirdiDeğeri;
    JButton ŞifreÇözme;
    String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public ŞifreÇözmeSayfası() {
        frame = new JFrame("Caesar");
        frame.setSize(280, 250);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setResizable(false);

        ŞifreÇözülecekMalzeme = new JTextField("Çözülecek Cümle/Kelime");
        ŞifreÇözülecekMalzeme.setPreferredSize(new Dimension(250, 50));

        BasamakGirdiDeğeri = new JTextField("Basamak");
        BasamakGirdiDeğeri.setPreferredSize(new Dimension(250, 50));

        ŞifreÇözme = new JButton("Çöz");
        ŞifreÇözme.setFocusable(false);
        ŞifreÇözme.setPreferredSize(new Dimension(100, 50));
        ŞifreÇözme.addActionListener(this);

        frame.add(ŞifreÇözülecekMalzeme);
        frame.add(BasamakGirdiDeğeri);
        frame.add(ŞifreÇözme);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String çözülmüşMalzeme = ŞifreÇözülecekMalzeme.getText().toUpperCase();
        int basamakDeğeri = Integer.parseInt(BasamakGirdiDeğeri.getText());
        StringBuilder sonuçKelime = new StringBuilder();

        for (int i = 0; i < çözülmüşMalzeme.length(); i++) {
            char harf = çözülmüşMalzeme.charAt(i);
            if (SYMBOLS.indexOf(harf) != -1) {
                int index = SYMBOLS.indexOf(harf);
                int yeniIndex = (index - basamakDeğeri + SYMBOLS.length()) % SYMBOLS.length();
                char yeniHarf = SYMBOLS.charAt(yeniIndex);
                sonuçKelime.append(yeniHarf);
            } else {
                sonuçKelime.append(harf); // Eğer harf sembol değilse, olduğu gibi ekle
            }
        }

        String şifreÇözülmüşSonuç = sonuçKelime.toString();
        System.out.println("Çözülen Cümle/Kelime: " + şifreÇözülmüşSonuç);
        JOptionPane.showMessageDialog(null, şifreÇözülmüşSonuç, "Çözüldü", JOptionPane.PLAIN_MESSAGE);
    }
}

