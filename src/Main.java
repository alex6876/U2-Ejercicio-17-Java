public class Main {
    public static void main(String[] args) {
        VehiculoElectrico auto = new VehiculoElectrico(100, 80);

        SurtidorElectrico surtidor = new SurtidorElectrico();

        surtidor.iniciarCarga(auto, 6);

    }
}