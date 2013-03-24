import java.awt.List;
import java.util.ArrayList;
import java.util.UUID;

public class Cluster {

	private ArrayList<Cluster> neighbourClusters;
	
	
	private ArrayList<GameObject> gameObjects;
	private UUID guid;

	public Cluster() {
		System.out.println(">Cluster.CTOR");
		gameObjects = new ArrayList<GameObject>();
	}

	public ArrayList<Cluster> GetNeighbourClusters() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 0
	 * @param cluster
	 */
	public void AddNeighbourClusters(Cluster cluster) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param GameO
	 */
	public void RemoveGameObject(GameObject GameO) {
		
	
		
		gameObjects.remove(GameO);
		
		
		System.out.println(">Cluster.RemoveGameObject");
		
	
	}

	/**
	 * 
	 * @param GameO
	 */
	public boolean AddGameObject(GameObject GameO) {
		System.out.println(">Cluster.AddGameObject");
		return true;
	}

	public UUID getGuid() {
		return this.guid;
	}

	/**
	 * 
	 * @param guid
	 */
	public void setGuid(UUID guid) {
		this.guid = guid;
	}

	public void Update() {
		throw new UnsupportedOperationException();
	}

	public void MovementUpdate() {
		throw new UnsupportedOperationException();
	}

	public Scent GetScent() {
		throw new UnsupportedOperationException();
	}

	public GameObject[] GetGameObjects() {
		throw new UnsupportedOperationException();
	}

}