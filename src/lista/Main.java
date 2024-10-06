package lista;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();

        list.inserirNoFim(1);
        list.inserirNoFim(3);
        list.inserirNoFim(6);
        list.inserirNoFim(10);

        System.out.println("Lista encadeada:");
        list.imprimir();

        System.out.println("Buscando o elemento 3: " + list.buscar(3));
        System.out.println("Buscando o elemento 5: " + list.buscar(5));
    }
}