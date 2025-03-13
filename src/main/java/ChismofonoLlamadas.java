

    public class ChismofonoLlamadas {
        public enum Tipo { LOCALES, LARGADISTANCIA, CELULARES }
        private Tipo tipo;
        private int minutos, costo;

        public ChismofonoLlamadas(Tipo tipo, int minutos) {
            this.tipo = tipo;
            this.minutos = minutos;
            this.costo = calcularCosto();
        }

        private int calcularCosto() {
            return switch (tipo) {
                case LOCALES -> minutos * 50;
                case LARGADISTANCIA-> minutos * 350;
                case CELULARES -> minutos * 150;
            };
        }

        public int getMinutos() { return minutos; }
        public int getCosto() { return costo; }
        public Tipo getTipo() {return tipo; }
    }
