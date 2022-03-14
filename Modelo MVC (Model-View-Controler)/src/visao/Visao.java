package visao;

import java.awt.Rectangle;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Modelo;
import javax.swing.JComboBox;


@SuppressWarnings("serial")
public class Visao extends JFrame {

	private JPanel jContentPane = null;
	private JTextField num1Field = null;
	private JTextField num2Field = null;
	private JButton equalButton = null;
	private JTextField resultField = null;
	private JComboBox<String> comboOperacoes = null;

	public Visao() {
		super();
		initialize();
	}

	private void initialize() {
		this.setSize(333, 95);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getNum1Field(), null);
			jContentPane.add(getNum2Field(), null);
			jContentPane.add(getEqualButton(), null);
			jContentPane.add(getResultField(), null);
			jContentPane.add(getComboOperacoes(), null);
		}
		return jContentPane;
	}

	private JTextField getNum1Field() {
		if (num1Field == null) {
			num1Field = new JTextField();
			num1Field.setBounds(new Rectangle(11, 16, 49, 20));
		}
		return num1Field;
	}

	private JTextField getNum2Field() {
		if (num2Field == null) {
			num2Field = new JTextField();
			num2Field.setBounds(new Rectangle(113, 16, 50, 20));
		}
		return num2Field;
	}

	private JButton getEqualButton() {
		if (equalButton == null) {
			equalButton = new JButton();
			equalButton.setBounds(new Rectangle(174, 14, 54, 26));
			equalButton.setText("=");
		}
		equalButton.setActionCommand("equal");
		return equalButton;
	}

	private JTextField getResultField() {
		if (resultField == null) {
			resultField = new JTextField();
			resultField.setBounds(new Rectangle(243, 17, 54, 20));
		}
		return resultField;
	}

	private JComboBox<String> getComboOperacoes() {
		if (comboOperacoes == null) {
			comboOperacoes = new JComboBox<String>(new String [] {"+","-","/","*"});
			comboOperacoes.setBounds(new Rectangle(66, 17, 38, 20));
		}
		comboOperacoes.setActionCommand("combo");
		return comboOperacoes;
	}
		
	//
	// Mecanismo de Leitura/Escrita do Modelo
	//
	public void escreveModelo(Modelo modelo) {
		Double num1 = modelo.getNum1();
		Double num2 = modelo.getNum2();
		Double result = modelo.getResult();
		
		num1Field.setText(num1.toString());
		num2Field.setText(num2.toString());
		resultField.setText(result.toString());
	}
	
	public Modelo leModelo() {
		String num1s = num1Field.getText();
		String num2s = num2Field.getText();
		String results = resultField.getText();
		String operacao = (String)(comboOperacoes.getSelectedItem());
		try {
			Double num1 = null;
			Double num2 = null;
			Double result = null;
			
			if (!num1s.equals(""))
				num1 = Double.parseDouble(num1s);
			if (!num2s.equals(""))
				num2 = Double.parseDouble(num2s);
			if (!results.equals(""))
				result = Double.parseDouble(results);
			
			Modelo m = new Modelo();
			m.setNum1(num1);
			m.setNum2(num2);
			m.setResult(result);
			m.setOperacao(operacao);
			
			return m;
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Entrada Inválida");
			return null;
		}		
	}
	
	//
	// Mecanismo de Configuração dos Modos de Apresentação
	//
	public void configuraModoPadrao() {
		num1Field.setEnabled(true);
		num2Field.setEnabled(true);
		resultField.setEnabled(false);
		equalButton.setEnabled(true);
	}
	
	//
	// Mecanismo de Configuração do(s) Ouvinte(s)
	//
	public void configuraOuvinte(ActionListener ouvinte) {
		equalButton.addActionListener(ouvinte);
	}
	
}