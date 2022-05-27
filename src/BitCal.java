public class BitCal {
    public static void main(String[] args){
        int a = 011;    //001 001
        int b = 041;    //100 001
        int c = 0x1F;   //0001 1111
        int d = 0xF1;   //1111 0001
        int e = -0xF1;  //  true form：1000 0000 0000 0000 0000 0000 1111 0001   complement form：1111 1111 1111 1111 1111 1111 0000 1111
//      Octal
//        System.out.println(a);
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~a); //110 110   101 001  101 010
//        System.out.println();
//      Hex
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(c & d);
//        System.out.println(c | d);
//        System.out.println(c ^ d);
//        System.out.println(~c); //1110 0000  1001 1111  1010 0000
//        System.out.println();
        System.out.println(e);
        System.out.println(e>>1);   // 1111 1111 1111 1111 1111 1111 1000 0111    1000 0000 0000 0000 0000 0000 0111 1001
        System.out.println(e>>>1);  // 0111 1111 1111 1111 1111 1111 1100 0011
        System.out.println(e<<1);


    }
}
