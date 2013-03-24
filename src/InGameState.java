

public class InGameState extends GameState {

	private Cluster[] cluster;
	private AntBase antbase;

	public InGameState() {
		System.out.println(">InGameState.CTOR");
		cluster = MapGenerator.GenerateMap();
	}

}