import java.util.Scanner;

/**
 * Created by thiago on 30/03/2017.
 */
public class AgendamentoVoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char menu;

        do{
            menu=scanner.next().charAt(0);
            System.out.println("MENU");
            System.out.println("a- Verificar voos disponiveis");
            System.out.println("b- Comprar passagem");
            System.out.println("c- Mos dos assentos");
            System.out.println("d- Emititrar mapar catao de embarque");
            System.out.println("e- Cadastrar passageiros");
            System.out.println("f- Cadatrar tripulantes");
            System.out.println("g- Mostrar voos (origem <-- destino)");
            System.out.println("h- Cancelamento da viagem (EXTRA)");
            System.out.println("i- Imprimir passageiros do voo (EXTRA)");

        }while(menu!='0');
    }
}
