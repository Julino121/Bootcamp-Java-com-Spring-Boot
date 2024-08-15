package Aulas.tratamentoExcecoes;

public class FormatarCep {

    public String formatar(String cep) {

        String cepNumerico = cep.replaceAll("\\D", "");


        if (cepNumerico.length() != 8) {
            throw new IllegalArgumentException("CEP inválido. Deve conter 8 dígitos.");
        }


        return cepNumerico.substring(0, 5) + "-" + cepNumerico.substring(5, 8);
    }

    public static void main(String[] args) {
        FormatarCep formatarCep = new FormatarCep();
        String cepFormatado = formatarCep.formatar("12345678");
        System.out.println("CEP Formatado: " + cepFormatado);  // Saída: CEP Formatado: 12345-678

        // Teste com CEP com caracteres especiais
        cepFormatado = formatarCep.formatar("12.345-678");
        System.out.println("CEP Formatado: " + cepFormatado);  // Saída: CEP Formatado: 12345-678
    }
}
