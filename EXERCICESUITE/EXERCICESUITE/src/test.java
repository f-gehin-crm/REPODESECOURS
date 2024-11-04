import java.util.Scanner;
        
public class test {
     public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    System.out.println("Hello, moon");
    System.out.println("Hello, Frédéric!");

/*----------------------------------------------------------------------------------------------------------------------------------------- */

int A = 0; int i = 0; int som = 0;

System.out.println("Entrez un entier : ");    

Scanner sc = new Scanner(System.in);

A = sc.nextInt();
System.out.println(A); 

for (i=1; i<=A ; i++) {  
som = som + i;
}

System.out.println("Le résultat est  : " + som);    


sc.close();

}
    
}
