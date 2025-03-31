public class Compra implements Comparable<Compra> {
    private String descriçao;
    private double valor;

    public Compra(String descriçao, double valor) {
        this.descriçao = descriçao;
        this.valor = valor;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descriçao + " " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(outraCompra.getValor());
    }
}
