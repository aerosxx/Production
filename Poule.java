public class Poule extends Volaille 
{  
   
   public static final double POIDS_OEUF = 0.07;
   public static final double PRIX_MOYEN_KG = 2.40;
   
   public Poule()
   {
        super();

   }
   
   public String toString()
   {
        return "Poule : "+super.toString();
   }

   
   public Volaille enfanter()
   {
         if(Math.random()<0.5) return new Poule();
         else return new Coq();
   }


    public Produit produire()
    {
         return new Produit(POIDS_OEUF , PRIX_MOYEN_KG);
    }

}
    
