package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    // Atributos da Classe Curso.

    private int cargaHoraria;

    @Override
    public double calcularXp() {

        return XP_PADRAO * cargaHoraria;
    }

    // Construtor

    public Curso() {
    }


    // Métodos Geters e Seters

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    // Metodo para imprimir
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
