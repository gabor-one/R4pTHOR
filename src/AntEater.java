import java.util.ArrayList;

public class AntEater extends GameObject {

	private static int MaxEatenAnt;
	private int EatenAnt;

	public AntEater() {
		throw new UnsupportedOperationException();
	}

	public void IncEatenAnt() {
		throw new UnsupportedOperationException();
	}
	public void Update(ArrayList<Cluster> neighbourClusters, Cluster ParentCluster)
	{
		System.out.println(">AntEater.Update");
	
		
		neighbourClusters.get(0).AddGameObject(this);
		ParentCluster.RemoveGameObject(this);
	}
	
	public void Draw()
	{
		throw new UnsupportedOperationException();
	}

}