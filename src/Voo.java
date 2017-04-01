import java.util.Date;
import java.util.Scanner;

/**
 * Created by thiago on 30/03/2017.
 */

public class Voo extends Compania {

    //ATRIBUTOS------------------------------------------------
    private Date data;
    private String horario;
    private String origem;
    private String destino;
    private Assento assento[];
    private CartaoEmbarque cartao[];
    private Pessoa pessoa[];
    private Pessoa tripulacao[];
    private Pessoa piloto;
    private Pessoa Copiloto;

    private int OrigemDestino[][]={{0,1641,1248,3022,1292,2121,2061,2207,815,1461,486},
            {2079,0,2111,1432,1592,2212,1778,2665,2904,1133,1693,1636},
            {1578,2824,0,3117,624,1118,1372,820,973,1893,666,1726},
            {6000,6083,4736,0,2496,2667,2107,3370,3620,2562,2503,3067},
            {1652,2120,716,4275,0,878,873,1081,1314,1687,173,1716},
            {2765,2942,1453,3836,1134,0,559,780,1007,2547,705,2593},
            {2595,3193,1004,4821,1366,991,1679,0,251,2670,972,2545},
            {2892,3500,1301,5128,1673,1298,1986,300,0,2857,1215,2693},
            {1183,1610,2528,6548,2200,3407,3406,3541,3838,0,1854,555},
            {1848,2017,906,4076,209,935,934,1186,1493,2482,0,1889},
            {611,2161,2171,6593,2245,3357,3366,3188,3485,688,2442,0},
            {294,2173,1854,6279,1930,3040,3049,2871,3168,1075,2125,395},
            {5215,5298,3951,785,3490,3051,2357,4036,4443,5763,3291,5808},
            {788,2108,2348,6770,2422,3534,3543,3365,3662,537,2618,185},
            {1662,1283,1690,4926,973,1785,1784,2036,2336,2035,874,2253},
            {3296,3852,1712,5348,2027,1518,2206,711,476,4242,1847,3889},
};
    //CONSTRUTOR SUPER------------------------------------------------

    public Voo(String ciaArea, Date data, String horario, String origem, String destino) {
        super(ciaArea);
        this.data = data;
        this.horario = horario;
        this.origem = origem;
        this.destino = destino;
    }

    //GETSETS------------------------------------------------
    public String getData() {
        String data;
        data=String.format("%d/%d/%d",this.data.getYear(),this.data.getMonth(),this.data.getDay());
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
        this.origem = origem.substring(0,3);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        //faz o tratamento direto das 3 primeiras letras do local
        this.destino = destino.substring(0,3);
    }
    //METODOS TRIPULACAO AVIAO----------------------------------------------------
    public Pessoa setPiloto(){
        Scanner scanner= new Scanner(System.in);
        Pessoa piloto= new Piloto();
        System.out.println("Digite a matricula do piloto.");
        piloto.setId(scanner.nextLine());
        System.out.println("Digite o Nome do piloto.");
        piloto.setNome(scanner.nextLine());
        System.out.println("digite o Sobrenome do piloto");
        piloto.setSobrenome(scanner.nextLine());

        return piloto;
    }
    public Pessoa setCoPiloto(){
        Scanner scanner= new Scanner(System.in);
        Pessoa coPiloto= new CoPiloto();
        System.out.println("Digite a matricula do Copiloto.");
        coPiloto.setId(scanner.nextLine());
        System.out.println("Digite o Nome do piloto.");
        coPiloto.setNome(scanner.nextLine());
        System.out.println("digite o Sobrenome do piloto");
        coPiloto.setSobrenome(scanner.nextLine());

        return coPiloto;
    }
    public Pessoa Tripulacao(){
        Scanner scanner= new Scanner(System.in);
        Pessoa tripulacao= new ComissarioBordo();
        System.out.println("Digite a matricula do Copiloto.");
        tripulacao.setId(scanner.nextLine());
        System.out.println("Digite o Nome do piloto.");
        tripulacao.setNome(scanner.nextLine());
        System.out.println("digite o Sobrenome do piloto");
        tripulacao.setSobrenome(scanner.nextLine());

        return tripulacao;
    }
    //

}
