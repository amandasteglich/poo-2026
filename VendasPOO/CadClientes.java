import java.util.ArrayList;

public class CadClientes {
    private ArrayList<Cliente> lista;

    private CadClientes() {
        lista = new ArrayList<>();
    }

    private static CadClientes instance;

    public static CadClientes getInstance() {
        if (instance == null) {
            instance = new CadClientes();
        }
        return instance;
    }

    public void inserir(Cliente cli) {
        lista.add(cli);
    }

    public Cliente pesquisar(int cod) {
        for (Cliente cli : lista) {
            if (cli.getCodigo() == cod)
                return cli;
        }
        return null;
    }

    public Cliente pesquisar(String id) {
        for (Cliente cli : lista) {
            if (cli.getID().equals(id))
                return cli;
        }
        return null;
    }

    public String toString() {
        StringBuilder aux = new StringBuilder(
                "\nCadastro de Clientes\n- - - - - - - - - - -\n");

        for (Cliente umCliente : lista) {
            aux.append(umCliente.toString() + "\n");
        }

        return aux.toString();
    }
}