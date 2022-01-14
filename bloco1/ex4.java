import java.util.HashMap;
import java.util.Scanner;


public class ex4{

    public static void main(String[] args){
        String temp[] = null;
        Scanner sc = new Scanner("numbers.txt");
        HashMap<String,Integer> assocs = new HashMap<String,Integer>();
        while(sc.hasNextLine()){
            temp = sc.nextLine().split(" - ");
            assocs.put(temp[1],Integer.parseInt(temp[0]));
        }

        //terminar ao fazer o codigo para traduzir uma string utilizando o hashmap
    }
}

