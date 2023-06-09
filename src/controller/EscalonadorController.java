package controller;

import br.com.serialexperimentscarina.filaobject.FilaObject;
import model.Processo;

public class EscalonadorController {
	
	// Recebe uma Fila de processos, como parâmetros, verifica se o número
	// de vezes é maior que 1, decrementa esse valor no objeto e, se for maior que 1, insere o objeto
	// novamente na fila;
	public void escalonador(FilaObject fila) throws Exception {
		Processo processo = (Processo) fila.remove();
		processo.qtdRetornos--;
		if (processo.qtdRetornos >= 1) {
			fila.insert(processo);
		}
		System.out.println("O processo " + processo + " foi executado.");
	}

}
