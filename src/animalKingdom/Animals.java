package animalKingdom;

public abstract class Animals
{
	// fields
	private static int maxId = 0;
	private int id;
	private String name;
	private int yrDisc;

	// constructor
	public Animals(, int yrDisc)
	{
		this.id = maxId++;
		this.name = name;
		this.yrDisc = yrDisc;
	}

	// abstract methods
	public abstact String move();
	public abstact String breath();
	public abstact String reproduce();

	// methods
	public String eat()
	{
		return "Animal Food";
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
}