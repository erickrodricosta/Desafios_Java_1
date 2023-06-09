/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_9;

/**
 *
 * @author ficdev
 */
public class Calculadora {

    /**
     * Realiza a adição de dois números inteiros.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return a soma dos dois números inteiros
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param a o número inteiro a ser subtraído
     * @param b o número inteiro subtraído de 'a'
     * @return a diferença entre os dois números inteiros
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return o produto dos dois números inteiros
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros.
     *
     * @param a o número inteiro a ser dividido
     * @param b o divisor inteiro
     * @return o resultado da divisão como um número inteiro
     * @throws ArithmeticException se a divisão por zero for encontrada
     */
    public int dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Método main utilizado para testar as operações da Calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(5, 3);
        System.out.println("Soma: " + soma);

        int subtracao = calculadora.subtrair(8, 4);
        System.out.println("Subtração: " + subtracao);

        int multiplicacao = calculadora.multiplicar(6, 2);
        System.out.println("Multiplicação: " + multiplicacao);

        try {
            int divisao = calculadora.dividir(10, 2);
            System.out.println("Divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão: " + e.getMessage());
        }

    }

}
