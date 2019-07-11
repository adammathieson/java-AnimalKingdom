package animalKingdom;

public class Fish extends Animals
{
	public Fish(String name, int yrDisc)
	{
		super(name, yrDisc);
	}

	@Override
	public String move()
	{
		return "swim";
	}

	@Override
	public String breath()
	{
		return "gills";
	}

	@Override
	public String reproduce()
	{
		return "lay eggs";
	}
}