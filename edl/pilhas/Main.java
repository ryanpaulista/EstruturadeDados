import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        PilhaArray pilha1 = new PilhaArray(5, -1);

        pilha1.push(5);

        System.out.println(pilha1.top());

        pilha1.pop();

        System.out.println(pilha1.top());
    }



}