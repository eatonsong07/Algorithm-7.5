import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        //Algorithm 1
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(-1);
        list.add(0);
        list.add(1);
        System.out.println(ArrayListMethods.lessThanZero(list));

        //testing 2
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(-1);
        list1.add(-1);
        list1.add(1);
        System.out.println(ArrayListMethods.lessThanZero(list1));

        //testing 3
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(-1);
        list2.add(-1);
        list2.add(-2);
        System.out.println(ArrayListMethods.lessThanZero(list2));

        //algorithm 2
        ArrayList<String> list3=new ArrayList<String>();
        list3.add("String");
        System.out.println(ArrayListMethods.ifContains(list3, "String"));


        //testing 2
        ArrayList<String> list4=new ArrayList<String>();
        list4.add("Strings");
        System.out.println(ArrayListMethods.ifContains(list4, "String"));

        //testing 3
        ArrayList<String> list5=new ArrayList<String>();
        list5.add("1+1");
        System.out.println(ArrayListMethods.ifContains(list5, "2"));

        //algorithm 3
        ArrayList<Integer> list6=new ArrayList<Integer>();
        list6.add(1);
        list6.add(2);
        ArrayList<Integer> list7=new ArrayList<Integer>();
        list7.add(2);
        list7.add(3);
        System.out.println(ArrayListMethods.ifBothContains(list6, list7));

        //testing 2
        ArrayList<Integer> list8=new ArrayList<Integer>();
        list8.add(1);
        list8.add(2);
        ArrayList<Integer> list9=new ArrayList<Integer>();
        list9.add(3);
        list9.add(3);
        System.out.println(ArrayListMethods.ifBothContains(list8, list9));

        //testing 3
        ArrayList<Integer> list10=new ArrayList<Integer>();
        list10.add(3);
        list10.add(2);
        ArrayList<Integer> list11=new ArrayList<Integer>();
        list11.add(4);
        list11.add(3);
        System.out.println(ArrayListMethods.ifBothContains(list10, list11));

        //algorithm 4
        ArrayList<Integer> list12=new ArrayList<Integer>();
        list12.add(1);
        list12.add(2);
        list12.add(3);
        System.out.println(ArrayListMethods.firstIndex(list12, 2));

        //testing 2
        ArrayList<Integer> list13=new ArrayList<Integer>();
        list13.add(3);
        list13.add(3);
        list13.add(1);
        System.out.println(ArrayListMethods.firstIndex(list13, 1));

        //testing 3
        ArrayList<Integer> list14=new ArrayList<Integer>();
        list14.add(1);
        list14.add(2);
        list14.add(1);
        System.out.println(ArrayListMethods.firstIndex(list14, 1));

        //algorithm 5
        int []a= {1,2,3};
        System.out.println(ArrayListMethods.firstIndexArray(a,2));
        int []b={1,2,3,4};
        System.out.println(ArrayListMethods.firstIndexArray(b,5));
        int []c={3,3,3,3,4,10,6};
        System.out.println(ArrayListMethods.firstIndexArray(c,3));

    }
}
