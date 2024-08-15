package controleCandidatos.candidaturas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo!!");
        imprimirSelecionados();
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioPretendido > salarioBase){
            System.out.println(("Ligar para o candidato"));

        }
        else if(salarioPretendido == salarioBase){
            System.out.println(("Ligar para candidato com outra proposta"));
        }
        else{
            System.out.println(("Aguardando resultado dos demais candidatos!"));
        }
    }

    static String [] selecaoCandidatos() {
        String[] candidatos = {"Julio", "Lucas", "Artur", "Pedro", "Elizardo", "Monica", "Leandro", "Rodrigo", "Melissa", "Batista", "Celio", "Enzo"};

        int countSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        List<String> candidatosSelecionado = new ArrayList<>();
        while (countSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato: " + candidato + " solicitou " + salarioPretendido + " como salário!");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato: " + candidato + " foi selecionado para a vaga");
                countSelecionados++;
                candidatosSelecionado.add(candidato);
            }
            candidatoAtual++;
        }
        String [] selecionadosArray = new String[candidatosSelecionado.size()];
        selecionadosArray = candidatosSelecionado.toArray(selecionadosArray);

        return selecionadosArray;
    }

    static void imprimirSelecionados(){
        String [] selecionados = selecaoCandidatos();
        System.out.println("\n  Candidatos selecionados: \n");
        for (String candidato : selecionados) {
            System.out.println(STR."Candidato: \{candidato}");

        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
