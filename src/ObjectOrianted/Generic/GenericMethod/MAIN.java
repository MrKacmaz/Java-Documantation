package ObjectOrianted.Generic.GenericMethod;

import java.util.Arrays;

public class MAIN {
    public static void main(String[] args) {
        Integer[] arrI ={56,22,2,};
        Double[] arrD ={17.43,22.02};
        Character[] arrC ={'A','<','3','B'};
        String[] arrS ={"ALPEREN", "SENİ","ÇOK","SEVİYOR"};
        display(arrI);
        display(arrD);
        display(arrC);
        display(arrS);

    }

    public static <General> void display(General[]array){
        System.out.println(Arrays.toString(array));
    }
}
