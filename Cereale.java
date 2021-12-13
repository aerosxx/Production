public class Cereale implements Producteur 
{
  	public static  final double POIDS_MIN = 0.05;
  	public static final double POIDS_MAX = 0.06;
  	public static final double PRIX_MOYEN_KG= 0.3;
  
  	public double poids;
	public boolean recolte;	

	public Cereale()
	{
		this.poids = Math.random()*(POIDS_MAX - POIDS_MIN) +POIDS_MIN  ; 
		this.recolte=false;
	}

	public String toString()
	{
		return "Cereale : "+poids+" kg";
	}


	public double getPoids()
	{
		return poids;
	}

	

	public void estRecolte()
	{
		recolte=true;
	}
	
	public Produit produire()
	{
		return new Produit(poids, PRIX_MOYEN_KG); 
	}
	
	
	



}
