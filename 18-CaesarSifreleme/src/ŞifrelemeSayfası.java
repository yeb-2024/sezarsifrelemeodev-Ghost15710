import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ŞifrelemeSayfası implements ActionListener {

    JFrame frame;
    JTextField ŞifrelenecekMalzeme, BasamakGirdiDeğeri;
    JButton ŞifreleButton;
    String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public ŞifrelemeSayfası() {
        frame = new JFrame("Caesar");
        frame.setSize(280, 250);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setResizable(false);

        ŞifrelenecekMalzeme = new JTextField("Şifrelenecek Cümle/Kelime");
        ŞifrelenecekMalzeme.setPreferredSize(new Dimension(250, 50));

        BasamakGirdiDeğeri = new JTextField("Basamak");
        BasamakGirdiDeğeri.setPreferredSize(new Dimension(250, 50));

        ŞifreleButton = new JButton("Şifrele");
        ŞifreleButton.setFocusable(false);
        ŞifreleButton.setPreferredSize(new Dimension(100, 50));
        ŞifreleButton.addActionListener(this);

        frame.add(ŞifrelenecekMalzeme);
        frame.add(BasamakGirdiDeğeri);
        frame.add(ŞifreleButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String şifrelenmişMalzeme = ŞifrelenecekMalzeme.getText().toUpperCase();
        int basamakDeğeri = Integer.parseInt(BasamakGirdiDeğeri.getText());
        StringBuilder sonuçKelime = new StringBuilder();

        for (int i = 0; i < şifrelenmişMalzeme.length(); i++) {
            char harf = şifrelenmişMalzeme.charAt(i);
            if (SYMBOLS.indexOf(harf) != -1) {
                int index = SYMBOLS.indexOf(harf);
                int yeniIndex = (index + basamakDeğeri) % SYMBOLS.length();
                char yeniHarf = SYMBOLS.charAt(yeniIndex);
                sonuçKelime.append(yeniHarf);
            } else {
                sonuçKelime.append(harf);
            }
        }
        System.out.println("Encrypted Text: " + sonuçKelime.toString());
        JOptionPane.showMessageDialog(null, sonuçKelime.toString(), "Şifrelendi", JOptionPane.PLAIN_MESSAGE);

    }
}
