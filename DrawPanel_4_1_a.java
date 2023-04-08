/*
 * Estudo de caso proposto por Deitel e Deitel.
 * HARVEY M. DEITEL; PAUL J. DEITEL; EDSON FURMANKIEWICZ; 
 * FÁBIO LUIS PICELLI LUCCHINI. Java. Editora Pearson, 
 * 2017. 935 p. ISBN 9788543004792.
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel_4_1_a extends JPanel{

	// desenha um X a partir dos cantos do painel
	public void paintComponent( Graphics g ) {
		
		// chamaPaintComponent para garantir que o painel seja exibido corretamente
		super.paintComponent( g );
		
		int width = getWidth(); // largura total
		int height = getHeight(); // altura total

		int x = 15;
		int y = 0;
		
		while ( x <= height ) {
			g.drawLine( 0, y, x, height);
			x += 15;
			y += 15;
		}
		
	} // fim do método paintComponente
	
} // fim da classe DrawPanel
