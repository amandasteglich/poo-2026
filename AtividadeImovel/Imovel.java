public abstract class Imovel {

    private String proprietario;
    private int areaConstruida;
    private Geo geo;

    private static double VR = 50;

    public Imovel(String umproprietario, int umaArea, Geo umageolocalizacao) {
        this.proprietario = umproprietario;
        this.areaConstruida = umaArea;
        this.geo = umageolocalizacao;
    }

    public String getProprietario() {
        return proprietario;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public static double getVR() {
        return VR;
    }

    public static void setVR(double novoVR) {
        VR = novoVR;
    }

    public abstract double calculaImposto();

    @Override
    public String toString() {
        return "\nProprietário do imóvel: " + proprietario +
               "\nÁrea construída: " + areaConstruida +
               "\nGeolocalização: " + geo;
    }
}