package hotelmain;


public class roomTyp {
    private int typ;
    

    public static String setTyp(int typ) {
        if(typ==0)
            return "AC"; 
        else
           return "Non-AC";
    }
    
   
    
}
