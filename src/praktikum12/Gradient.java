package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Gradient extends Applet {

	@Override
	public void paint(Graphics g) {

		int h = getHeight();
		int w = getWidth();
		

		for (int y = 0; y < h; y++) {
			
			double concentrate = (double) y/h;
			
			int a = (int) (255 - 255*concentrate);

			Color color = new Color(a,a,a);

			g.setColor(color);
			g.drawLine(0, y, w, y);

		}

	}

}
