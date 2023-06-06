//CLASSE MÃE
package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
        private String diretor;

        public String getDiretor() {
                return diretor;
        }

        public void setDiretor(String diretor) {
                this.diretor = diretor;
        }

        @Override
        public int getClassificação() {
               return (int) pegaMedia() / 2;
        }
}
