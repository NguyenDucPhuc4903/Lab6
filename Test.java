package lab6;

public class Test {
	public static void main(String[] args) {
		Node node = new Node();
		node.generateBoard();
		node.displayBoard();
//		System.out.println(node.getH());
		HillClimbing hc = new HillClimbing();
//		System.out.println(hc.execute(node).getH());
		System.out.println(hc.executeHillClimbingWithRandomRestart(node).getH());
	}
}
