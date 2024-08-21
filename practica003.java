/**                                                                                                             
 * @author Diego Hernández Vázquez                                                                              
 * @version 1.0                                                                                                 
 * @date 20 aug  2024.                                                                                          
 */
import java.util.Scanner;//Usamos esta linea para poder usar el Scanner
public class practica003{
    public static void main(String[] diego){
        Scanner key = new Scanner(System.in);//Creamos el Scanner
	//Pedimos la informacion para la carta
        System.out.println("Nombre del remitente:");
        String nombre = key.nextLine();
	System.out.println("Profesión del remitente:");
	String profesion = key.nextLine();
	System.out.println("Nombre del destinatario:");
	String destinatario = key.nextLine();
	System.out.println("Profesión del destinatario:");
	String profesion1 =key.nextLine();
	System.out.println("Mensaje:");
	String mensaje = key.nextLine();

	System.out.println("Este mensaje es urgente? (1-SI/2-NO):");
	int num;//Usamos int para que solo utilicen datos primitivos
        while (true) {//Si el usuario usa 1 o 2 entonces el programa corre normal
            if (key.hasNextInt()) {
                num = key.nextInt();
                if (num == 1 || num == 2) {
                    break;//Si el usuario usa otro numero entonces sale el error para que especifique el numero
                } else {
                    System.out.println("Entrada inválida. Ingresa 1 para SI o 2 para NO:");
                }
            } else {//Si utiliza una letra entonces se le pide que use un número
                System.out.println("Entrada inválida. Ingresa un número:");
                key.next();
            }
        }
	key.nextLine();//Mueve el escáner más allá de la línea actual y devuelve la entrada omitida
	
	double costo = (num == 1) ? 4.00 : 2.00;//Calculamos la cantidad de letras para saber el costo del mensaje
	int cantidadLetras = mensaje.length();
        double costoTotal = mensaje.length() * costo;
	
	System.out.println("Ingrese la dirección del destinatario empezando con calle y numero:");
        String calleNumero = key.nextLine();
        System.out.println("Ciudad y código postal:");
        String ciudadCP = key.nextLine();
	//Mostrar la informacion que el usuario ingreso
        System.out.println("Nombre del remitente: " + nombre);
        System.out.println("Profesión del remitente: " + profesion);
        System.out.println("Nombre del destinatario: " + destinatario);
        System.out.println("Profesión del destinatario: " + profesion1);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("¿Este mensaje es urgente? " + (num == 1 ? "SI" : "NO"));
	System.out.println("Costo total: $" + costoTotal);
	System.out.println("Este mensaje tiene " + cantidadLetras + " letras. El costo por letra es de $" + costo);
	System.out.println("Dirección del destinatario:");
        System.out.println(calleNumero);
        System.out.println(ciudadCP);

	key.close(); //Cerramos el scanner
    }
}
