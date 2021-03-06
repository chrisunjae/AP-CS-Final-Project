import java.awt.*;

import javax.swing.Icon;

public class BlackCircleIcon implements Icon {

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setColor(Color.WHITE);
		int gap = (Board.tileSize - getIconWidth())/2;
		g2.drawOval(gap-1, gap-1, getIconWidth()+2, getIconHeight()+2);
		g2.setColor(Color.BLACK);
		g2.fillOval(gap, gap, getIconWidth(), getIconHeight());
		g2.dispose();
	}

	@Override
	public int getIconWidth() {
		return (int) (0.8 * Board.tileSize);
	}

	@Override
	public int getIconHeight() {
		return (int) (0.8 * Board.tileSize);
	}

}
