public class Boeuf extends Bovin 
{
	
	public static final double  PRIX_MOYEN_KG = 22;
	public Boeuf()
	{
		super();
	}
 
  	public Bovin reproduire(Vache v)
  	{
		Bovin b;
  		if(Math.random()>Bovin.reproduction)
		{
			b = new Vache();
		}

    		else
		{ 
			b= new Boeuf();
  		}
		return b;

	}
 	public String toString()
	{
      		return "Boeuf : "+super.toString();
  	}

	public void estTue()
	{
		this.meurt();
	}
	public Produit produire()
	{
		return new Produit(getPoids() , PRIX_MOYEN_KG);
	}
  }
	
