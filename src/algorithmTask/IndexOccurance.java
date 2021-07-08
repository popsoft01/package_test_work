package algorithmTask;

public class IndexOccurance {
    public static void startAndEndElementOccurence(int[] array,int value){
        int firstNumber = -1;
        int lastNumber = -1;
        for (int counter = 0; counter < array.length;counter++){
            if (array[counter] == value && firstNumber==-1){
                firstNumber = counter;
            }
            if (array[counter] == value && firstNumber != -1){
                lastNumber = counter;
            }
        }
        System.out.println("first Index " + firstNumber);
        System.out.print("last Number " +lastNumber);
    }
    public static void intersect(String[] array){

    }

    public static void main(String[] args) {
        int[] array ={0,0,1,1,1,1,1,1,4,6,7,4};
        startAndEndElementOccurence(array,8);
    }
}
