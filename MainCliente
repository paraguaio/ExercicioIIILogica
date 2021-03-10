/*
 * Interface do cliente
 */
package ExercicioIII;

import java.util.Scanner;
public class MainCliente 
        
{
    public static void main(String[] args)
    {
    Scanner ler = new Scanner(System.in);
    
    Cliente c1 = new Cliente();
    
    System.out.println("Digite o seu nome: ");
    c1.nome = ler.nextLine();
    
    System.out.println("Digite a sua idade: ");
    c1.setIdade(ler.nextInt());
        
    System.out.println("Digite a sua renda: ");
    c1.setRenda(ler.nextDouble());
    
    System.out.println("Unindo os dados... ");   
    System.out.println("Nome: " + c1.nome);
    System.out.println("Idade: " + c1.getIdade());
    System.out.println("Renda: " + c1.getRenda());
    
    if ( c1.getRenda()>= 15000  ) 
        {
            System.out.println("Você é rico!. ");
        }
    else if ( c1.getRenda() <= 14999 )
        {
        System.out.println("Você é pobre. ");
        }
    }
}
