import java.util.ArrayList;
public class Ferme
{
	private Fermier[] fermiers;
	private Champ champ;
	private ArrayList<Animal> animaux;
	private ArrayList<Produit> produits;
	private double gain;	
	public static final int SIZE_X = 10 ;
	public static final int SIZE_Y = 10 ; 


	public Ferme(int nbFermiers , int longueurChamp , int largeurChamp , int nbAnimauxBase)
	{
		this.fermiers=new Fermier[nbFermiers];
		for(int i = 0 ; i<nbFermiers ; i++)
		{
			fermiers[i] = new Fermier();
		}


		this.champ=new Champ(longueurChamp , largeurChamp);
		this.animaux=new ArrayList<Animal>();

		for(int i = 0 ; i<nbAnimauxBase ; i++)
		{
			switch (i%4)
			{
				case 0 :
					animaux.add(new Poule());
					break;
				case 1 :
					animaux.add(new Coq());
					break;
				case 2 :
					animaux.add(new Vache());
					break;
				case 3 :
					animaux.add(new Boeuf());
					break;

			}
		}
		this.produits = new ArrayList<Produit>();
		this.gain = 0;
	}

	public Ferme()
	{
		this(5,10,10 , 20);
	}



	public String toString()
	{
		String res ="Ferme : "+getNbProduits()+" produits , "+getGain()+" euros de chiffres d'affaires\n";
		res+=champ.toString()+"\n";
		res+="Parc des animaux :\n";
		int compteurAnimaux = animaux.size();
		double condition = (double)compteurAnimaux/(SIZE_X*SIZE_Y);
		for(int i = 0; i<SIZE_X+2 ; i++)
		{
			for(int j = 0 ; j<SIZE_Y+2 ; j++)
			{
				if(i==0 || i==SIZE_X+1)
				{
					if(j==0 || j==SIZE_Y+1)
					{
						res += "+"; 
					}
					else
					{
						res+="-";
					}
				}
				else if(j==0 || j==SIZE_Y+1)
				{
					res+="|";
				}

				else
				{
					double d = Math.random();
					if(d<condition && compteurAnimaux != 0)
					{
						res+="A";
						compteurAnimaux--;
					}
					else
					{
						res+=" ";
					}


					
				}
			}

			res+="\n";
		}

		return res;
	}
	
	public void addAnimal(Animal a)
	{
		animaux.add(a);
	}

	public void enleverAnimal()
	{
		int i = 0 ;
		for(Animal an : animaux)
		{
			if(an.getEtat() ==false)
			{
				animaux.remove(i);
				return ;
			}
			i++;
		}
	}

	public void addProduit(Produit p)
	{
		produits.add(p);
	}

	public void enleverProduit()
	{
		int i = 0 ; 
		for(Produit prod : produits)
		{
			if(prod.getEtat() )
			{
				produits.remove(i);
				gain+=prod.getPrix();
			}
		}
	}
	
		
	
	
	
	public void crierAnimaux()
	{
		for(Animal a : animaux)
		{
			a.crier();
		}
		return ;
	}
	

	public double getGain()
	{
		return gain;
	}
	
	public int getNbProduits()
	{
		return produits.size();
	}

	public void rafraichirFerme()
	{
			
		if(champ.estVide() ) champ.remplirChamp();
		int nbFermiers = fermiers.length;
		for(int i = 0 ; i<nbFermiers ; i++)
		{
			if(i<nbFermiers/2)
			{
				
			}
		}
		
	}

	

}

