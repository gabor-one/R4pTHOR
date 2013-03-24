import java.util.ArrayList;

public class Spray extends GameObject {

	private float SprayLevel;

	public float getSprayLevel() {
		System.out.println(">Spray.GetSprayLevel");
		return 0;
	}

	/**
	 * 
	 * @param SprayLevel
	 */
	public void setSprayLevel(float SprayLevel) {
		System.out.println(">Spary.SetSprayLevel");
		
	}

	public void decSprayLevel() {
		throw new UnsupportedOperationException();
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