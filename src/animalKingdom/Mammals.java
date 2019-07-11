package animalKingdom;

public class Mammals extends Animals
{
	public Mammals(String name, int yrDisc)
	{
		super(name, yrDisc);
	}

	@Override
	public String move()
	{
		return "walk";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "live births";
	}
}