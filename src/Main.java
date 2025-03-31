import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sinalSaida = 1;

        System.out.println("Informe o limite do cartão de credito");
        double limiteCartao = sc.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);

        while(sinalSaida != 0){
            System.out.println("O que deseja comprar?");
            String produto = sc.next();
            System.out.println("Informe o valor");
            double valor = sc.nextDouble();

            limiteCartao = limiteCartao - valor;
            boolean compraRealizada =  cartao.lancaCompra(new Compra(produto, valor));
            if (!compraRealizada) {
                System.out.println("Saldo insuficiente \n");
                break;
            }
            System.out.println("Compra realizada com sucesso \n");

            System.out.println("Deseja continuar comprando? 1-sim 0-nao");
            sinalSaida = sc.nextInt();
            if (sinalSaida == 0) {
                break;
            }

        }
        System.out.println("Saldo Final: " + cartao.getSaldo());
        System.out.println("**********************************************");
        System.out.println("Compras Realizadas");
        Collections.sort(cartao.getCompras());
        for (Compra compra : cartao.getCompras()) {
            System.out.println(compra.toString());
        }
        System.out.println("**********************************************");
        System.out.println("**********************************************");



    }
}
