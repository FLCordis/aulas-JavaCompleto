import javax.swing.JFrame;

public class ExJButton {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame janela = new JFrame();
		
		janela.setTitle("Olá Swing!");
		janela.setSize(300,150);
		janela.setLocationRelativeTo(null);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
