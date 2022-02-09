public class AddElement {
    public static void main(String[] args) {
        int [] N = {3,4,5,6};
        N = AddElement(N,34);
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] +" " );
        }

    }
    public static int[] AddElement(int [] array, int newE){
        int[] newArray;
        newArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = newE;
        return newArray;
    }
}
