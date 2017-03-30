/**
 * Created by thiago on 30/03/2017.
 */
public class Assento {

    //ATRIBUTOS---------------------------------
    private int num;
    private char fileira;
    private tipoAlimentacao alimentacao;
    private double largura;
    private double comprimento;

    //GETSETS------------------------------------------------

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getFileira() {
        return fileira;
    }

    public void setFileira(char fileira) {
        this.fileira = fileira;
    }

    public tipoAlimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(tipoAlimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    //TODO: DESENVOLVER METODOS  se APLICADO
}
