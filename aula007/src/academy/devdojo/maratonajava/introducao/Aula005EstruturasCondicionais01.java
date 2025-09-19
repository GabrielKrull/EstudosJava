package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        //!
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoólica.");
        }else{
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
        System.out.println("Sout fora do if");
    }
}
