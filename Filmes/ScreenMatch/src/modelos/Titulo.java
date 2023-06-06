// CLASSE MÃE
package modelos;

public class Titulo {
    public String nome;
    public int anoDeLançamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliaçoes; //Método acessor
    private int totalDeAvaliações;  //Método acessor
    public int duraçãoEmMinutos;

    // Getters
    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }
    public int getTotalDeAvaliações() {
        return totalDeAvaliações;
    }

    public int getDuraçãoEmMinutos() {
        return duraçãoEmMinutos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public void setDuraçãoEmMinutos(int duraçãoEmMinutos) {
        this.duraçãoEmMinutos = duraçãoEmMinutos;
    }


    // Métodos
    public void exibeFichaTecnica() {
        System.out.println("O nome do filme é : " + nome);
        System.out.println("O ano de lançamento do filme é: " + anoDeLançamento);
        System.out.println("A duração em minutos deste filme é de: " + duraçãoEmMinutos);
    }
    public void avalia(double nota) {
        somaDasAvaliaçoes += nota;
        somaDasAvaliaçoes++;
    }
    double pegaMedia(){
        return somaDasAvaliaçoes / totalDeAvaliações;
    }
}
