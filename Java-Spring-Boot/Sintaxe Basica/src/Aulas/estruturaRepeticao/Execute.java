package Aulas.estruturaRepeticao;

public class Execute {

    public void executarExemploFor() {
        Aulas.estruturaRepeticao.ExemploFor exemploFor = new ExemploFor();
        exemploFor.executarFor();
        exemploFor.forArray();
        exemploFor.BreakContinue();
        exemploFor.testar();
    }

    public void executarExemploWhile() {
        ExemploWhile exemploWhile = new ExemploWhile();
        exemploWhile.saldoCompras();
    }

    public void executarExemploDoWhile() {
        ExemploDoWhile exemploDoWhile = new ExemploDoWhile();
        exemploDoWhile.ligando();
    }

}
