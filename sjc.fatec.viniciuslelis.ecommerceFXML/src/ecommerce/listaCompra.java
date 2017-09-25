
package ecommerce;

import java.util.List;

/**
 *
 * @author Admin
 */
public class listaCompra {
    List<Compra> listaCompra;
    
    public void addCompra(Compra compra){
        listaCompra.add(compra);
    }
    public void getCompras() {
        for(Compra compra: listaCompra) {
             
        }
    }
}
