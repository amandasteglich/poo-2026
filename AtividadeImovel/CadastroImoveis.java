import java.util.ArrayList; 

public class CadastroImoveis {
    private ArrayList<Imovel> lista;

    private CadastroImoveis(){
        lista = new ArrayList<>();
    }

    private static CadastroImoveis instance;

    public static CadastroImoveis getInstance() {
        if (instance == null) {
            instance = new CadastroImoveis();
        }
        return instance;
    }

    public void add(Imovel imovel){
       lista.add(imovel);
    }

    public void mostrar(){
        for(Imovel imovel : lista){
            System.out.println(imovel.toString());
            System.out.println("\nimposto: " + imovel.calculaImposto());
        }
    }

    // Lista imóveis cujo proprietário corresponde ao nome informado
    public void listar(String nome){
        for(Imovel imovel : lista){
            if(imovel.getProprietario() != null && imovel.getProprietario().equals(nome)){
                // imprime representação do próprio objeto
                System.out.println(imovel.toString());
                // exemplo de tratamento por tipo
                if(imovel instanceof Residencial){
                    System.out.println("(Residencial)");
                } else if(imovel instanceof Comercial){
                    System.out.println("(Comercial)");
                }
            }
        }
    }
}
