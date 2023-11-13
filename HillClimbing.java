package lab6;

public class HillClimbing {
	public Node execute(Node initialState) {
		Node current = initialState;
		Node neighbor = null;
		while (true) {
			neighbor = current.getBestCandidate();
			if(neighbor.getH()<current.getH()) {
				current = neighbor;
			}else {
				return current;
			}
		}
	}
	public Node executeHillClimbingWithRandomRestart(Node inititalState) {
		Node state = execute(inititalState);
		while (state.getH()!=0) {
			state.generateBoard();
			execute(state);
		}
		return state;
	}
}
