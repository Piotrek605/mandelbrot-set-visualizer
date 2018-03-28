import java.util.Observable;

public class MandelbrotModel extends Observable
{
	private MandelbrotSet set;
	
	public MandelbrotModel(MandelbrotSet set)
	{
		super();
		this.set = set;
	}
	
	public int iterations(Complex x)
	{
		return set.iterations(x);
	}
	
	public Complex getLeftUp()
	{
		return set.getLeftUp();
	}
	
	public Complex getRightDown()
	{
		return set.getRightDown();
	}
	
	public int getMax()
	{
		return set.getMax();
	}
	
	public double getCoefficient()
	{
		return set.getCoefficient();
	}
	
	public void setLeftUp(Complex leftUp)
	{
		set.setLeftUp(leftUp);
		setChanged();
		notifyObservers();
	}
	
	public void setRightDown(Complex rightDown)
	{
		set.setRightDown(rightDown);
		setChanged();
		notifyObservers();
	}
	
	public void setMax(int max)
	{
		set.setMax(max);
		setChanged();
		notifyObservers();
	}
	
	public void setCoefficient(double coefficient)
	{
		set.setCoefficient(coefficient);
	}
}
