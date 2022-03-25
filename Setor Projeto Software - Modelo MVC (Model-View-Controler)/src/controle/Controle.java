package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import visao.Visao;

public class Controle implements ActionListener {
	
	private Visao visao;
	
	public Controle(Visao visao) {
		this.visao = visao;
		visao.configuraOuvinte(this);
	}

	public void inicia() {
		visao.setVisible(true);
		visao.configuraModoPadrao();
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("equal")) {
			Modelo m = visao.leModelo();
			
			Double num1 = m.getNum1();
			Double num2 = m.getNum2();
			String operacao = m.getOperacao();
			
			Double result;
			if (operacao.equals("+"))
				result = num1 + num2;
			else if (operacao.equals("-"))
				result = num1 - num2;
			else if (operacao.equals("*"))
				result = num1 * num2;
			else
				result = num1 / num2;
					
			m.setResult(result);
			visao.escreveModelo(m);
		}
	}
}