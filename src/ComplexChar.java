public class ComplexChar {
    public static void main(String[] args) {
//        String content = "a\tb\tc\td\t";
//        String align = "1111222233334444";
//        System.out.println(content);
//        System.out.println(align);

        char t1 = '\u0054'; //T
        char e2 = '\u0045'; //E
        char s3 = '\u0053'; //S
        String test = "";
        test += t1;
        test += e2;
        test += s3;
        test += t1;

        System.out.println(test);
        System.out.println(t1);
        System.out.println(+t1);
        System.out.println("" +t1);
        System.out.println(+t1+e2+s3);  //ASCII
        System.out.println("The content of test is "+ t1 + e2 + s3 + t1);


    }
}
