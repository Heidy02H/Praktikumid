package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Spiral extends Applet{
	
	
	private Graphics g;

	public void paint(Graphics g) {
		this.g = g;
		fillBg();
		drawSpiral();
	}

	/**
	 * Katab tausta valgega
	 */
	public void fillBg() {
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);
	}

	/**
	 * Joonistab spiraali
	 */
	public void drawSpiral() {
		g.setColor(Color.black);
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		int lastX = -1;
		int lastY = -1;
		

		for (double deg = 0; deg <= Math.PI * 4; deg = deg + .03) {
			double radius = 10 + deg *3;
			int x = (int) (radius * Math.cos(deg))+ centerX;
			int y = (int) (radius * Math.sin(deg)) + centerY;
			
			
			if (0 != lastX) {
				g.drawLine(x, y, lastX, lastY);
			}
			
			x = lastX;
			y = lastY;
		}
	}
	
	

}
