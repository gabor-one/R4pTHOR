import java.util.ArrayList;

public class Ant extends GameObject {

	private boolean HasFood;

	public Ant() {
		throw new UnsupportedOperationException();
	}

	public boolean getHasFood() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param HasFood
	 */
	public void setHasFood(boolean HasFood) {
		throw new UnsupportedOperationException();
	}

	public void dropFood() {
		throw new UnsupportedOperationException();
	}
	
	public void Update(ArrayList<Cluster> neighbourClusters, Cluster ParentCluster)
	{
		System.out.println(">Ant.Update");
		for(Cluster cl : neighbourClusters)
		{
			cl.GetGameObjects();
			new AntScent(neighbourClusters,2).getScentLevel();
			new FoodScent().getScentLevel();
			
		}
		
		neighbourClusters.get(0).AddGameObject(this);
		ParentCluster.RemoveGameObject(this);
		
		neighbourClusters.get(0).GetGameObjects();
		neighbourClusters.get(0).RemoveGameObject(this);
		
		
	}
	
	public void Draw()
	{
		throw new UnsupportedOperationException();
	}

}