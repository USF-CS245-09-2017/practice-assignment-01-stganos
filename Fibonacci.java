import java.util.*;

public class Fibonacci

{

	//instance data
	int output;

	//constructor
	public Fibonacci()
	{
		output = 0;
	}

	//chooses between iterative and recursive
	public int fibonacci(int n, String type)
	{
		if (type == "iterative")
		{
			output = 0;
			fibonacci_iterative(n);
		}

		if (type == "recursive")
		{
			output = 1;
			fibonacci_recursive(n);
		}
		return output;
	}

	//uses for loop
	public void fibonacci_iterative(int i)
	{
		for (int j = 1; j <= i; j++)
		{
			output += j;
		}
	}

	//uses recursion
	public void fibonacci_recursive(int i)
	{
		if (i > 1)
		{
			output += i;
			fibonacci_recursive(i-1);
		}
	}
}