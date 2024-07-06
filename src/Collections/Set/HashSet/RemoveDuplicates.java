package Collections.Set.HashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int a[] = {10,20,30,40,50,12,23,20,40,50,67,98};

//        ArrayList<Integer> arr = new ArrayList<Integer>();
//
//        for(int i = 0; i < a.length; i++){
//            arr.add(a[i]);
//        }
//        System.out.println("Before removal: "+arr);

        LinkedHashSet<Integer> lset5 = new LinkedHashSet<Integer>();
        for(int i = 0; i < a.length; i++){
            lset5.add(a[i]);
        }
        System.out.println("After removal: "+lset5);

    }
}
