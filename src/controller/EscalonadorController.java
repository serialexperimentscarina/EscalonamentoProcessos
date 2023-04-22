package controller;

import br.com.serialexperimentscarina.filaobject.FilaObject;
import model.Processo;

public class EscalonadorController {
	
	public void escalonador(FilaObject fila) throws Exception {
		Processo processo = (Processo) fila.remove();
		if (processo.qtdRetornos > 1) {
			processo.qtdRetornos--;
			fila.insert(processo);
		}
		System.out.println("O processo " + processo + " foi executado.");
	}

}
