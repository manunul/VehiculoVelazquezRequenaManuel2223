
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoVelazquezRequenaManuel2223 miVehiculoVelazquezRequenaManuel2223;
        int stockActual;
        
        miVehiculoVelazquezRequenaManuel2223 = new VehiculoVelazquezRequenaManuel2223("Seat",18000,100);
        operativaVehiculosVelazquezRequenaManuel2223(miVehiculoVelazquezRequenaManuel2223, 50); 
    }

    private static void operativaVehiculosVelazquezRequenaManuel2223(VehiculoVelazquezRequenaManuel2223 miVehiculoVelazquezRequenaManuel2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoVelazquezRequenaManuel2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoVelazquezRequenaManuel2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoVelazquezRequenaManuel2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
