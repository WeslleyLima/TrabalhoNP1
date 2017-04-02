import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by thiago on 30/03/2017.
 */
public class AgendamentoVoo {
    static int codigo = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char menu;
        //CRIADO VETOR DE VOOS
        ArrayList<Voo> voolist = new ArrayList<>();
        do {
            System.out.println("MENU");
            System.out.println("a- Configurar Voo");
            System.out.println("b- Verificar voos disponiveis");
            System.out.println("c- Comprar passagem");
            System.out.println("d- Mos dos assentos");
            System.out.println("e- Emititrar mapar catao de embarque");
            System.out.println("f- Cadastrar passageiros");
            System.out.println("g- Cadatrar tripulantes");
            System.out.println("h- Mostrar voos (origem <-- destino)");
            System.out.println("i- Cancelamento da viagem (EXTRA)");
            System.out.println("j- Imprimir passageiros do voo (EXTRA)");
            menu = scanner.next().charAt(0);
            switch (menu) {
                case 'a':
                    Voo voo = new Voo("TAM", new Date(2017, 9, 25), "16:30", "FOR", "SAO");
                    voolist.add(voo);
                    voo = new Voo("GOL", new Date(2017, 4, 8), "14:00", "BRA", "JOA");
                    voolist.add(voo);
                    voo = new Voo("AVIANCA", new Date(2017, 5, 1), "14:00", "MAC", "FOR");
                    voolist.add(voo);
                    break;
                case 'b':
                    System.out.println("Voo's disponiveis");
                    for (Voo v : voolist) {

                        System.out.printf("\nCompania %s, data: %s,horario %s ,Origem: %s, Destino %s\n",
                                v.getCiaArea(),
                                v.getData(),
                                v.getHorario(),
                                v.getOrigem(),
                                v.getDestino());
                    }
                    break;
                case 'c':

                    break;
                case 'd':
                    // TESTE DA CLASSE ASSENTO E SUAS SUB CLASSES ONDE CADA VOO RECEBE SUA FirstClass, Business e Economy
                    Voo vooTeste1 = new Voo("TAM", new Date(2018, 9, 24), "16:30", "FOR", "SAO");
                    Voo vooTeste2 = new Voo("TAM", new Date(2018, 9, 25), "16:30", "FOR", "SAO");

                    vooTeste1.firstClass.setAssentosPrimeiraClasse(2, 'C');
                    vooTeste1.firstClass.setAssentosPrimeiraClasse(2, 'A');
                    vooTeste1.firstClass.setAssentosPrimeiraClasse(2, 'B');
                    vooTeste1.firstClass.mapaAssentos();
                    vooTeste1.firstClass.cancelAssento(2, 'B');
                    vooTeste1.firstClass.mapaAssentos();

                    vooTeste2.firstClass.setAssentosPrimeiraClasse(1, 'C');
                    vooTeste2.firstClass.setAssentosPrimeiraClasse(1, 'A');
                    vooTeste2.firstClass.setAssentosPrimeiraClasse(1, 'B');
                    vooTeste2.firstClass.mapaAssentos();
                    vooTeste2.firstClass.cancelAssento(1, 'B');
                    vooTeste2.firstClass.mapaAssentos();

                    vooTeste1.business.setAssentosBusiness(4, 'A');
                    vooTeste1.business.setAssentosBusiness(5, 'B');
                    vooTeste1.business.setAssentosBusiness(6, 'C');
                    vooTeste1.business.mapaAssentos();
                    vooTeste1.business.cancelAssento(4, 'A');
                    vooTeste1.business.mapaAssentos();
                    break;
                case 'e':
                    break;
                case 'f':
                    break;
                case 'g':
                    System.out.println("deseja incluir qual tripulação abaixo.");
                    System.out.println("1- piloto");
                    System.out.println("2- coPiloto");
                    System.out.println("3- comissarios");
                    int menuTripulacao = scanner.nextInt();
                    switch (menuTripulacao) {
                        case 1:
                            System.out.println("digite o Voo a inserir tripulacao.");
                            for (Voo v : voolist) {

                                System.out.printf("\ncodigo: %d |Compania %s, data: %s,horario %s ,Origem: %s, Destino %s\n",
                                        v.getCodigo(),
                                        v.getCiaArea(),
                                        v.getData(),
                                        v.getHorario(),
                                        v.getOrigem(),
                                        v.getDestino());
                            }
                            voo = voolist.get(scanner.nextInt());
                            voo.setPiloto();

                            break;
                        case 2:
                            System.out.println("digite o Voo a inserir tripulacao.");
                            for (Voo v : voolist) {

                                System.out.printf("\ncodigo: %d |Compania %s, data: %s,horario %s ,Origem: %s, Destino %s\n",
                                        v.getCodigo(),
                                        v.getCiaArea(),
                                        v.getData(),
                                        v.getHorario(),
                                        v.getOrigem(),
                                        v.getDestino());
                            }
                            voo = voolist.get(scanner.nextInt());
                            voo.setCoPiloto();
                            break;
                        case 3:
                            System.out.println("digite o Voo a inserir tripulacao.");
                            for (Voo v : voolist) {

                                System.out.printf("\ncodigo: %d |Compania %s, data: %s,horario %s ,Origem: %s, Destino %s\n",
                                        v.getCodigo(),
                                        v.getCiaArea(),
                                        v.getData(),
                                        v.getHorario(),
                                        v.getOrigem(),
                                        v.getDestino());
                            }
                            voo = voolist.get(scanner.nextInt());
                            voo.setTripulacao();
                            break;
                    }
                    break;
                case 'h':
                    break;
                case 'i':
                    break;
                case 'j':
                    break;

            }

        } while (menu != '0');
    }
}