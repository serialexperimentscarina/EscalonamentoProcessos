package view;

import javax.swing.JOptionPane;

import br.com.serialexperimentscarina.filaobject.FilaObject;
import controller.EscalonadorController;
import model.Processo;

public class Principal {

	public static void main(String[] args) {
		FilaObject fila = new FilaObject();
		EscalonadorController escalonadorRoundRobin = new EscalonadorController();
		int num = 0;

		do {
			try {
				String input = JOptionPane.showInputDialog("Digite o número de processo na fila: ", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando");
					System.exit(0);
				}
				num = Integer.parseInt(input);
				if (num <= 0) {
					JOptionPane.showMessageDialog(null, "Número de processos inválido");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número de processos inválido");
				continue;
			}
			break;
		} while(true);
		
		for (int i = 1; i <= num; i++) {
			Processo p = new Processo();
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "º processo: ", "");
			if (nome == null) {
				JOptionPane.showMessageDialog(null, "Encerrando");
				System.exit(0);
			}
			p.nome = nome;
			do {
				try {
					String input = JOptionPane.showInputDialog("Digite a quantidade de retornos do processo: ", "");
					if (input == null) {
						JOptionPane.showMessageDialog(null, "Encerrando");
						System.exit(0);
					}
					int qtdRet = Integer.parseInt(input);
					if (qtdRet <= 0) {
						JOptionPane.showMessageDialog(null, "Número de retornos inválido");
						continue;
					}
					p.qtdRetornos = qtdRet;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Número de retornos inválido");
					continue;
				}
				fila.insert(p);
				break;
			} while(true);
		}
		
		while(!fila.isEmpty()) {
			try {
				escalonadorRoundRobin.escalonador(fila);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
