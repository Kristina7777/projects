1.	class Test
2.	{
        3.	    static void Main(string[] args)
        4.	    {
        5.	        var test = new Test();
        6.	        test.Print();
        7.	        Console.Write("3");
        8.
        9.	        Console.ReadLine();
        10.	    }
        11.
        12.	    public void Print()
        13.	    {
        14.	        try
        15.	        {
        16.	            throw new Exception();
        17.	        }
        18.	        catch (Exception)
        19.	        {
        20.	            Console.Write("2");
        21.	            return;
        22.	        }
        23.	        finally
        24.	        {
        25.	            Console.Write("5");
        26.	        }
        27.	    }
        28.	}

