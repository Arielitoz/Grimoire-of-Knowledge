package br.com.bandtec.grimorioFantasia;

public abstract class cartasMagic {
    //Atributos
    private Integer codCarta, custoMana;
    private String titulo, cor, descricao, flavorText, colecao, autor, tipo;
    private Double precoCarta;

    //Construtor

    public cartasMagic(Integer codCarta, String titulo, Integer custoMana, String cor, String descricao, String flavorText, String colecao, String autor, String tipo, Double precoCarta) {
        this.codCarta = codCarta;
        this.custoMana = custoMana;
        this.titulo = titulo;
        this.cor = cor;
        this.descricao = descricao;
        this.flavorText = flavorText;
        this.colecao = colecao;
        this.autor = autor;
        this.tipo = tipo;
        this.precoCarta = precoCarta;
    }

    //Methods
    public abstract Double calcularPrecoMédio();

    //Getter e Setter

    public Integer getCodCarta() {
        return codCarta;
    }

    public void setCodCarta(Integer codCarta) {
        this.codCarta = codCarta;
    }

    public Integer getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(Integer custoMana) {
        this.custoMana = custoMana;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecoCarta() {
        return precoCarta;
    }

    public void setPrecoCarta(Double precoCarta) {
        this.precoCarta = precoCarta;
    }

    //toString

    @Override
    public String toString() {
        return "cartasMagic{" +
                "codCarta=" + codCarta +
                ", custoMana=" + custoMana +
                ", titulo='" + titulo + '\'' +
                ", cor='" + cor + '\'' +
                ", descricao='" + descricao + '\'' +
                ", flavorText='" + flavorText + '\'' +
                ", colecao='" + colecao + '\'' +
                ", autor='" + autor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precoCarta=" + precoCarta +
                '}';
    }
}
