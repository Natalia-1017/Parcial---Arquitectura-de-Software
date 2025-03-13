

import java.util.ArrayList;

public class TroncomovilCabina {
    private int id;
    private ArrayList<ChismofonoLlamadas> llamadas = new ArrayList<>();

    public TroncomovilCabina(int id) { this.id = id; }

    public void registrarLlamada(ChismofonoLlamadas.Tipo tipo, int minutos) {
        llamadas.add(new ChismofonoLlamadas(tipo, minutos));
    }

    public void mostrarInfo() {
        int totalMinutos = 0, totalCosto = 0;
        System.out.println("Troncomóvil Cabina " + id + " - Detalle de llamadas:");
        for (ChismofonoLlamadas c : llamadas) {
            System.out.println("- Tipo: " + c.getTipo() + ", Minutos: " + c.getMinutos() + ", Costo: $" + c.getCosto());
            totalMinutos += c.getMinutos();
            totalCosto += c.getCosto();
        }
        System.out.println("Total Llamadas: " + llamadas.size() + ", Minutos: " + totalMinutos + ", Costo: $" + totalCosto);
    }

    public void reiniciar() { llamadas.clear(); }
    public int getTotalCosto() { return llamadas.stream().mapToInt(ChismofonoLlamadas::getCosto).sum(); }
    public int getTotalLlamadas() { return llamadas.size(); }
    public int getTotalMinutos() { return llamadas.stream().mapToInt(ChismofonoLlamadas::getMinutos).sum(); }
}