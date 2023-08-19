import javax.swing.*;
public class ExameGlicemia extends Exame {

    @Override
    public void cadastrarExame() {

        super.cadastrarExame();
    }

    public void mostrarResultado() {
        JFrame f;
        f = new JFrame();
        String resultadoGlicemia = null;

        int glicemia = Integer.parseInt(JOptionPane.showInputDialog(f, "Qual o valor da glicemia?"));

        if (glicemia < 100){
            resultadoGlicemia = "Normoglicemia";
        } else if ((glicemia >= 100) && (glicemia < 126)){
            resultadoGlicemia = "Pré-diabetes";
        } else if (glicemia >= 126) {
            resultadoGlicemia = "Diabetes estabelecido";
        }

        JOptionPane.showMessageDialog(f, "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nGlicemia: " + glicemia + " mg/dL" + "\nResultado: " + resultadoGlicemia);
    }

}
