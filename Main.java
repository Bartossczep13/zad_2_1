import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    String z = "*";
    int w;
    System.out.println("wilekosc twojej choniki: ");
    Scanner c = new Scanner(System.in);
    w = c.nextInt();

    for(int i=0;i<w;i++)
      {
        for(int y=0;y<=w;y++)
          {
            if(y<(w-i)||y>(w+i))
            {
             System.out.print(" "); 
            }
            else
            {
              System.out.print(z);
            }
            
          }
        System.out.println();
      }
    
  }
}