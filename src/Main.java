import Aulas.Aula1;

public class Main {
    public static void main(String[] args) {
        double[] vet = {10,20,30};
        Aula1 aula = new Aula1();

        double media = aula.caucularMedia(vet);

        System.out.println(media);

        if (media != 20){
            System.out.println("Falha! O resultado da média está incorreto!");
        } else {
            System.out.println("Teste passou! A média está correta");
        }

    }
}