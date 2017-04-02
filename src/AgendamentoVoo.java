import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by thiago on 30/03/2017.
 */
public class AgendamentoVoo {
    static int codigo=1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char menu;
        //CRIADO VETOR DE VOOS
        ArrayList<Voo> voolist=new ArrayList<>();
        do{
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
            menu=scanner.next().charAt(0);
            switch (menu) {
                case 'a':

                    Voo voo = new Voo("TAM",new Date(2017,9,25),"16:30","FOR","SAO");

                    // TESTE DA CLASSE ASSENTO E SUAS SUB CLASSES
                    FirstClass fistClass = new FirstClass();
                    fistClass.setAssentosPrimeiraClasse(2, 'C');
                    fistClass.setAssentosPrimeiraClasse(2, 'A');
                    fistClass.setAssentosPrimeiraClasse(2, 'B');
                    fistClass.mapaAssentos();
                    fistClass.cancelAssento(2, 'B');
                    fistClass.mapaAssentos();

                    Business business = new Business();
                    business.setAssentosBusiness(4, 'A');
                    business.setAssentosBusiness(5, 'B');
                    business.setAssentosBusiness(6, 'C');
                    business.setAssentosBusiness(7, 'D');
                    business.setAssentosBusiness(8, 'A');
                    business.setAssentosBusiness(8, 'B');
                    business.mapaAssentos();
                    business.cancelAssento(5, 'B');
                    business.mapaAssentos();

                    Economy economy = new Economy();
                    economy.setAssentosEconomy(21, 'F');
                    economy.setAssentosEconomy(12, 'A');
                    economy.mapaAssentos();
                    economy.cancelAssento(12, 'A');
                    economy.mapaAssentos();

                    voolist.add(voo);
                    voo = new Voo("GOL",new Date(2017,4,8),"14:00","BRA","JOA");
                    voolist.add(voo);
                    voo = new Voo("AVIANCA",new Date(2017,5,1),"14:00","MAC","FOR");
                    voolist.add(voo);
                    break;
                case 'b':
                    System.out.println("Voo's disponiveis");
                    for (Voo v:voolist) {

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
                case 'd': break;
                case 'e': break;
                case 'f': break;
                case 'g':
                    System.out.println("deseja incluir qual tripulação abaixo.");
                    System.out.println("1- piloto");
                    System.out.println("2- coPiloto");
                    System.out.println("3- comissarios");
                    int menuTripulacao=scanner.nextInt();
                    switch (menuTripulacao){
                        case 1:
                            System.out.println("digite o Voo a inserir tripulacao.");
                            for (Voo v:voolist) {

                                System.out.printf("\ncodigo: %d |Compania %s, data: %s,horario %s ,Origem: %s, Destino %s\n",
                                        v.getCodigo(),
                                        v.getCiaArea(),
                                        v.getData(),
                                        v.getHorario(),
                                        v.getOrigem(),
                                        v.getDestino());
                            }
                            voo=voolist.get(scanner.nextInt());
                            voo.setPiloto();

                            break;
                        case 2:
                            System.out.println("digite o Voo a inserir tripulacao.");
                            for (Voo v:voolist) {

                                System.out.printf("\ncodigo: %d |Compania %s, data: %s,horario %s ,Origem: %s, Destino %s\n",
                                        v.getCodigo(),
                                        v.getCiaArea(),
                                        v.getData(),
                                        v.getHorario(),
                                        v.getOrigem(),
                                        v.getDestino());
                            }
                            voo=voolist.get(scanner.nextInt());
                            voo.setCoPiloto();
                            break;
                        case 3:
                            System.out.println("digite o Voo a inserir tripulacao.");
                            for (Voo v:voolist) {

                                System.out.printf("\ncodigo: %d |Compania %s, data: %s,horario %s ,Origem: %s, Destino %s\n",
                                        v.getCodigo(),
                                        v.getCiaArea(),
                                        v.getData(),
                                        v.getHorario(),
                                        v.getOrigem(),
                                        v.getDestino());
                            }
                            voo=voolist.get(scanner.nextInt());
                            voo.setTripulacao();
                            break;
                    }
                    break;
                case 'h': break;
                case 'i': break;
                case 'j': break;

            }

        }while(menu!='0');
    }
}