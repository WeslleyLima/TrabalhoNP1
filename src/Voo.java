import java.util.Date;

/**
 * Created by thiago on 30/03/2017.
 */
public class Voo extends Compania {
    //ATRIBUTOS------------------------------------------------
    private Date data;
    private String horario;
    private String origem;
    private String destino;
    //CONSTRUTOR SUPER------------------------------------------------

    public Voo(String ciaArea, Date data, String horario, String origem, String destino) {
        super(ciaArea);
        this.data = data;
        this.horario = horario;
        this.origem = origem;
        this.destino = destino;
    }

    //GETSETS------------------------------------------------
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        //faz o tratamento direto das 3 primeiras letras do local
        this.origem = origem.substring(0,2);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        //faz o tratamento direto das 3 primeiras letras do local
        this.destino = destino.substring(0,2);
    }
}
