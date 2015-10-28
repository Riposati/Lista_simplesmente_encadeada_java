package testes;

import modelo.Lista;

public class Main {

	public static void main(String[] args) {
		
		Lista inicio = null;
		
		inicio = Lista.insere(inicio, 0);
		inicio = Lista.insere(inicio, 1);
		inicio = Lista.insere(inicio, 2);
		inicio = Lista.insere(inicio, 3);
		inicio = Lista.insere(inicio, 4);
		inicio = Lista.insere(inicio, 5);
		
		inicio.mostrar(inicio);	
		
		inicio = inicio.remover(inicio, 5);
		inicio = inicio.remover(inicio, 1);
		inicio = inicio.remover(inicio, 6);
		inicio = inicio.remover(inicio, 7);
		inicio = inicio.remover(inicio, 4);
		inicio = inicio.remover(inicio, 3);
		inicio = inicio.remover(inicio, 3);
		
		inicio.mostrar(inicio);
	}
}
