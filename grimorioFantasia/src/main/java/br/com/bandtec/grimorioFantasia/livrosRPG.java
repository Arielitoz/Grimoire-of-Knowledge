package br.com.bandtec.grimorioFantasia;

public class livrosRPG {
    //Atributos
    private String codLivro, titulo, sistema, cenario, autor;
    private Double precoLivro;

    //construtor

    public livrosRPG(String codLivro, String titulo, String sistema, String cenario, String autor, Double precoLivro) {
        this.codLivro = codLivro;
        this.titulo = titulo;
        this.sistema = sistema;
        this.cenario = cenario;
        this.autor = autor;
        this.precoLivro = precoLivro;
    }

    //methods

    public Double calcularPrecoLivro(){
        return precoLivro;
    }

    //Getter e Setter

    public String getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(Double precoLivro) {
        this.precoLivro = precoLivro;
    }


    //toString

    @Override
    public String toString() {
        return "Livros RPG: " +
                "Codigo Livro: " + codLivro + '\'' +
                "Titulo: " + titulo + '\'' +
                "Sistema: " + sistema + '\'' +
                "Cenario: " + cenario + '\'' +
                "Autor: " + autor + '\'' +
                "Preço Livro: " + precoLivro;
    }
}
