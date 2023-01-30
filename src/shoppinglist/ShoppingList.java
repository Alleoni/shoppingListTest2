package shoppinglist;

import java.util.ArrayList;
import java.util.List;
import shoppinglist.entities.Client;
import shoppinglist.entities.Compra;
import shoppinglist.method.CompraMethod;

public class ShoppingList {

    public static void main(String[] args) {
        List<Compra> compras = new ArrayList<>();

//        Client c1 = new Client("Marcus");
//        Client c2 = new Client("Robson");
//        Client c3 = new Client("Guilherme");

        Compra comp1 = new Compra(100, "Marcus");
        Compra comp2 = new Compra(150, "Marcus");
        Compra comp3 = new Compra(150, "Marcus");
        Compra comp4 = new Compra(200, "Robson");
        Compra comp5 = new Compra(300, "Guilherme");
        Compra comp6 = new Compra(350, "Guilherme");

        compras.add(comp1);
        compras.add(comp2);
        compras.add(comp3);
        compras.add(comp4);
        compras.add(comp5);
        compras.add(comp6);
        
        CompraMethod.returnShoppingList(compras);
        
    }

}
