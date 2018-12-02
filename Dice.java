//Dice.java



//declare class
public class Dice 
{

    // Instance Variables 
    String name;
    int sidesnum;
    int n;
  
    // Constructor Declaration of Class 
    public Dice(String name, int sidesnum) 
    { 
        this.name = name; 
        this.sidesnum = sidesnum; 
    } 

    //methods 
	public String getName()
	{
		return name;
	}

	public int getSidesnum()
	{
		return sidesnum;
	}

	public int getOutcome()
	{
		int rnum = (int)(Math.random()* 6 + 1);
		return rnum;
	}

	//
	public String firstString()
	{
		return("You just rolled a "+ 
			this.getName()+ "-sided dice. It has "+ this.getSidesnum()+ " sides. Outcome: " + this.getOutcome());
	}

	public static void main(String[] args)
	{
		Dice six = new Dice("six", 6);
		System.out.println(six.firstString());
	}
}