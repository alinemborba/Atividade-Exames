public class Principal {
    public static void main(String[] args) {
        ExameGlicemia eg = new ExameGlicemia();
        eg.cadastrarExame();
        eg.mostrarResultado();

        ExameColesterol ec = new ExameColesterol();
        ec.cadastrarExame();
        ec.mostrarResultado();

        ExameTriglicerideo et = new ExameTriglicerideo();
        et.cadastrarExame();
        et.mostrarResultado();

    }
}
