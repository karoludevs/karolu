public class Room
{
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Floor floor;
	private Roof roof;
	private int bed;
	private int desk;
	private boolean openlamp = false ;

	public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Floor floor, Roof roof, int bed, int desk, boolean lamp)
	{
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.floor = floor;
		this.roof = roof;
		this.bed = bed;
		this.desk = desk;
		this.openlamp = lamp;
	}

	public void setWall1(Wall wall1)
	{
		this.wall1 = wall1;
	}

	public Wall getWall1()
	{
		return wall1;
	}
	
	private boolean openedLamp (){
		return openlamp;
	}
	
	public Wall wall1(Wall color){
		return color;
	}
}
