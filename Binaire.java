//code developpe par serge Guerrerro fb
import java.util.Scanner;
public class Binaire{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Veuillez saisir le nombre");
        int s = sc.nextInt();
        Convertir calcul = new Convertir();
        calcul.setNum(s);
        calcul.Conversion(calcul.getNum());
    }
}
class Convertir{
    int num;
    String binary = "";
    //constructeur par defaut
    Convertir(){}
    //creation d'un getter
    int getNum(){
        return num;
    }
    //securite de la variable  variables grace a un modificateur
    void setNum(int a){
        //changement de la variable num par ma variable a 
        this.num = a;
    }
    void Conversion(int a){
        setNum(a);
        int g = getNum();
        System.out.println (g);
        while(num > 0){ 
            binary = (this.num % 2) + binary;
            this.num /= 2;
        }
        System.out.println ("Le nombre binaire de "+g+" est "+binary);
    }
    
}