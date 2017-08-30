package strategy_pattern_demonstration;

public class generateSolarSystem {
	public static void main(String[] args) {
		// THE ENTRY POINT
		System.out.println("Creating a solar system");
		
		planet Hefaitos = new planet();
		Hefaitos.size.getSize();
		Hefaitos.changeSize(new bigPlanet());
		Hefaitos.size.getSize();
		Hefaitos.composition.getComposition();
		Hefaitos.changeComposition(new rockComposition());
		Hefaitos.composition.getComposition();
	}
}
