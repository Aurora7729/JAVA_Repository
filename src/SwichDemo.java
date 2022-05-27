public class SwichDemo {
    public static void main(String[] args) {

        String sentence = "";
        for (int n = 0; n < 5; n++) {
            switch (n) {
                case 1:
                    sentence += 'D';
                    break;
                case 2:
                    sentence += 'E';
                    break;
                case 3:
                    sentence += 'M';
                    break;
                case 4:
                    sentence += 'O';
                    break;

            }

        }
        System.out.println(sentence);
    }
}
