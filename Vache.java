
public class Vache extends Bovin 
{
  public static final double QUANTITE_LAIT_MOYENNE = 28;
  public static final double PRIX_MOYEN_LAIT = 1;
  public Vache()
  {
	super();
  }
  

  
  public String toString(){
      return "Vache : "+super.toString();
  }
  
  public Bovin enfanter()
  {
    if(Math.random()<0.5) return new Vache();
  
  
    else return new Boeuf();
  }
  
 
  public Produit produire()
  {
       return new Produit(QUANTITE_LAIT_MOYENNE , PRIX_MOYEN_LAIT);
  } 
  
}
