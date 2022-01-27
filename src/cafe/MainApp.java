package cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Customer customer = new CustomerName("손님");
		Barista barista = new BaristaName("바리스타");
		MenuItem m1 = new MenuItem("아메리카노", 1500);
		MenuItem m2 = new MenuItem("카페라떼", 2000);
		MenuItem m3 = new MenuItem("카라멜마키아또", 2500);
		MenuItem m4 = new MenuItem("돌체라떼", 3000);
		List<MenuItem> menuitem = new ArrayList<>(Arrays.asList(m1, m2, m3, m4));
		Menu menu = new Menu(menuitem);
		System.out.println("=====마실음료는?=====");
		System.out.println("아메리카노. 1500원");
		System.out.println("카페라떼. 2000원");
		System.out.println("카라멜마키아또. 2500원");
		System.out.println(m4.getName() + "," + m4.getPrice() + "원");
		System.out.println("주문은 음료명을 말해주세요. ex)아메리카노");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();

		customer.order(string, menu, barista);
	}
}
