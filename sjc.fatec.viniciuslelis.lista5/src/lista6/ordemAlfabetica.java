package lista6;

import java.util.Comparator;

class ordemAlfabetica implements Comparator<Produto> {
    @Override
    public int compare(Produto um, Produto dois) {
        return um.getNome().compareTo(dois.getNome());
    }
}