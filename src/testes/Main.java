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
		
		Lista.mostrar(inicio);	
		
		inicio = Lista.remover(inicio, 5);
		inicio = Lista.remover(inicio, 1);
		inicio = Lista.remover(inicio, 6);
		inicio = Lista.remover(inicio, 7);
		inicio = Lista.remover(inicio, 4);
		inicio = Lista.remover(inicio, 3);
		inicio = Lista.remover(inicio, 3);
		
		Lista.mostrar(inicio);
	}
}
