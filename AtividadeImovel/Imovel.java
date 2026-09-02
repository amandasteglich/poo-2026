public abstract class Imovel {
    private String proprietario;
    private int areaConstruida;
    private Geo geo;
    private static double VR = 50;

    public Imovel(String umproprietario, int umaArea, double umageolocalizacao) {
        this.proprietario = umproprietario;
        this.areaConstruida = umaArea;
        this.geo = geo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public static void setVR(double novoVR) {
        VR = novoVR;
    }

    public abstract double calculaImposto();


    public String toString(){
        return "\n Proprietário do imóvel : " + proprietario +
                "\n Área construída: " + areaConstruida +
                "\n Geolocalização: " + geo;
    }
}
