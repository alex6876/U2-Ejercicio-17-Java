public class VehiculoElectrico {
    int capacidadBateria;
    double nivelActual; //bateria

    public VehiculoElectrico(int capacidadBateria, double nivelActual) {
        this.capacidadBateria = capacidadBateria;
        this.nivelActual = nivelActual;
    }

    public void recibirCarga(double kw){
        double espacioDisponible = capacidadBateria - nivelActual;

        if(nivelActual >= capacidadBateria){
            System.out.println("Nivel de bateria lleno.");

        }else {
            System.out.println("CARGANDO.");
            if (kw > espacioDisponible) {
                nivelActual = capacidadBateria;
            }else {
                nivelActual += kw;
            }
        }

    }

}
