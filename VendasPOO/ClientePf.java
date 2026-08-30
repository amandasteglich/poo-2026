public class ClientePf extends Cliente {
  private String cpf;

  public ClientePf(int umCodigo, String umNome, String umCPF) {
    super(umCodigo, umNome);
    this.cpf = umCPF;
  }


  public String getCPF() { return cpf; }

  @Override
  public String toString() {
    // ficou feio...
    //return super.getCodigo() + super.getNome() + "[cpf=" + cpf + "]";

    // reutilizando o toString da Classe Cliente
    return super.toString() + " [cpf = " + cpf + "]";
  }



}