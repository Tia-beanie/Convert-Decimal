public class ConvertDec {
    public static void main(String[] args){

        int[] bin = {1,1,0,0};

        int dec = convert(bin);
        System.out.println(dec);
    }
    public static int convert(int[] arr){

        int res = 0, pow = 1;

        for(int i = arr.length - 1; i >= 0; i--){

            res += arr[i] * pow;
            pow = pow * 2;
        }
        return res;
    }
}
