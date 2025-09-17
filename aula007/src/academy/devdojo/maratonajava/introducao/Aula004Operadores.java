package academy.devdojo.maratonajava.introducao;

public class Aula004Operadores {
    public static void main(String[]args){
        // + - / *
        int num1 = 10;
        int num2 = 20;
        int resultado1 = num1 + num2;
        int resultado2 = num1 - num2;
        int resultado3 = num1 * num2;
        double resultado4 = num1 / (double) num2; //divi de 2 num inteiros só da num inteiro
        System.out.println(num2 + num1 + "Valor" + num2 + num1);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte? " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte? " + isDezMenorQueVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("Está dentro da lei?" + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da lei?" + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystation5Compravel  = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("isPlaystation5Compravel " + isPlaystation5Compravel);
    }
}
