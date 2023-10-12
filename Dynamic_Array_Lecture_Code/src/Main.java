import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int[] intArray = new int[3];
//        intArray[0] = 22;
//        intArray[1] = -45;
//        intArray[2] = 12;
//
//        int[] tmp = new int[4];
//        System.arraycopy(intArray, 0, tmp, 0, intArray.length);
//        intArray = tmp;
//        intArray[3] = 44;
//        System.out.println(intArray[3]);
        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add("First");
        strArray.add("Second");
        strArray.add("Third");
        strArray.set(1,"The is Number 2");
        strArray.remove(1);
        System.out.println(strArray.size());
        for (int i=0; i<strArray.size(); i++) {
            System.out.println(strArray.get(i));
        }

//
//        Integer a = 128;
//        Integer b = 128;
//        System.out.println(a.equals(b));
//        System.out.println(a==b);

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(128);
        intArray.add(-34);
        intArray.add(98);

        for (int i=0; i<intArray.size(); i++) {
            System.out.println(intArray.get(i));
        }

        ArrayList<ArrayList<String>> myArray = new ArrayList<ArrayList<String>>();
        ArrayList<String> row1 = new ArrayList<String>();
        myArray.add(row1);
        ArrayList<String> row2 = new ArrayList<String>();
        myArray.add(row2);

        row1.add("Number 5");

        System.out.println(myArray.get(0).get(0));

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        for (int r=0; r<5; r++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>(); //creates/allocates the row
            for (int c=0; c< 4; c++) {
                tmp.add(2*r + c); //adds values to the row
            }
            matrix.add(tmp); //adds the row to the matrix
        }

        //get the value in the matrix r=2 c=3  (should be 2*r + c = 2*2+3 = 7
        System.out.println(matrix.get(2).get(3)); //printed the index 2 row and index 3 colum
    }
}