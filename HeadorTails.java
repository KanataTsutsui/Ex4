import java.util.Scanner;
import java.util.Random;
public class HeadorTails {      //1==Head 2==Tail
     int i,Head,Tail;
void Gamingmethod(){
        System.out.println("HoT: initial revision"); 
        System.out.println("Who are you?");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            System.out.println("Hello, "+name);
            System.out.println("User name added");
            System.out.println("Tossing a coin...");

            for(int x=1; x<4; x++){
            System.out.println("Round "+ x +": ");
            Random r = new Random();
                i = r.nextInt(2); //0or1
                i = i+1; //convert 1or2

            if(i == 1){
             System.out.println("Round"+x+" :" +"Heads");
             Head++;
            }
            else if(i == 2){
             System.out.println("Round"+x+" :" +"Tails");
             Tail++;
            }
            i = 0; //initialization
            }

            System.out.println("Heads: "+ Head +", Tails: "+ Tail);
            if(Head > Tail)
            {
            System.out.println(name+" won!");
            }
            
            else if(Head < Tail)
            {
                System.out.println(name+" lose!");
            }
        }
    }
}

class HeadorTailsApplication{
    public static void main(String[] args){
    HeadorTails a = new HeadorTails();
    a.Gamingmethod();
    }
}
