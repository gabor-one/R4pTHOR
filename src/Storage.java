public class Storage extends GameObject {

	private int foodCount;
	private boolean IsDropped;

	public int getFoodCount() {
		return this.foodCount;
	}

	/**
	 * 
	 * @param foodCount
	 */
	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}

	public Storage() {
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