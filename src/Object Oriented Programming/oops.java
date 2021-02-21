public class oops {

    static void swap1(person one, person two) {
        person temp = one;
        one = two;
        two = temp;
    }

    static void swap2(person one, person two) {

        int tage = one.age;
        one.age = two.age;
        two.age = tage;

        two = new person();

        String tname = one.name;
        one.name = two.name;
        two.name = tname;

        one = new person();
    }

    public static void main(String[] args) {
        person p1;
        person p2;

        p1 = new person();
        p1.age = 10;
        p1.name = "A";

        p2 = new person();
        p2.age = 20;
        p2.name = "B";

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
        swap2(p1, p2);
        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
    }
}
