package exercicio4;

/**
 *
 * @author Aluno
 */
public class Inteiros {
    int first;
    int second;
    public Inteiros(int first, int second) {
        this.first = first;
        this.second = second;
    } Inteiros() {}
    
    public int getFirst() {
        return first;
    }
    public void setFirst(int first) {
        this.first = first;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public boolean multiplo() {
        return second%first==0;
        
    }
    
}
