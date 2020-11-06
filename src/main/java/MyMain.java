import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count=0;
        for (int i=0; i<list.size(); i++){
            Integer drrBrr=list.get(i);
            if (!(drrBrr%2==0)){
                count++;
            }
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i=0; i<list1.size(); i++){
            Integer skraa=list1.get(i);
            for (int j=0; j<list2.size(); j++){
                Integer meerkat=list2.get(j);
                if (skraa==meerkat){
                    return true;
                }
            }

        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        //looked at 2 examples to understand how to make a new ArrayList
        ArrayList<Integer> ohSleuthyOne= new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++){
            ohSleuthyOne.add(arr[i]);
        }
        return ohSleuthyOne;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
