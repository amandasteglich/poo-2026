class Residencial extends Imovel {

    private int areaTerreno;

    public Residencial(String proprietario, int areaConstruida,
                       Geo geo, int areaTerreno) {

        super(proprietario, geo, areaConstruida);
        this.areaTerreno = areaTerreno;
    }

    public int getAreaTerreno() {
        return areaTerreno;
    }

    public double calculaImposto(){
        double imposto = 0;
        if(getAreaConstruida()>200){
            imposto = (getAreaConstruida() - 200) *getVR();
        }
        else if(getAreaConstruida()> 100){
            imposto += 100 * getVR();
        }
        return imposto;
    }

    @Override
    public String toString(){
        String vrExtra;
        if(getAreaConstruida()> 100){
            vrExtra = " há um imposto adicional";
        }
        else{
            vrExtra = " não há um imposto adicional";
        }
        return super.toString() + vrExtra;
    }
}

