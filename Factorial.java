import java.util.*;

public class Factorial

{

	//instance data
	int output;

	//constructor
	public Factorial()
	{
		output = 1;
	}

	//chooses between iterative and recursive
	public int factorial(int n, String type)
	{
		output = 1;
		if (type == "iterative")
		{
			factorial_iterative(n);
		}

		if (type == "recursive")
		{
			factorial_recursive(n);
		}
		return output;
	}

	//uses for loop
	public void factorial_iterative(int i)
	{
		for (int j = 1; j <= i; j++)
		{
			output *= j;
		}
	}

	//uses recursion
	public void factorial_recursive(int i)
	{
		if (i > 1)
		{
			output *= i;
			factorial_recursive(i-1);
		}
	}
}