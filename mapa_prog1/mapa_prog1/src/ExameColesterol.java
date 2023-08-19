import javax.swing.*;
public class ExameColesterol extends Exame {

    public void mostrarResultado() {
        JFrame f;
        f = new JFrame();
        String resultadoHdl = null;
        String resultadoLdl = null;

        int hdl = Integer.parseInt(JOptionPane.showInputDialog(f, "Qual o valor do HDL?"));

        if ((getIdade() <= 19) && (hdl > 45)){
            resultadoHdl = "HDL BOM";
        } else if ((getIdade() >= 20) && (hdl > 40)){
            resultadoHdl = "HDL BOM";
        } else {
            resultadoHdl = "HDL RUIM";
        }

        int ldl = Integer.parseInt(JOptionPane.showInputDialog(f, "Qual o valor do LDL?"));
        int risco = Integer.parseInt(JOptionPane.showInputDialog(f, "Qual o risco do paciente? \nBaixo = 1 \nMédio = 2 \nAlto = 3"));

        if ((risco == 1) && (ldl < 100)){
            resultadoLdl = "LDL BOM";
        } else if ((risco == 2) && (ldl < 70)){
            resultadoLdl = "LDL BOM";
        } else if ((risco == 3) && (ldl < 50)){
            resultadoLdl = "LDL BOM";
        } else {
            resultadoLdl = "LDL RUIM";
        }

        JOptionPane.showMessageDialog(f, "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nHDL: " + hdl + " mg/dL" + "\nResultado: " + resultadoHdl + "\nLDL: " + ldl + " mg/dL" + "\nResultado: " +  resultadoLdl);
    }
}
