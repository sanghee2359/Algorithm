public class ArrayTest {

    public static void main(String[] args) { //psvm
        System.out.println("hello"); //sout
        // 실행 shift + fn + F10
        int []Array = new int[10];
        for(int i=0; i<Array.length; i++) Array[i] = i+1;
        for(int i=0; i<Array.length; i++) System.out.println("Arr["+i+"] : "+Array[i]);
    }
}
