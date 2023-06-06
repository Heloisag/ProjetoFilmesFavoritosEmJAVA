package calculos;

import modelos.Titulo;

public class Calculadora {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuraçãoEmMinutos();
    }

    /*    public void inclui(Filme filme) {
        this.tempoTotal += filme.getDuraçãoEmMinutos();
    }
    public void inclui(Serie serie) {
        this.tempoTotal += serie.getDuraçãoEmMinutos();
        }
*/
}
