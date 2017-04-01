import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by thiago on 30/03/2017.
 */
public class FirstClass extends Assento {
    //atributos

    private double preco;
    private double taxaCancelamento;
    private int prioridade;

    //construtor personalisado

    public FirstClass() {
        this.preco = preco;
        this.taxaCancelamento = 0.9;
        this.prioridade = 1;
    }

//metodo de cancelamento

    public void CancelamentoVoo(Voo voo){
        double pagamento;
        boolean podeCancelar = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        Date dataVoo;
        dataVoo= voo.getData();
        //variavel

        String dataa = dateFormat.format(date);

        int anoAtual = Integer.parseInt(dataa.substring(0, 4));

        int mesAtual = Integer.parseInt(dataa.substring(6, 7));

        int diaAtual = Integer.parseInt(dataa.substring(9, 10));

        int horaAtual = Integer.parseInt(dataa.substring(11, 13));

        int minutoAtual = Integer.parseInt(dataa.substring(14, 16));

        //pegar do horario do voo

        int anoVoo = 5 ;
        int mesVoo = 4;
        int diaVoo = 1;

        int horaVoo=13;
        int minutoVoo=30;

        if(anoAtual < anoVoo){
            podeCancelar = false;
        }else {
            if (anoAtual == anoVoo) {
                if (mesAtual < mesVoo) {
                    podeCancelar = false;
                } else {
                    if (mesAtual == mesVoo) {
                        if (diaAtual < diaVoo) {
                            podeCancelar = false;
                        } else {
                            if (diaAtual == diaVoo) {
                                minutoVoo = minutoVoo - 30;
                                if (minutoVoo <= 0) {
                                    horaVoo--;
                                    minutoVoo = 60 + minutoVoo;
                                }


                                if (horaAtual < horaVoo) {
                                    podeCancelar = true;
                                } else {
                                    if (horaAtual == horaVoo && minutoAtual < minutoVoo) {
                                        podeCancelar = true;
                                    } else {
                                        podeCancelar = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }


        }


        if(podeCancelar == true){
            pagamento = preco * taxaCancelamento;
        }else{
            System.out.println("Não pode cancelar");
        }

    }
}
