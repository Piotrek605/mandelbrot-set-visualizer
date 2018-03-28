import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Observer;
import java.util.Observable;
import java.awt.Rectangle;

public class MandelbrotView extends JPanel implements Observer
{
	private static final long serialVersionUID = 1708702263244901142L;

	private MandelbrotModel model;
	
	private int height = getHeight();
	private int width = getWidth();
	
	private ClickListener listener;

	public MandelbrotView(MandelbrotModel model)
	{
		super();
		this.model = model;
		listener = new ClickListener(model, height, width);
		addMouseListener(listener);
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;

		height = getHeight();
		width = getWidth();
		
		listener.changeHeight(height);
		listener.changeWidth(width);
		
		double left = model.getLeftUp().getReal();
		double up = model.getLeftUp().getImaginary();
		double right = model.getRightDown().getReal();
		double down = model.getRightDown().getImaginary();

		g2.clearRect(0, 0, width, height);

		for(int i = 0; i < width; i++)
		{
			for(int j = 0; j < height; j++)
			{
				double x = (double)i / (double)width * ((double)right - (double)left) + (double)left;
				double y = (double)j / (double)height * ((double)down - (double)up) + (double)up;
				
				Complex number = new Complex(x, y);

				Rectangle point = new Rectangle(i, j, 1, 1);

				int iterations = model.iterations(number);
				
				int hue = (int)((double)iterations / (double)model.getMax() * 255.0);
				g2.setColor(new Color(hue, hue, hue));

				g2.fill(point);
			}
		}
	}

	public void update(Observable obs, Object obj)
	{
		repaint();
	}
}