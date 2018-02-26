public enum Cedulas {
    DEZ(10), VINTE(20), CINQUENTA(50), CEM(100);

    private final int valorCedula;


    Cedulas(final int valorCedula) {
        this.valorCedula = valorCedula;
    }

    public int getValorCedula(){
        return this.valorCedula;
    }
}
