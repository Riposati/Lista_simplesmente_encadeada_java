package testes;

import modelo.Lista;

public class Main {

	public static void main(String[] args) {
		
		Lista lista = null;
		
		lista = Lista.insere(lista, 0);
		lista = Lista.insere(lista, 1);
		lista = Lista.insere(lista, 2);
		lista = Lista.insere(lista, 3);
		lista = Lista.insere(lista, 4);
		lista = Lista.insere(lista, 5);
		
		lista.mostrar(lista);	
		
		/*lista = lista.remover(lista, 5);
		lista = lista.remover(lista, 1);
		lista = lista.remover(lista, 6);
		lista = lista.remover(lista, 7);
		lista = lista.remover(lista, 4);
		lista = lista.remover(lista, 3);
		lista = lista.remover(lista, 3);
		*/
	}
}
