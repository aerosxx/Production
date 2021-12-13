
 public class Coq extends Volaille 
 {


	public static final double PRIX_MOYEN_KG = 2;

        public Coq() 
        {
            super();
        }
    
        public String toString()
        {
          return "Coq : "+super.toString();
        }
        
        
      	public Volaille reproduire(Poule p)
      	{


		return p.enfanter(); 

      	}
	
	public void estTue()
	{
		this.meurt();
	}
	public Produit produire()
	{
		this.estTue();
		return new Produit(getPoids() , PRIX_MOYEN_KG);
	}
    
}
