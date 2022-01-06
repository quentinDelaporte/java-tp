public class sommeTab {
    public static void main(String[] args) {
        int[] arr1 = {5,4,7,8,1};
        int[] arr2 = {8,4,3,2,7};
        int[] arrFinal = new int[arr1.length];
        for (int i = 0; i<arr1.length; i++) {
            arrFinal[i] = arr1[i] + arr2[i];
        }
    }
}
