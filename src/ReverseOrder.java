import java.util.Arrays;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(reverse(table,5)));
    }

    static int[] reverse(int[] table, int amount){
        int[] tableRev = new int[table.length];
        if(table==null || table.length==0 || amount>table.length){
            return table;

        }else{
            for (int i = 0; i <table.length ; i++) {

                if(i<amount){
                    tableRev[i]=table[amount-i-1];
                }else{
                    tableRev[i]=table[i];
                }
            }
            return tableRev;
        }

    }

}
