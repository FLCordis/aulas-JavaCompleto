package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import modelo.Pessoa;
import modelo.Genero;




@SuppressWarnings("serial")
public class UICadastroPessoa extends JFrame {

	//1. Declarar os componentes...
	private JLabel lbNome, lbEmail, lbGenero, lbCidade;
	private JTextField tfNome, tfEmail;
	private JRadioButton ckMasc, ckFem;
	private JComboBox<String> cbCidade;
	private JButton btnEnviar, btnCancelar;
	
	/**
	 * Construtor: Ele vai construir os componentes e conteúdos da tela.
	 */
	public UICadastroPessoa() {
		//... e instanciar os componentes.
		lbNome = new JLabel();
		lbEmail = new JLabel();
		lbGenero = new JLabel();
		lbCidade = new JLabel();
		
		tfNome = new JTextField();
		tfEmail = new JTextField();
		
		ckMasc = new JRadioButton("Masculino");
		ckFem = new JRadioButton("Feminino");
		
		cbCidade = new JComboBox<String>();
		
		btnEnviar = new JButton();
		btnCancelar = new JButton();
		
		//2. Definir os valores de suas propriedades (atributos)
		lbNome.setText("Nome -");
		lbEmail.setText("Email -");
		lbGenero.setText("Gênero -");
		lbCidade.setText("Cidade -");

		tfNome.setToolTipText("Informe o seu nome completo");
		tfEmail.setToolTipText("ex: usuario@server.com.br");
		
		cbCidade.addItem("Araraquara");
		cbCidade.addItem("São Carlos");
		cbCidade.addItem("Américo Brasiliense");
		cbCidade.addItem("Ribeirão Preto");
		
		btnEnviar.setText("Enviar");
		btnEnviar.setActionCommand("ENVIAR");
		
		btnCancelar.setText("Cancelar");
		btnCancelar.setActionCommand("CANCELAR");
		
		lbNome.setBounds(20, 20, 80, 20);
		lbEmail.setBounds(20, 50, 80, 20);
		lbGenero.setBounds(20, 80, 80, 20);
		lbCidade.setBounds(20, 140, 80, 20);
		
		tfNome.setBounds(120, 20, 150, 20);
		tfEmail.setBounds(120, 50, 200, 20);
		
		ckMasc.setBounds(120, 80, 120, 20);
		ckFem.setBounds(120, 110, 120, 20);
		
		cbCidade.setBounds(120, 140, 150, 20);
		
		btnEnviar.setBounds(40,180,80,20);
		btnCancelar.setBounds(160,180,110,20);
		
		//3. Adicionar o componente ao container
		this.getContentPane().add(lbNome);
		this.getContentPane().add(lbEmail);
		this.getContentPane().add(lbGenero);
		this.getContentPane().add(lbCidade);
		
		this.getContentPane().add(tfNome);
		this.getContentPane().add(tfEmail);
		
		this.getContentPane().add(ckMasc);
		this.getContentPane().add(ckFem);
		
		this.getContentPane().add(cbCidade);
		
		this.getContentPane().add(btnEnviar);
		this.getContentPane().add(btnCancelar);
		
		//4. Tratar os eventos de interesse
		
		btnEnviar.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println( getPessoa() );
						tfNome.setText("");
						tfEmail.setText("");
						
					}
					
				}
			);
		
		
		//Propriedades da Janela
		this.getContentPane().setLayout(null); 			// Desabilitando o gerenciador de Layout, para organizar os componentes.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 	// Finaliza a aplicação ao fechar a janela.
		this.setTitle("Cadastro");						// Define o título.
		this.setLocationRelativeTo(null);				// Posiciona o programa ao centro da tela.
		this.setSize(450,300);							// Define largura e altura.
	}
	
	public void setPessoa(Pessoa pessoa) {
		tfNome.setText(pessoa.getNome());
		tfEmail.setText(pessoa.getEmail());
		switch (pessoa.getSexo()) {
		case MASCULINO:
			ckMasc.setSelected(true);
			break;
		case FEMININO:
			ckFem.setSelected(true);
			break;
		}
		
		for (int i = 0; i < cbCidade.getItemCount(); i++) {
			if (cbCidade.getItemAt(i).equals(pessoa.getCidade()))
				cbCidade.setSelectedItem(i);
		}
		
	}
	
	public Pessoa getPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(tfNome.getText());
		pessoa.setEmail(tfEmail.getText());
		
		if (ckMasc.isSelected())
			pessoa.setSexo(Genero.MASCULINO);
		else
			pessoa.setSexo(Genero.FEMININO);
		
		pessoa.setCidade((String) cbCidade.getSelectedItem());
		
		return null;
	}
	
}
