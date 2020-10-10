package ipucumsu;

public class tip_donusumleri {
    public static void main(String[] args) {

        System.out.println("max = " + Long.MAX_VALUE+"\nmin = "+ Long.MIN_VALUE);

        int a = 85;int b = 15;
        System.out.println(a+b);
        // CASTING NASIL YAPILIR
        String a1 = String.valueOf(a);//Int --> String
        String b1 = String.valueOf(b);
        System.out.println(a1+b1);

        int a2 = Integer.valueOf(a1);//String --> Int
        int b2 = Integer.parseInt(b1);
        System.out.println(a2+b2);
    }

}
