public abstract class Volaille extends Animal{
   
    public static final int AGEMAX = 5;
      public static final double reproduction = 0.6;
      public static final double POIDS_MAX= 4;
      public static final double POIDS_MIN= 2;
      
  
      public Volaille()
      {
          super(POIDS_MAX , POIDS_MIN);
      }
  
      public String toString()
      {
        return "Volaille : "+super.toString();
      }
      
      public void  manger()
      {
      	System.out.println("La volaille mange des graines.");
      }

      public void crier()
      {
      	System.out.println("COCORICO");
      }
    public abstract Produit produire();
  
      
  }
      
    
    
