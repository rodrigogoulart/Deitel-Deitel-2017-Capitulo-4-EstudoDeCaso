/*
 * Estudo de caso proposto por Deitel e Deitel.
 * HARVEY M. DEITEL; PAUL J. DEITEL; EDSON FURMANKIEWICZ; 
 * FÁBIO LUIS PICELLI LUCCHINI. Java. Editora Pearson, 
 * 2017. 935 p. ISBN 9788543004792..
 */
import javax.swing.JFrame;

public class DrawPanelTest_4_1_b {

	public static void main(String[] args) {

		// cria um painel que contém nosso desenho
		DrawPanel_4_1_b panel = new DrawPanel_4_1_b();
		
		// cria um novo quadro/janela para armazenar o painel
		JFrame application = new JFrame();
		
		// configura o frame para ele ser encerrado quando a janela fechar
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				
		application.add( panel ); // adiciona o painel ao frame
		application.setSize( 250, 250); // configura o tamanho do frame
		application.setVisible( true ); // torna o frame visível
		
	} // fim do main

} // fim da classe DrawPanelTest
