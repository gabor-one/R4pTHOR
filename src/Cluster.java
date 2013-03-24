import java.util.UUID;

public class Cluster {

	private Cluster[] neighbourClusters;
	private GameObject[] gameObjects;
	private UUID guid;

	public Cluster() {
		throw new UnsupportedOperationException();
	}

	public Cluster[] GetNeighbourClusters() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
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
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param GameO
	 */
	public boolean AddGameObject(GameObject GameO) {
		throw new UnsupportedOperationException();
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