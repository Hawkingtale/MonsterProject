package monsterModel;

public class MarshmellowMonster
{
	public String name;
	public double antennaCount;
	private int eyeCount;
	private int legCount;
	public int noseCount;
	private boolean hasBellyButton;
	
	public MarshmellowMonster()
	{
		this.name = "no name";
		this.antennaCount = 0;
		this.eyeCount = 2;
		this.legCount = 4;
		this.noseCount = 1;
		this.hasBellyButton = false;
	}

	public MarshmellowMonster(String name, double antennaCount, int eyeCount, int legCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.antennaCount = antennaCount;
		this.hasBellyButton = hasBellyButton;
		}

		
public String toString()
	{
		String description = "Monster says: Name is " + name;
		
		return description;
	}
	public String getName()
	{
		return name;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}
	public int geteyeCount()
	{
		return eyeCount;
	}
	public int getlegCount()
	{
		return legCount;
	}
	public int getnoseCount()
	{
		return noseCount;
	}
}