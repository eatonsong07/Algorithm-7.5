import java.util.ArrayList;
public class ArrayListMethods {


    public static int lessThanZero(ArrayList<Integer> a){
        int count =0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<0){
                count++;
            }
        }
        return count;
    }
    public static boolean ifContains(ArrayList<String> a,String b){
        for(int i=0;i<a.size();i++){
            if(a.get(i).equals(b)) return true;
        }
        return false;
    }

    public static boolean ifBothContains(ArrayList<Integer> a, ArrayList<Integer> b){
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                if(a.get(i)==b.get(j)) return true;
            }
        }
        return false;
    }

    public static int firstIndex(ArrayList<Integer> a, int b){
        for(int i=0;i<a.size();i++){
            if(a.get(i)==b){
                return i;
            }
        }
        return -1;
    }

    public static int firstIndexArray(int []a, int b){
        for(int i=0;i<a.length;i++){
            if(a[i]==b) return i;
        }
        return -1;
    }
}
