public class MandelbrotSet
{
	private Complex leftUp;
	private Complex rightDown;
	
	private int max;
	private double coefficient;
	
	public MandelbrotSet(Complex leftUp, Complex rightDown, int max, double coefficient)
	{
		this.leftUp = leftUp;
		this.rightDown = rightDown;
		
		this.max = max;
		this.coefficient = coefficient;
	}
	
	public int iterations(Complex x)
	{
		Complex c = x;
		for(int i = 0; i < max; i++)
		{
			if(x.abs() >= 2.0)
			{
				return i;
			}
			x = Complex.add(Complex.multiply(x, x), c);
		}
		return 0;
	}
	
	public Complex getLeftUp()
	{
		return leftUp;
	}
	
	public Complex getRightDown()
	{
		return rightDown;
	}
	
	public int getMax()
	{
		return max;
	}
	
	public double getCoefficient()
	{
		return coefficient;
	}
	
	public void setLeftUp(Complex leftUp)
	{
		this.leftUp = leftUp;
	}
	
	public void setRightDown(Complex rightDown)
	{
		this.rightDown = rightDown;
	}
	
	public void setMax(int max)
	{
		this.max = max;
	}
	
	public void setCoefficient(double coefficient)
	{
		this.coefficient = coefficient;
	}
}