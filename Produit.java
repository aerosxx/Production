public class Produit
{
	private double prix;
	private boolean vendu;
	
	public Produit(double poidsBrut , double prixMoyenKG)
	{
		this.prix = (poidsBrut)*(prixMoyenKG);
		this.vendu = false;
	}
		
	
	
		
	public double getPrix()
	{
		return prix;
	}

	public void estVendu()
	{
		vendu=true;
	}

	public boolean getEtat()
	{
		return vendu;
	}
}
