import Aulas.Aula1;
import javax.swing.JOptionPane;
import java.lang.Object;

public class Main {
    public static void main(String[] args) {

        double[] vet = {10, 20, 30};
        Aula1 aula = new Aula1();

        double media = aula.caucularMedia(vet);

        JOptionPane.showMessageDialog(null, "MEDIA: " + media, "MEDIA", 1);

        if (media != 20){
            JOptionPane.showMessageDialog(null,"Falha! O resultado da média está incorreto!", "MEDIA", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Teste passou! A média está correta", "MEDIA", 1);
        }

    }
}