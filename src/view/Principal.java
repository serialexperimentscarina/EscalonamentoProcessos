package view;

import br.com.serialexperimentscarina.filaobject.FilaObject;
import controller.EscalonadorController;
import model.Processo;

public class Principal {

	public static void main(String[] args) {
		FilaObject fila = new FilaObject();
		EscalonadorController escalonadorRoundRobin = new EscalonadorController();

		Processo p1 = new Processo();
		p1.nome = "notepad.exe";
		p1.qtdRetornos = 14;
		fila.insert(p1);
		Processo p2 = new Processo();
		p2.nome = "write.exe";
		p2.qtdRetornos = 35;
		fila.insert(p2);
		Processo p3 = new Processo();
		p3.nome = "chrome.exe";
		p3.qtdRetornos = 27;
		fila.insert(p3);
		Processo p4 = new Processo();
		p4.nome = "acrobat.exe";
		p4.qtdRetornos = 52;
		fila.insert(p4);
		Processo p5 = new Processo();
		p5.nome = "firefox.exe";
		p5.qtdRetornos = 18;
		fila.insert(p5);
		Processo p6 = new Processo();
		p6.nome = "word.exe";
		p6.qtdRetornos = 25;
		fila.insert(p6);
		
		while(!fila.isEmpty()) {
			try {
				escalonadorRoundRobin.escalonador(fila);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
