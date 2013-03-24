import java.util.ArrayList;

public class Scent extends GameObject {

	private float ScentLevel;

	public Scent() {
		throw new UnsupportedOperationException();
	}

	public float getScentLevel() {
		return ScentLevel;
	}

	/**
	 * 
	 * @param ScentLevel
	 */
	public void setScentLevel(float Sl) {
		System.out.println(">Scent.setScentLevel");
	
	}

	public void decScentLevel() {
		System.out.println(">Scent.decScentLevel");
	}
	
	public  void Update(ArrayList<Cluster> neighbourClusters, Cluster ParentCluster)
	{
		throw new UnsupportedOperationException();
	}
	
	public void Draw()
	{
		throw new UnsupportedOperationException();
	}

}