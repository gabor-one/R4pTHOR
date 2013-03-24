import java.util.ArrayList;

public class AntScent extends Scent
{
	AntScent(ArrayList<Cluster> NBs, float scentlevel)
	{
		System.out.println(">AntScent.CTOR");
		setScentLevel(scentlevel);
		
		if((scentlevel-1)>0)
		{
			for(Cluster cl : NBs)
			{
				AntScent as = new AntScent(cl.GetNeighbourClusters(),scentlevel-1);	
			}
		}
	}
	
	public void Update(Cluster[] neighbourClusters, Cluster ParentCluster)
	{
		System.out.println(">AntScent.Update");
		
		decScentLevel();
		
		
		
	}
	
	public void Draw()
	{
		throw new UnsupportedOperationException();
	}
}