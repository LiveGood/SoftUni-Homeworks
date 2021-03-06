
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class _10PaintHouseNiki {

	// Main class that calls the drawing class paint(); and exports it as svg/html;
	public static void main(String[] args) throws IOException {
		_10PaintHouseNiki sv2Demo = new _10PaintHouseNiki();
		DOMImplementation domImpl = GenericDOMImplementation
				.getDOMImplementation();
		Document doc = domImpl.createDocument(null, "svg", null);
		SVGGraphics2D svg = new SVGGraphics2D(doc);
		sv2Demo.paint(svg);
		svg.stream(new FileWriter("house.html"), false);
	}

	
	public void paint(Graphics g) {

		// Input;
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		boolean isInside = false;

		// Checks if its isInside or outside and returns boolean variable isInside;
		double x1 = 12.5, y1 = 8.5;
		double x2 = 17.5, y2 = 3.5;
		double x3 = 22.5, y3 = 8.5;
		double abv = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		double abp = Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
		double apc = Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
		double pbc = Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));

		boolean isInTriangle = abp + apc + pbc == abv;
		if ((x >= 12.5 && x <= 17.5) && (y <= 13.5 && y >= 8.5)) {
			isInside = true;
		} else if ((x >= 20 && x <= 22.5) && (y <= 13.5 && y >= 8.5)) {
			isInside = true;
		}

		else if (isInTriangle) {
			isInside = true;
		} else {
			isInside = false;
		}

		// Draws the dotted axes;
		DrawAxes(g);
		// Draws the "House" figure;
		DrawFigure(g);

		double xInput = (x - 10) * 22 + 58;
		double yInput = (y - 3.5) * 22 + 36;
		DrawPoint(xInput, yInput, g, isInside);
	}

	// Method for drawing the point according to the input;
	private void DrawPoint(double x, double y, Graphics g, boolean dot) {

		if (dot == false) {
			Graphics2D circleOut = (Graphics2D) g;
			circleOut.setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, 0.3f));
			circleOut.drawOval((int) x, (int) y, 8, 8);
			circleOut.fillOval((int) x, (int) y, 8, 8);
		} else {
			Graphics2D circleIn = (Graphics2D) g;
			circleIn.setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, 0.9f));
			circleIn.drawOval((int) x, (int) y, 8, 8);
			circleIn.fillOval((int) x, (int) y, 8, 8);
		}

	}

	// Method for drawing the dotted axes;
	public static void DrawAxes(Graphics g) {

		Graphics2D graph = (Graphics2D) g;

		float[] dash = { 1f, 1f, 1f };

		BasicStroke dotted = new BasicStroke(1, BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_ROUND, 1.0f, dash, 2f);
		graph.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
				0.3f));

		graph.setStroke(dotted);
		graph.setFont(new Font("Arial", Font.PLAIN, 18));

		graph.drawLine(49, 40, 353, 40);
		graph.drawLine(49, 95, 353, 95);
		graph.drawLine(49, 150, 353, 150);
		graph.drawLine(49, 205, 353, 205);
		graph.drawLine(49, 260, 353, 260);
		graph.drawLine(49, 315, 353, 315);

		graph.drawLine(62, 27, 62, 330);
		graph.drawLine(117, 27, 117, 330);
		graph.drawLine(172, 27, 172, 330);
		graph.drawLine(227, 27, 227, 330);
		graph.drawLine(282, 27, 282, 330);
		graph.drawLine(337, 27, 337, 330);

		// Draws the numbers around the axes;
		DrawNumbers(g);
	}

	// Method for drawing the numbers around the axes;
	private static void DrawNumbers(Graphics g) {

		Graphics2D nums = (Graphics2D) g;
		nums.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
				0.9f));

		nums.drawString("10", 52, 20);
		nums.drawString("12.5", 102, 20);
		nums.drawString("15", 162, 20);
		nums.drawString("17.5", 209, 20);
		nums.drawString("20", 272, 20);
		nums.drawString("22.5", 319, 20);

		nums.drawString("3.5", 20, 46);
		nums.drawString("6", 35, 101);
		nums.drawString("8.5", 20, 156);
		nums.drawString("11", 27, 211);
		nums.drawString("13.5", 11, 266);
		nums.drawString("16", 26, 321);

	}

	// Method for drawing the "House";
	public static void DrawFigure(Graphics g) {
		// Draws the strokes;
		drawStrokes(g);
		// Draws the transparent fill;
		drawShapes(g);
	}

	// Method for drawing the strokes of the "House";
	private static void drawStrokes(Graphics g) {
		Graphics2D stroke = (Graphics2D) g;

		float[] dash = { 500f };

		BasicStroke dotted = new BasicStroke(1.5f, BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_ROUND, 1.0f, dash, 2f);

		stroke.setStroke(dotted);

		stroke.drawRect(117, 150, 110, 110);
		stroke.drawRect(282, 150, 55, 110);

		int xPoints[] = { 117, 227, 337 };
		int yPoints[] = { 150, 40, 150 };
		int nPoints = 3;

		stroke.drawPolygon(xPoints, yPoints, nPoints);
	}
	
	// Method for drawing the trnsparent fill of the "House";
		private static void drawShapes(Graphics g) {
			Graphics2D fill = (Graphics2D) g;

			fill.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
					0.3f));
			fill.fillRect(117, 150, 110, 110);

			fill.fillRect(282, 150, 55, 110);

			int xPoints[] = { 117, 227, 337 };
			int yPoints[] = { 150, 40, 150 };
			int nPoints = 3;

			fill.fillPolygon(xPoints, yPoints, nPoints);
		}
}
