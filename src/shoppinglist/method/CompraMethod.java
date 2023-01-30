package shoppinglist.method;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import shoppinglist.entities.Client;
import shoppinglist.entities.Compra;

public class CompraMethod {

    public static void returnShoppingList(List<Compra> compras) {
        Map<String, Integer> mapCompraPorCliente = new HashMap<>();
        Map<String, Integer> mapValorPorCliente = new HashMap<>();
        for (Compra compra : compras) {
            Integer comprasDoCliente = mapCompraPorCliente.getOrDefault(compra.getClient(), 0);

            comprasDoCliente++;
            mapCompraPorCliente.put(compra.getClient(), comprasDoCliente);

            mapValorPorCliente.put(compra.getClient(), compra.getValor());

            System.out.println("Cliente: " + compra.getClient() + " Valor: R$" + compra.getValor());
        }

        var maiorValor = Collections.max(mapValorPorCliente.entrySet(), Map.Entry.comparingByValue()).getKey();

        var qtdCompra = Collections.max(mapCompraPorCliente.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println();
        System.out.println("O Cliente que mais comprou em valores foi o " + maiorValor);
        System.out.println("O Cliente que mais fez compras foi o " + qtdCompra);
        
    }

}
//- Crie um método que receba uma lista de compras, com dados do cliente e valor 
//- Imprima o valor de compra por cliente.
//- Imprima o cliente que mais comprou em valores.
//- Imprima o cliente que teve o maior numero de compras.
