public class findmissingseat {
    public static void main(String[] args) {
        int [] bookingseat={1,2,3,4,5,6,8,7,10};
        int totalseats =10;
        int missingseat=missingseatfinder(bookingseat,totalseats);
        System.out.println("Missing seat: "+missingseat);
    }
    public static int missingseatfinder(int [] seats,int totalseats){
        //100,90 100-90=10
        int exceptedsum =totalseats*(totalseats+1)/2;
        int actualsum=0;
        for(int seat:seats){
            actualsum+=seat;
        }
        return exceptedsum - actualsum;
    }
}
