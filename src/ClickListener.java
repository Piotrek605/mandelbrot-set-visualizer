import java.awt.event.*;

public class ClickListener implements MouseListener
{
	private MandelbrotModel model;
	
	private double height;
	private double width;

	public ClickListener(MandelbrotModel model, double height, double width)
	{
		this.model = model;
		
		this.height = height;
		this.width = width;
	}

	public void mouseClicked(MouseEvent e)
	{
		int i = e.getX();
        int j = e.getY();
        
        double left = model.getLeftUp().getReal();
		double up = model.getLeftUp().getImaginary();
		double right = model.getRightDown().getReal();
		double down = model.getRightDown().getImaginary();
		
		double x = (double)i / (double)width * ((double)right - (double)left) + (double)left;
		double y = (double)j / (double)height * ((double)down - (double)up) + (double)up;
		
		double width2 = right - left;
		double height2 = down - up;
		
		double coefficient = model.getCoefficient();
		
		Complex leftUp = new Complex((double)x - width2 / coefficient, (double)y - height2 / coefficient);
		Complex rightDown = new Complex((double)x + width2 / coefficient, (double)y + height2 / coefficient);
		
		model.setLeftUp(leftUp);
		model.setRightDown(rightDown);
		
		model.setMax((int)(model.getMax() * (1.0 + 1.0 / coefficient)));
	}
	
	public void mouseEntered(MouseEvent e)
	{
	}
	
	public void mouseExited(MouseEvent e)
	{
	}
	
	public void mousePressed(MouseEvent e)
	{
	}
	
	public void mouseReleased(MouseEvent e)
	{
	}
	
	public void changeHeight(int height)
	{
		this.height = height;
	}
	
	public void changeWidth(int width)
	{
		this.width = width;
	}
}
