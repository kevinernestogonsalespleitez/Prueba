package prueba;
import java.util.Scanner;
public class suma {
    Scanner obj = new Scanner(System.in);
    int total = 0;
    public int Sumando(){
        for(int i = 0;i<2;i++){
            System.out.println("Digite un numero");
            int suma = obj.nextInt();
            total = total+suma;
        }
        return total;
    }
    public int restando(){
        for(int i = 0;i<2;i++){
            System.out.println("Digite un numero");
            int suma = obj.nextInt();
            total = total-suma;
        }
        return total;
    }
}
