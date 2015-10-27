package modelo;

public class Lista {

	private int valor;
	private Lista prox;

	public Lista insere(Lista inicio, int valor) {

		Lista aux = new Lista();
		aux.valor = valor;
		aux.prox = null;

		if (inicio.valor == 0) { // aqui é para o primeiro bloco

			inicio = aux;
			
		} else {

			Lista ultimo = inicio;

			while (ultimo.prox != null) {

				ultimo = ultimo.prox;
			}
			ultimo.prox = aux;
		}

		return inicio;
	}

	public void mostrar(Lista inicio) {

		Lista aux = inicio;

		while (aux != null) {
			System.out.println(aux.valor + " -> ");
			aux = aux.prox;
		}

		System.out.println("\n");
	}

	public Lista remover(Lista inicio, int valor) {

		Lista aux = inicio;
		Lista aux2 = null;

		while(aux != null && aux.valor != valor) {
			aux2 = aux;
			aux = aux.prox;
		}

		if (aux != null) {
			
			System.out.println("Removi o valor = " + valor);
			
			// para primeiro bloco
			if (aux == inicio && aux.valor == valor) {

				inicio = inicio.prox;
			} else {

				// para blocos do meio
				if (aux != inicio && aux.prox != null && aux.valor == valor) {

					aux2.prox = aux.prox;
				} else {

					// para blocos do final
					if (aux != inicio && aux.prox == null && aux.valor == valor) {

						aux2.prox = null;
					}
				}
			}
		}else{
			
			System.out.println("Valor não existe = " + valor);
		}

		return inicio;
	}
}
