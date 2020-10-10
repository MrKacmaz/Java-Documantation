package ipucumsu;

public class carpim_tablosu_ve_mathSinifi {
    public static void main(String[] args) {
      /*  for (int i = 1; i <10 ; i++) {
            System.out.println("");
            for (int j = 1; j <10 ; j++) {
                System.out.print(j*i + " \t");
            }
        }*/

    int num1 =(int) (Math.random()*50), num2 = (int) (Math.random()*50);
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    System.out.println("max: "+Math.max(num1,num2));
    System.out.println("min: "+Math.min(num1,num2));
        System.out.println(Math.cos(num1));


    }
}