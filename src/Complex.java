import java.lang.Math;

public class Complex
{
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public String toString()
	{
		return real + " + " + imaginary + "i";
	}
	
	public double getReal()
	{
		return real;
	}
	
	public double getImaginary()
	{
		return imaginary;
	}
	
	public static Complex add(Complex x, Complex y)
	{
	    return new Complex(x.getReal() + y.getReal(), x.getImaginary() + y.getImaginary());
	}
	
	public static Complex multiply(Complex x, Complex y)
	{
	    double a = x.getReal() * y.getReal() - x.getImaginary() * y.getImaginary();
	    double b = x.getReal() * y.getImaginary() + x.getImaginary() * y.getReal();
	    return new Complex(a, b);
	}
	
	public double abs()
	{
		return Math.sqrt(getReal() * getReal() + getImaginary() * getImaginary());
	}
}