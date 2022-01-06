public class plusGrdElemTab {
        public static void main(String[] args) {
            int[] a = {1,5,2,8,3};
            System.out.println(getPlusGrand(a));
        }

        public static int getPlusGrand(int[] elem){
            int lastElement = 0;
            int plusgrand = 0;
            for (int i : elem) {
                if(i>lastElement){
                    plusgrand = i;
                }
                lastElement = i;
            }
            return plusgrand;
        }
}
