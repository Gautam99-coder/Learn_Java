import java.util.HashSet;

public class find_dublicate {
    public static void main(String[] args) {
        int [] orders={1,2,4,5,3};
        int order=findDublicate(orders);
        if(order!=-1){
            System.out.println("Dublicate id is: "+order);
        }else{
            System.out.println("There is not dublicate.");
        }
    }
    public static int findDublicate(int[]orders){
        HashSet<Integer> seen = new HashSet<>();
        for(int order:orders){
            if(seen.contains(order)){
                return order;
            }
            seen.add(order);
        }
        return -1;
    }
}
