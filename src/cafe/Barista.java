package cafe;

abstract public class Barista {
	// 3번
	abstract public Coffee makeCoffee(MenuItem menu);

	abstract String getName();
}

class BaristaName extends Barista {
	private final String name;

	public BaristaName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public Coffee makeCoffee(MenuItem menu) {
		Coffee coffee = new Coffee(menu);
		return coffee;
	}

}
