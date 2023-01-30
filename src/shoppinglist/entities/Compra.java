package shoppinglist.entities;

public class Compra {

    private Integer valor;
    private String client;

    public Compra() {

    }

    public Compra(Integer valor, String client) {
        this.valor = valor;
        this.client = client;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

}
