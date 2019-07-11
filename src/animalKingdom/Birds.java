package animalKingdom;

public class Birds extends Animals
{
	public Birds(String name, int yrDisc)
	{
		super(name, yrDisc);
	}

	@Override
	public String move()
	{
		return "fly";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "lay eggs";
	}
}