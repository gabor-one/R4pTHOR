import java.util.ArrayList;

public class AntKillerSpray extends Spray {
	
	
	
	public  void Update(ArrayList<Cluster> neighbourClusters, Cluster ParentCluster)
	{
		System.out.println(">AntKillerSpray.Upadte");
		setSprayLevel(getSprayLevel()-1);
	}
	
	public void Draw()
	{
		throw new UnsupportedOperationException();
	}
}