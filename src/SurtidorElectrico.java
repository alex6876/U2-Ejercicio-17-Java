public class SurtidorElectrico {

    public void iniciarCarga(VehiculoElectrico vehiculo, int minutos){
        for (int i = 0; i<minutos; i++){


            if(vehiculo.nivelActual >= vehiculo.capacidadBateria){
                System.out.println("Bateria llena.");
                break;
            }

            System.out.println("Minutos de carga: "+ (i + 1));
            vehiculo.recibirCarga(5.0);

            System.out.println("Nivel de bateria: "+ vehiculo.nivelActual);
        }
    }
}
