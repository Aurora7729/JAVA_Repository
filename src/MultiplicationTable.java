public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            String line = "";
            for (int j = 1; j < 10; j++) {
                if (i < j)
                    break;
                line += i + "*" + j + "=" + i * j + "\t";
            }
            System.out.println(line);
        }
    }
}
