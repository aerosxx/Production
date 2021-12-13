public abstract class Bovin extends Animal
{
	public static final int AGEMAX = 20;
	public static final double reproduction = 0.4;
	public static final double POIDS_MAX = 700;
	public static final double POIDS_MIN = 600;
	
	public Bovin()
	{
		super(POIDS_MAX , POIDS_MIN);
	}
	

	public String toString()
	{
		return "Bovin : "+super.toString();
	}

	      
     	 public void  manger()
      	 {
	 	System.out.println("Le bovin mange de l'herbe");
   	 }
   	
	public void crier()
	{
		System.out.println("MEUHHHHHHHHH");
	}
	public abstract Produit produire();
}
