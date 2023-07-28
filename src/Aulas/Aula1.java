package Aulas;

public class Aula1 {
    public double caucularMedia(double[] valores){
        //return sum(valores) / valores.length - 1; -> ERRO DEMONSTRADO EM SALA!
        return sum(valores) / valores.length ;
    }

    public double sum(double[] valores){
        double soma = 0;
        for (double valor : valores){
            soma += valor;
        }
        return soma;
    }
}
