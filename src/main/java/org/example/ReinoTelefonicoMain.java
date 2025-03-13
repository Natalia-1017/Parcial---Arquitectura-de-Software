package org.example;
import java.util.Scanner;

public class ReinoTelefonicoMain {
    public static void main(String[] args) {
        ReinoTelefonico sistema = new ReinoTelefonico();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar cabina Troncomóvil\n2. Registrar llamada Chismófono\n3. Mostrar info de cabina\n4. Consolidado total\n5. Reiniciar cabina\n6. Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                sistema.agregarCabina();
                System.out.println("Cabina Troncomóvil agregada.");
            } else if (opcion >= 2 && opcion <= 5) {
                System.out.print("Ingrese ID de la cabina Troncomóvil: ");
                int id = sc.nextInt();
                TroncomovilCabina cabina = sistema.getCabina(id);
                if (opcion == 2) {
                    System.out.println("Seleccione tipo de llamada Chismófono (1. LOCAL, 2. LARGA DISTANCIA, 3. CELULAR): ");
                    ChismofonoLlamadas.Tipo tipo = ChismofonoLlamadas.Tipo.values()[sc.nextInt() - 1];
                    System.out.print("Ingrese la duración en minutos: ");
                    int minutos = sc.nextInt();
                    cabina.registrarLlamada(tipo, minutos);
                    System.out.println("Llamada Chismófono registrada.");
                } else if (opcion == 3) {
                    cabina.mostrarInfo();
                } else if (opcion == 5) {
                    cabina.reiniciar();
                    System.out.println("Cabina Troncomóvil reiniciada.");
                }
            } else if (opcion == 4) {
                sistema.mostrarConsolidado();
            }
        } while (opcion != 6);
        System.out.println("Hasta luego.");
    }
}