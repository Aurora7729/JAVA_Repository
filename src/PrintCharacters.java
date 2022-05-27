public class PrintCharacters {
    public static void main(String[] args) {
//        char ch = 'A';
        char ch = '\u0041'; // A utf-8
        int num = ch;
        for (int i=0;i<26;i++){
            System.out.println(num + "\t" +((char)(num++)));
        }
    }
}
