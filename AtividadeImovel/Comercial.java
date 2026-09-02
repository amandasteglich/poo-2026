public class Comercial extends Imovel {
    public Comercial(String proprietário, int areaConstruida, Geo geo){
        super(proprietário, areaConstruida, areaConstruida);
    }
    
    @Override
    public double calculaImposto() {
        return 0;
    }
}
