
import java.lang.*;
import java.util.* ;
public class TestAnimaux {
    public static void main( String[]args){
      //  ArrayList <Animal>=
        Poule p=new Poule(Poule.POIDSPOULE);
        Coq c=new Coq(Coq.POIDSCOQ);
        Volaille f=c.reproduire(p);
        System.out.println(f.getClass());
        

            
     }
}
