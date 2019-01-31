import java.util.*;

public class Fibonacci

{

	//instance data
	int output;
	int prev;
	int preprev;
	int fib;

	//constructor
	public Fibonacci()
	{
		output = 0;
		fib = 0;
	}

	//chooses between iterative and recursive
	public int fibonacci(int n, String type)
	{
		prev = 0;
		preprev = 0;
		output = 1;
		
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
		if (i == 0)
		{
			output = 0;
		}

		else
		{
			output = 1;
		}
		
		for (int j = 1; j < i; j++)
		{
			preprev = prev;
			prev = output;
			output = prev + preprev;
		}
	}

	//uses recursion
	public void fibonacci_recursive(int i)
	{
		if (i > 1)
		{
			preprev = prev;
			prev = output;
			output = prev + preprev;
			fibonacci_recursive(i-1);
		}
	}
}
