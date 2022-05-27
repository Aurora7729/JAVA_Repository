public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 10005452502232L;
//        intVal = (int) longVal;

        float floatVal = 11.32f;
        double doubleVal = 23233.3452;
        floatVal = (float) doubleVal;

        int a = 65;
        char b = (char) a;
        char c = 'a';

        System.out.println("intVal=" + intVal);
        System.out.println(floatVal);
        System.out.println(b);
        System.out.println(+c);
    }
}
