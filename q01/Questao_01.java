/*
 * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a 
    soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
    escreva um programa na linguagem que desejar onde, informado um número, 
    ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado 
    pertence ou não a sequência. 
 */

package q01;
import java.lang.Math;
import java.util.Scanner;


public class Questao_01 {

    //função para verificar se o n é um quadrado perfeito
    public static Boolean quadradoPerfeito(int n){
        Double r = Math.pow(n, 0.5); // elevamos o numero a 0.5 para identificarmos a raiz de n
        int raiz = r.intValue();

        return raiz * raiz == n; 
    }

    //Aqui temos a função para verificar se o numero digitado pertence a sequencia Fibonacci
    public static Boolean perteceFibo(int num){
        if (num < 0){
            return false; //caso o numero seja abaixo de zero, retorna False.
        }

        if(num == 0 || num == 1){
            return true; //caso o numero seja 0 ou 1 (caso base), retorna logo True
        }

        /*
         * Aqui, utilizamos uma propriedade matemática que diz que um número é Fibonacci se e 
            somente se uma ou ambas as expressões (5x² + 4) e (5x² - 4) retornarem um quadrado perfeito.
         * 
         */
        if(quadradoPerfeito(5 * num * num + 4) || quadradoPerfeito(5 * num * num - 4)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero: "); //#Pegamos o numero informado.
        int num = s.nextInt();

        s.close();

        //#informamos se pertence ou não à sequencia.
        if(perteceFibo(num)){
            System.out.println("O numero " + num + "pertence a sequencia!");
        }else{
            System.out.println("O numero " + num + " nao pertence a sequencia!");
        }
    }
}
