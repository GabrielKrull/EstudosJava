package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais03 {
    public static void main(String[] args){
        // doar se salário > 5000
        double salario = 3000;
        // (condição) ? verdadeiro : falso
        
        String resultado = salario > 5000 ? "Eu vou doar quinhentão pro DevDojo" : "Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);
    }
}
