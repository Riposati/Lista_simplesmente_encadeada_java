package testes;

import modelo.Lista;

public class Main {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista = lista.insere(lista, 1);
		lista = lista.insere(lista, 2);
		lista = lista.insere(lista, 3);
		lista = lista.insere(lista, 4);
		lista = lista.insere(lista, 5);
		lista = lista.insere(lista, 6);
		
		lista.mostrar(lista);	
		
		lista = lista.remover(lista, 5);
		lista = lista.remover(lista, 1);
		lista = lista.remover(lista, 6);
		lista = lista.remover(lista, 7);
		lista = lista.remover(lista, 4);
		lista = lista.remover(lista, 3);
		lista = lista.remover(lista, 3);
		
		lista.mostrar(lista);
	}
}
