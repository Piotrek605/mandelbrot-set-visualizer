import javax.swing.JFrame;

public class MandelbrotGUI
{
	public static void main(String[] args)
	{
		Complex leftUp = new Complex(-2.0, 1.5);
		Complex rightDown = new Complex(1, -1.5);
		int max = 100;
		double coefficient = 5.0;
		
		MandelbrotSet set = new MandelbrotSet(leftUp, rightDown, max, coefficient);
		MandelbrotComponent comp = new MandelbrotComponent(set);

		JFrame frame = new JFrame("Mandelbrot Set");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(comp);
		frame.setVisible(true);
	}
}