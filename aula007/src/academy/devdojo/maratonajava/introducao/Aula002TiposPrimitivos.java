package academy.devdojo.maratonajava.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.8D;
        float salarioFloat = (float) 2500.8D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        // casting = Em Java, casting é a conversão de um tipo de dado para outro, de forma "forçada"
        // String não é tipo primitivo, é uma classe "começa com letra maiúscula"
        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " + nome);
    }
}
