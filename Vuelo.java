import java.time.LocalTime;
public class Vuelo{
    int idVuelos;
    String destino;
    LocalTime horaLocalTime;
    float precio;

    public Vuelo(int idVuelos, String destino, LocalTime horaLocalTime, float precio) {
        this.idVuelos = idVuelos;
        this.destino = destino;
        this.horaLocalTime = horaLocalTime;
        this.precio = precio;
    }

    void obtenerVuelo(){
        System.out.println("----- INFORMACIÓN DEL VUELO -----");
        System.out.println("Informacion del vuelo - ID: " + idVuelos + 
        " Destino: " + destino + 
        " Hora: " + horaLocalTime + 
        " Precio: $" + precio);
    }
    
        void buscarVueloPorId(int idBusqueda) {
        if (this.idVuelos == idBusqueda) {
            System.out.println("¡Vuelo encontrado!");
            obtenerVuelo(); // Llama a tu otro método para mostrar los datos
        } else {
            System.out.println("El ID " + idBusqueda + " no coincide con este vuelo.");
        }
    }
}
