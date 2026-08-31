public class ClientePf extends Cliente {
    private String cpf;

    public ClientePf(int umCodigo, String umNome, String umCPF) {
        super(umCodigo, umNome);
        this.cpf = umCPF;
    }

    public String getCPF() {
        return cpf;
    }

    @Override
    public String getID() {
        return cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " [cpf = " + cpf + "]";
    }
}