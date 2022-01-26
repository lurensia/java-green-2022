package CoffeeMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Barista barista = new Barista();

		MenuItem m1 = new MenuItem("아메리카노", 1500);
		MenuItem m2 = new MenuItem("까페라떼", 2000);
		MenuItem m3 = new MenuItem("마끼야또", 3000);
		MenuItem m4 = new MenuItem("카페모카", 4000);

		List<MenuItem> list = new ArrayList<>();
		Arrays.asList(m1,m2,m3,m4);

		Menu menu = new Menu(list);

		// 1. 커피를 주문하라!!
		customer.order(m1.getName(), menu, barista);
	}

}
