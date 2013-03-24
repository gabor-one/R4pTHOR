import java.util.ArrayList;

public class AntScent extends Scent
{
	AntScent(ArrayList<Cluster> NBs)
	{
		System.out.println(">AntScent.CTOR");
		
		
		
	}
	
	public void Update(Cluster[] neighbourClusters, Cluster ParentCluster)
	{
		System.out.println(">AntScent.Update");
		
	}
	
	public void Draw()
	{
		throw new UnsupportedOperationException();
	}
}