public class ClientePj extends Cliente {
   private String cnpj;

  public ClientePj(int umCodigo, String umNome, String umCNPJ) {
    super(umCodigo, umNome);
    this.cnpj = umCNPJ;
  }

  public String getCNPJ() { 
    return cnpj; 
  }

  @Override
    public String getID() {
        return cnpj;
    }

  @Override
  public String toString() {

    return super.toString() + " [cnpj = " + cnpj + "]";
  }



}