/**
 * Created by GigaMe on 3/20/2017.
 */
public class DecimalToBinary {

    public static void main(String[] args){
        int[] binArray = new int[20];
        int i= 0;
        String tt = null;
        int temp = 0;
        int remain;
        int oNumber = 78;

        while(oNumber > 0){
            binArray[i] = oNumber % 2;
            oNumber = oNumber / 2;
            i++;
        }

        for(int j=0; j< binArray.length; j++){
            System.out.println(binArray[j]);
        }

        /*while(oNumber > 0){
            remain = oNumber % 10;
            oNumber = oNumber / 10;
            temp = temp * 10 + remain;
        }
        System.out.println(temp);*/

    }

}
