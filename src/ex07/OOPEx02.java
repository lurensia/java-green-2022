package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();

        System.out.println(doc.name);
        System.out.println(doc.sal);
    }

}
