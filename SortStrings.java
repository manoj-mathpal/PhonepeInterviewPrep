package phonePe;

public class SortStrings {
    private static void customSort(String[] array) {
        Integer a=10;
        a.toString();
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].compareTo(array[i])>0) {
                    // Swap elements if they are in the wrong order
                    String temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static int camelcase(String s) {
        int count=0;
        int i=0;
        int j=1;
        char[] ch = s.toCharArray();
        for(;i<ch.length-1;) {
            if (Character.isUpperCase(ch[j])) {
                count++;
                i=j;
                j=i+1;
            }
            else if(j==ch.length-1){
                i++;
                j=i+1;
            }
           else{
               j++;
            }
        }
        return ++count;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Banana", "Orange", "Apple", "Grape", "Pineapple"};

        // Sort the array of strings using the custom method
        customSort(stringArray);

        // Print the sorted array
        System.out.println("Custom Sorted Array of Strings:");
        for (String str : stringArray) {
            System.out.println(str);
        }

     //   System.out.println(camelcase("saveChangesInTheEditor"));
    }
}