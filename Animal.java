public abstract class Animal implements Producteur
{
	private double poids;
	private int age;
 	private boolean estVivant;
	


	public Animal(double poidsMax , double poidsMin)
	{
		this.age=1;
		this.estVivant = true;
		this.poids=Math.random()*(poidsMax-poidsMin) + poidsMax;
	}


	public String toString()
	{
		return "Animal de poids "+poids+" qui a "+age+" ans";
	}

	public double getPoids()
	{
		return poids;

	}
  
 	 public void meurt()
	  {
   		estVivant = false;
	  }
 	 
	public int getAge()
	{
		return age;
	}
	
	public boolean getEtat()
	{
		return estVivant;
	}
	

	
	public abstract void manger();
	public abstract void crier();
	public abstract Produit produire();
}
