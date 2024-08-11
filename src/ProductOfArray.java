public class ProductOfArray {

    public static int[] productExceptSelf(int[] array) {
        int [] temporary = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temporary[i] = multiply(array,i);
        }
        return temporary;

    }

    public static int multiply(int [] array,int numb){
        int total = 1;
        for(int i=0;i<array.length;i++){
            if(i == numb){
                continue;
            }
            total*=array[i];
        }
        return total;
    }
}
