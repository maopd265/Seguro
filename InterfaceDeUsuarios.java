import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Object;
import java.lang.NullPointerException;
/**
 * Classe Interface
 * Menu de opções
 * @Maurício Zalamena Bavaresco
 * @version 9/11/2017
 */
public class InterfaceDeUsuarios {

    Scanner entrada;
    private Lista<Cliente> osClientes;
    private Lista<Seguro> osSeguros;
    private PersistenciaDeListas persiste= new PersistenciaDeListas();
    public void menu(){

        //ArrayList<Lista> temp = temp = new ArrayList<Lista>();
        ArrayList<Lista> temp=persiste.recupera();
        osClientes = temp.get(0);
        osSeguros =temp.get(1);
        System.out.println("Tamanho da lista em elementos:"+temp.size());
        //osSeguros
        // osSeguros=persist.recuperaSeguros();
        entrada = new Scanner(System.in);
        ArrayList<Cliente> listaDeUsuarios = new ArrayList<Cliente>();

        int op = 0,i,j;
        Cliente clienteTemp = null ;
        Seguro seguroTemp = null ;
        String opcao;
        do{
            System.out.println("");
            System.out.println("");
            System.out.println("MENU DE ESCOLHAS");//feito
            System.out.println("A- CADASTRAR CLIENTE");//feito
            System.out.println("B- INSERIR O CADASTRO DE UM NOVO TIPO DE SEGURO");
            System.out.println("C- LISTAR TODOS OS SEGUROS CADASTRADOS");
            System.out.println("D- LISTAR TODOS OS CLIENTES CADASTRADOS");//feito
            System.out.println("E- LISTAR OS SEGUROS CADASTRADOS PARA UM DETERMINADO CLIENTE");
            System.out.println("F- BUSCAR INFORMAÇÕES DE UM SEGURO PELO NÚMERO DE ÁPOLICE");
            System.out.println("S- SAIR");

            opcao=entrada.nextLine().toUpperCase().trim();
            switch(opcao){
                case "A": 
                try{
                    System.out.println("Cadastro de Cliente:");
                    System.out.println("Digite o nome do usuário:");
                    String Nome=entrada.nextLine();
                    System.out.println("Digite o cpf do usuário:");
                    String Cpf=entrada.nextLine();
                    System.out.println("Digite o data de nascimento do usuário:");
                    String Nascimento = entrada.nextLine();
                    System.out.println("Digite o endereço do usuário:");
                    String Endereco=entrada.nextLine();
                    clienteTemp = new Cliente(Nome,Cpf,Nascimento,Endereco);
                    osClientes.incluir(clienteTemp);
                    System.out.println("");

                }catch(ObjetoJaExistente e){
                    System.out.println(e.erro());
                }
                break;

                case "B": 
                System.out.println("Inseririndo o cadastro de um novo tipo de seguro...");
                System.out.println("Digite o cpf do cliente:");

                String TesteCpf=entrada.nextLine();
                int w=0;
                boolean encontrou = false;
                //int t = osClientes.verificacao(cliente_dois.getNome());
                clienteTemp=osClientes.get(w);
                while( clienteTemp != null)
                {     
                    if(TesteCpf.equals(clienteTemp.getCpf()))
                    {
                        encontrou= true;
                        System.out.println("Esse cpf corresponde a uma pessoa na lista!");
                        break;
                    }
                    w++;
                    clienteTemp = osClientes.get(w);
                }

                if(osClientes!=null && encontrou==true){

                    int alternativa;
                    do{
                        System.out.println("1-Cadastro de seguro de vida");
                        System.out.println("2-Cadastro de seguro de imóvel");
                        System.out.println("3-Cadastro de seguro de automóvel");
                        System.out.println("4-SAIR");
                        alternativa=entrada.nextInt();
                        switch(alternativa){
                            case 1 :
                            try{
                                System.out.println("");
                                System.out.println("---------Seguro de vida---------");
                                System.out.println("");
                                int q;
                                entrada.nextLine();

                                System.out.println("Digite o número da apólice:");
                                String NumApolice=entrada.nextLine();
                                System.out.println("Digite o valor do seguro:");
                                double ValorSeg=entrada.nextDouble();
                                System.out.println("Digite o número de dependentes:");
                                int NumDepend=entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("Digite a data:");
                                String Data=entrada.nextLine();
                                /*problema*/ 
                                Vida vidaTemp= new Vida(NumApolice,Data,ValorSeg,clienteTemp,NumDepend);
                                clienteTemp.incluirUmSeguro(vidaTemp);
                                clienteTemp.setSeguro(vidaTemp);
                                osSeguros.incluir(vidaTemp);
                                //seguroTemp = new Vida(NumApolice,Data,ValorSeg,clienteTemp,NumDepend);
                                //osSeguros.incluir(seguroTemp);

                            }catch(ObjetoJaExistente e){
                                System.out.println(e.erro());
                            }
                            catch(InputMismatchException e){}
                            catch(NullPointerException e){}

                            break;

                            case 2:
                            try{
                                System.out.println(""); 
                                System.out.println("---------Seguro do imóvel---------");
                                String aux;
                                System.out.println("");
                                entrada.nextLine();
                                System.out.println("Digite a data de construção:");
                                String dataConst=entrada.nextLine();
                                System.out.println("Digite o número da apólice:");
                                String ApoliceImovel=entrada.nextLine();

                                System.out.println("Digite o valor do seguro:");
                                double ValorSeg_imovel=entrada.nextDouble();
                                entrada.nextLine();
                                System.out.println("Digite a data:");
                                String DataImovel=entrada.nextLine();
                                entrada.nextLine();
                                Imovel Imo = new Imovel(dataConst,ApoliceImovel,DataImovel,ValorSeg_imovel,clienteTemp);
                                clienteTemp.setSeguro(Imo);
                                clienteTemp.incluirUmSeguro(Imo);
                                osSeguros.incluir(Imo);
                                //temp.add(osSeguros);
                            }catch(ObjetoJaExistente e){
                                System.out.println(e.erro());
                            }
                            catch(InputMismatchException e){}
                            catch(NullPointerException e) {}

                            break;
                            case 3:
                            try{
                                System.out.println("");
                                System.out.println("---------Seguro do automóvel---------");
                                System.out.println("");
                                System.out.println("Digite a placa do carro:");
                                String PlacaCar= entrada.nextLine();
                                entrada.nextLine();
                                System.out.println("Digite o estado: ");
                                String Estado= entrada.nextLine();
                                entrada.nextLine();
                                System.out.println("Digite o modelo do carro:");
                                String modeloCarro=entrada.nextLine();
                                entrada.nextLine();
                                System.out.println("Digite o numero da licença:");
                                String Licenca=entrada.nextLine();
                                entrada.nextLine();
                                System.out.println("Digite o ano do carro:");
                                String AnoCarro=entrada.nextLine();
                                entrada.nextLine();
                                System.out.println("Digite o número de apólice:");
                                String Napolice=entrada.nextLine();
                                entrada.nextLine();
                                System.out.println("Digite a data:");
                                String DataAut=entrada.nextLine();
                                entrada.nextLine();
                                System.out.println("Digite o valor do seguro:");
                                double VlorSeg=entrada.nextDouble();
                                Automovel autoTemp = new Automovel(PlacaCar,Estado,modeloCarro,Licenca,AnoCarro,Napolice,DataAut,VlorSeg,clienteTemp);
                                System.out.println("");
                                clienteTemp.setSeguro(autoTemp);
                                clienteTemp.incluirUmSeguro(autoTemp);
                                osSeguros.incluir(autoTemp);
                                System.out.println("");
                            }catch(ObjetoJaExistente e){
                                System.out.println(e.erro());
                            }
                            catch(InputMismatchException e){}
                            catch(NullPointerException e) {}

                            break;
                            case 4:
                            System.out.println("SAINDO DO CADASTRO DE SEGUROS!");
                            break;

                        }
                    }while(alternativa!=4);

                }else{
                    System.out.println("Não foi encontrado a pessoa na lista!");
                }

                //inserir o cadastro de um novo tipo de seguro
                break;
                case "C" : 

                if(osSeguros!=null){
                    System.out.println("Listando todos os seguros cadastrados...");
                    for(i=0;i<osSeguros.tamanho();i++){
                        System.out.println("");
                        System.out.println("");
                        seguroTemp=osSeguros.get(i);
                        
                        System.out.println(seguroTemp.toString());
                        System.out.println("Nome da pessoa:"+seguroTemp.getTitular().getNome());
                        System.out.println("Data:"+seguroTemp.getData());
                        System.out.println("Numero da Apolice:"+seguroTemp.getNumeroApolice());
                        System.out.println("Valor determinado do seguro:"+seguroTemp.getValorSeguro());
                        

                    }
                }else{
                    System.out.println("Lista vazia!");
                }

                //listar todos os seguros cadastrados
                break;

                case "D" :
                if(osClientes!=null){
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Listando todos os clientes cadastrados...");
                    for (i=0 ; i<osClientes.tamanho(); i++)
                    {
                        clienteTemp = osClientes.get(i);
                        System.out.println("");
                        System.out.println("Cliente:"+clienteTemp.getNome());
                        System.out.println( "CPF:"+clienteTemp.getCpf());
                        System.out.println( "Data de nascimento: "+clienteTemp.getData_de_nascimento());
                        System.out.println( "Endereço:"+clienteTemp.getEndereco());
                        System.out.println("");
                    }
                }else{
                    System.out.println("Lista vazia!");
                }
                //listar todos os clientes cadastrados
                break;
                case "E" : 
                System.out.println("");
                System.out.println("Listando os seguros cadastrados para um determinado cliente...");
                System.out.println("Digite o cpf do Cliente:");
                //listar os seguros cadastrados para um determinado cliente

                String Pcpf=entrada.nextLine();
                System.out.println("");

                for( i=0 ; i<osSeguros.tamanho() ; i++)
                {
                    if(Pcpf.equals(osSeguros.get(i).getTitular().getCpf())){
                        Seguro seguro2=osSeguros.get(i);
                        System.out.println("");

                        System.out.println(seguro2.toString());
                        System.out.printf("Data:");
                        System.out.println(seguro2.getData());
                        System.out.printf("Numero apolice:");
                        System.out.println(seguro2.getNumeroApolice());
                        System.out.printf("Titular:");
                        System.out.println(seguro2.getTitular().getNome());
                    }

                }
                break;

                case "F" : System.out.println("Buscando as informações de um seguro pelo número de apólice...");
                System.out.println("Digite o número da apólice:");
                String apolice;
                apolice=entrada.nextLine();
                for(i=0;i<osSeguros.tamanho();i++){
                    if(apolice.equals(osSeguros.get(i).getNumeroApolice())){
                        Seguro seguro2=osSeguros.get(i);
                        System.out.println("");
                        System.out.println("");
                        System.out.println(seguro2.toString());
                        System.out.printf("Data:");
                        System.out.println(seguro2.getData());
                        System.out.printf("Número da apolice:");
                        System.out.println(seguro2.getNumeroApolice());
                        System.out.printf("Nome da pessoa:");
                        System.out.println(seguro2.getTitular().getNome());
                    }
                }
                //buscar as informações de um seguro pelo número de apólice

                break;

                case "S" : System.out.println("Saindo do programa...");
                //sair do programa

                break;

            }

        }while(!opcao.equals("S"));

        temp = new ArrayList<Lista>();
        temp.add(osClientes);
        temp.add(osSeguros);
        persiste.guarda(temp);
        System.out.println("Tamanho da persistencia em elementos:"+(temp.size()));
        
    }
}