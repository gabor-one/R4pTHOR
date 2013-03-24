import java.util.UUID;

public abstract class GameObject {

	private UUID guid;

	/**
	 * 
	 * @param neighbourClusters
	 * @param ParentCluster
	 */
	public abstract void Update(Cluster[] neighbourClusters, Cluster ParentCluster);

	public abstract void Draw();

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

}