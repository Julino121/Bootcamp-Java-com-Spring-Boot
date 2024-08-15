package Aulas.estruturaRepeticao;

import java.util.Arrays;

public class ExemploFor {

    public void executarFor(){
        for(int i = 1; i<=10; i++ ){
            System.out.println("Contando: " + i);
        }
    }

    public void forArray(){
        String[] alunos = {"FELIPE", "JONAS", "JULIO", "LEANDRO", "NICOLAS"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }

    public void BreakContinue(){
        for(int i = 1; i <= 10; i++){
            if (i == 6){
                break;  //para de executar o codigo
            }

            if (i == 3){
                continue; //pula essa interação, ou seja, nao vai printar o numero 3, vai pular pro proximo
            }

            System.out.println("Contando: " + i);
        }

    }

    public void testar(){
        Integer[] numerosPares = new Integer[25];
        Integer[] numerosImpares = new Integer[25];

        int indicePar = 0;
        int indiceImpar = 0;
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                numerosPares[indicePar] = i;
                indicePar ++;
            }
            else{
                numerosImpares[indiceImpar] = i;
                indiceImpar ++;
            }
        }

        System.out.print("NUMEROS PARES: "+ Arrays.toString(numerosPares));
        System.out.print("\nNUMEROS IMPARES: "+ Arrays.toString(numerosImpares));
    }
}
