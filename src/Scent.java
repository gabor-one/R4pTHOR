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
		ScentLevel=Sl;
	}

	public void decScentLevel() {
		throw new UnsupportedOperationException();
	}
	
	public void Update(Cluster[] neighbourClusters, Cluster ParentCluster)
	{
		throw new UnsupportedOperationException();
	}
	
	public void Draw()
	{
		throw new UnsupportedOperationException();
	}

}