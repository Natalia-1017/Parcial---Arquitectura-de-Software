package org.example;

import java.util.ArrayList;

public class ReinoTelefonico {
    private ArrayList<TroncomovilCabina> cabinas = new ArrayList<>();

    public void agregarCabina() { cabinas.add(new TroncomovilCabina(cabinas.size() + 1)); }
    public TroncomovilCabina getCabina(int id) { return cabinas.get(id - 1); }

    public void mostrarConsolidado() {
        int totalLlamadas = 0, totalMinutos = 0, totalCosto = 0;
        for (TroncomovilCabina c : cabinas) {
            totalLlamadas += c.getTotalLlamadas();
            totalMinutos += c.getTotalMinutos();
            totalCosto += c.getTotalCosto();
        }
        System.out.println("Resumen Total - Llamadas: " + totalLlamadas + ", Minutos: " + totalMinutos + ", Costo: $" + totalCosto);
    }
}