public class Inc_Dec {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a ++= " + a++);
        System.out.println("a = " + a);

        System.out.println("a ++= " + ++a);
        System.out.println("a = " + a);

        System.out.println("a --= " + a--);
        System.out.println("a = " + a);

        System.out.println("a --= " + --a);
        System.out.println("a = " + a);
    }
}