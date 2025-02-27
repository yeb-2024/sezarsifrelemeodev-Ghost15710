import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] seçenekler = {"Çözülecek","Yapılacak"};
        int seçenekSonuç =  JOptionPane.showOptionDialog(null,"Şifre Çözülecek mi Yapılacakmı","Seçenek",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,seçenekler,0);
        System.out.println(seçenekSonuç);
        if (seçenekSonuç == 0){
            ŞifreÇözmeSayfası a = new ŞifreÇözmeSayfası();

        } else if (seçenekSonuç == 1) {
            ŞifrelemeSayfası b = new ŞifrelemeSayfası();

        }
    }
}