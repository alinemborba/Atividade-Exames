import javax.swing.*;
public class Exame {

    private String nome;
    private String tipoSanguineo;
    private int anoNascimento;
    private int idade;

    public String getNome(){

        return this.nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public String getTipoSanguineo() {

        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {

        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {

        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {

        this.anoNascimento = anoNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void cadastrarExame() {
        JFrame f;
        f = new JFrame();

        this.nome = String.valueOf(JOptionPane.showInputDialog(f, "Qual o nome?"));
        System.out.println(nome);
        this.tipoSanguineo = String.valueOf(JOptionPane.showInputDialog(f, "Qual o tipo sanguíneo?"));
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(f, "Qual o ano de nascimento?"));
        this.idade = 2023 - this.anoNascimento;

    }

}
