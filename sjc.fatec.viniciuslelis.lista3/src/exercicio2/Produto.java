package exercicio2;
/**
 *
 * @author Vinicius Lelis
 */
public class Produto {
    int code;
    int qtd;
    double price;
    
    public Produto(int code, int qtd, double price) {
        this.code = code;
        this.qtd = qtd;
        this.price = price;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    } 
    public int getQtd(){
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
