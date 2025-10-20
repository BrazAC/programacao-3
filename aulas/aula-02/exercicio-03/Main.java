import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        //Instanciar objeto ArrayList
        ArrayList<String> minhaLista = new ArrayList<String>();

        //Inserir nomes na lista (usar do comportamento da estrutura de dados)
        minhaLista.add("Linus Torvalds");
        minhaLista.add("Ada Lovelace");
        minhaLista.add("Zeze de Camargo");
        minhaLista.add("Elon mosca");
        minhaLista.add("Hans Zimmer");

        //Percorrer a lista com iterator
        Iterator<String> objIterator = minhaLista.iterator();
        while(objIterator.hasNext()){
            //Exibir nome
            System.out.printf("[%s]", (String)objIterator.next());
        }
        System.out.println("");

        //Remover um elemento da lista
        minhaLista.remove(3);

        //Percorrer a lista com iterator
        objIterator = minhaLista.iterator();
        while(objIterator.hasNext()){
            //Exibir nome
            System.out.printf("[%s]", (String)objIterator.next());
        }
        System.out.println("");
    }
}