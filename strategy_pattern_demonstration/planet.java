package strategy_pattern_demonstration;

public class planet {
	// THE STRUCTURE THAT VARIES
	planetSize size;
	compositionType composition;
	
	// THE REST OF THE CODE
	public void main() {
	}
	
	public planet() {
		System.out.println("New planet created");
		size = new smallPlanet();
		composition = new metalComposition();
	}
	
	public void changeSize(planetSize newSize) {
		size = newSize;
	}
	
	public void changeComposition(compositionType newComposition) {
		composition = newComposition;
	}
}
