package ipucumsu;

public class faktöriyel {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factoriel(n));
    }

    private static int factoriel(int n) {
        if (n == 0){
            return 1;
        }
        return n*factoriel(n-1);
    }
}
