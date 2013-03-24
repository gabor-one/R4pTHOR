public class MapGenerator {

	public static Cluster[] GenerateMap()
	{
		System.out.println(">MapGenerator.GenerateMap");
		
		Cluster pc[] = new Cluster[4];
		pc[0]= new Cluster();
		pc[1]= new Cluster();
		pc[2]= new Cluster();
		pc[3]= new Cluster();
		
		return pc;
		
		
	}

}