/*
 * Interface do administrador
 */
package ExercicioIII;


public class Cliente 
{
    public String nome;
    private int idade;
    private Double renda;
    
   public void setIdade(int idade)
    {
        this.idade = idade;
    }
   public int getIdade() 
    {
        return idade;
    }
    
   public void setRenda(double renda) 
    {
        this.renda = renda;
    }
     public double getRenda() 
    {
        return renda;
    }
}
