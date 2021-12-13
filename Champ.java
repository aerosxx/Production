
public class Champ

{
	private Cereale[][] zone;
	public final int LONGUEUR;
	public final int LARGEUR;
	
	public Champ(int longueur , int largeur)
	{
		this.zone=new Cereale[longueur][largeur];
		this.LONGUEUR= longueur;
		this.LARGEUR= largeur;
	}


	public Champ(int taille)
	{
		this(taille , taille);
	}

	public void remplirChamp()
	{
		for(int i = 0 ; i<LONGUEUR ; i++)
		{

			for(int j = 0 ; j<LARGEUR ; j++)
			{
				zone[i][j] = new Cereale();
			}
			
		}
	}

	public boolean estVide()
	{
		for(Cereale[] ligne : zone)
		{
			for(Cereale c : ligne)
			{
				if(c!=null)
				{
					return false;
				}

			}
		}
		return true;
	}

	public Cereale recolterCereale(Fermier f)
	{
		
		for(Cereale[] ligne : zone)
		{
			for(Cereale c : zone)
			{
				if(c!=null)
				{
					f.recolter(c);
				}
			}
		}
		
		
	}
	
	public Cereale enleverCereales()
	{
		for(int i = 0 ; i<LONGUEUR ; i++)
		{
			for(int j = 0 ; j<LARGEUR ; j++)
			{
				if(zone[i][j].getEtat() ==true)
				{
					zone[i][j]=null;
				}
			}
		}
	}



	public String toString()
	{

		String res = "Champ de superficie "+getSuperficie()+"\n";
		for(int i = -1 ; i<LONGUEUR+1 ; i++)
		{
	
				
			for(int j = -1 ; j<LARGEUR+1 ; j++)
			{
				if(i==-1 || i==LONGUEUR)
				{
					if(j==-1 || j== LARGEUR) res+='+';
					else
					{
						res+='-';
					}
				}

				else if(j==LARGEUR || j==-1)
				{
					res+='|';
				}
				else 
					res = res+(zone[i][j] == null ?' ' : zone[i][j].toString().charAt(0) );
			}
			res+='\n';
		}

		return res;
	}
	

	public int getSuperficie()
	{
		return LONGUEUR*LARGEUR;
	}


}
