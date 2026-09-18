public class  exception {
    public static void main(String args[]){
        try{
            int a=0,b=10;
            double result = b/a;
            System.out.println("Result is: "+result);
        
        }
        catch(Exception e){
            System.out.println("Cannot divide by 0."+e.getMessage());
        }
        System.out.println("Normal execution continues without any interruption.");
    }
}
