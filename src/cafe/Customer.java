package cafe;

abstract public class Customer {
    // 1번
    abstract public void order(String string, Menu menu, Barista barista);
}

class CustomerName extends Customer {
    private final String name;

    public CustomerName(String name) {
        this.name = name;
    }

    @Override
    public void order(String string, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(string);
        Coffee coffee = barista.makeCoffee(menuItem);
        System.out.println(
                name + "이 " + barista.getName() + "에게 " + coffee.getPrice() + "원 을 계산하고" + coffee.getName()
                        + "를 구매합니다.");
    }
}