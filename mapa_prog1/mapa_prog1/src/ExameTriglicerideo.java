import javax.swing.*;
public class ExameTriglicerideo extends Exame {

    public void mostrarResultado(){
        JFrame f;
        f = new JFrame();
        String resultadoTriglicerideo = null;

        int triglicerideo = Integer.parseInt(JOptionPane.showInputDialog(f, "Qual o valor de triglicerídeo?"));

        if ((getIdade() <= 9) && (triglicerideo < 75)){
            resultadoTriglicerideo = "BOM";
        } else if ((getIdade() >= 10) && (getIdade() <= 19) && (triglicerideo < 90)){
            resultadoTriglicerideo = "BOM";
        } else if ((getIdade() >= 20) && (triglicerideo < 150)){
            resultadoTriglicerideo = "BOM";
        } else {
            resultadoTriglicerideo = "RUIM";
        }

        JOptionPane.showMessageDialog(f, "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTriglicerídeos: " + triglicerideo + " mg/dL" + "\nResultado: " + resultadoTriglicerideo);
    }

}
