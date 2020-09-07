package br.com.bandtec.grimorioFantasia;

public class Criatura extends cartasMagic{

    //Atributos
    private Integer ataque, defesa;

    //construtor

    public Criatura(Integer codCarta, String titulo, Integer custoMana, String cor, String descricao, String flavorText, String colecao, String autor, String tipo, Double precoCarta, Integer ataque, Integer defesa) {
        super(codCarta, titulo, custoMana, cor, descricao, flavorText, colecao, autor, tipo, precoCarta);
        this.ataque = ataque;
        this.defesa = defesa;
    }

    //Methods

    @Override
    public Double calcularPrecoMédio() {
        return super.getPrecoCarta() * 2.50;
    }

    //getter e setter

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "Criatura{" +
                "ataque=" + ataque +
                ", defesa=" + defesa +
                '}';
    }
}
