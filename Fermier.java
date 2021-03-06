public class Fermier
{
	public final String nom;
	private static int compteur = 1;

	public Fermier()
	{
		
		compteur++;
		this.nom = "Fermier "+compteur;

	}

	/*public Fermier(String nom)
	{
		compteur++;
		this.nom = nom;
		this.experience = 0;
		
	}*/


	public String toString()
	{
		return "Fermier "+nom; 
	}


	/*public Cereale recolterCereale(Champ c)
	{
		Cereale res = null;
		while( !res)
		{
			for(int i = 0 ; i<c.LONGUEUR ; i++)
			{
				for(int j = 0 ; j<c.LARGEUR ; j++)
				{
					res=c.enleverCereale(i,j);
				}
			}
		}
		if(res == null) c.remplirChamp();
		return res ; 

	}*/
	
	public Produit recolter(Producteur p)
	{
		
		return p.produire();
		
		
	}

	public double vendre(Produit p)
	{
		p.estVendu();
		return p.getPrix();
	}
	
	

}
