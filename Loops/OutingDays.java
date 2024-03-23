package Loops;

public class OutingDays {
    public static int findDaysCount(String month){
    	int days=0;
        if(month.equals("January") || month.equals("March") ||month.equals("May") || month.equals("July") ||month.equals("August") || month.equals("October") || month.equals("December")){
            days = 31;
        }
        else if(month.equals("April") || month.equals("June")||month.equals("September")||month.equals("November"))  {
            days = 30;
        }
        else if(month.equals("February")){
            days = 28;
        }
        return days;
    }
    public static int findDays(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String month = "February";
        int m = findDaysCount(month);
        System.out.println(m);
        int date = findDays(m);
        System.out.print("No.of days :"+date);
        


    }
}
