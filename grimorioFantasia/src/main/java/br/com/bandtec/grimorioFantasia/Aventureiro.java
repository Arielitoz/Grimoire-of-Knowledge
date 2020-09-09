package br.com.bandtec.grimorioFantasia;
//Made by Arielito
public class Aventureiro extends Personagem {

    //Atributos
    private String itemMagico, invocacao, local;

    //construtor


    public Aventureiro(Integer idPersonagem, String nomePersonagem, String classeP, String racaP, Integer vidaPersonagem, Integer poderPersonagem, Double levelPersonagem, Integer atributo, String itemMagico, String invocacao, String local) {
        super(idPersonagem, nomePersonagem, classeP, racaP, vidaPersonagem, poderPersonagem, levelPersonagem, atributo);
        this.itemMagico = itemMagico;
        this.invocacao = invocacao;
        this.local = local;
    }

    //Methods

    @Override
    public Integer getcalculaPoder() {
        return (super.getPoderPersonagem() * super.getAtributo() + 25)/2;
    }

    @Override
    public Double getcalculaNivel() {
        return super.getLevelPersonagem() * 1.25;
    }

    //Getter e Setter

    public String getItemMagico() {
        return itemMagico;
    }

    public void setItemMagico(String itemMagico) {
        this.itemMagico = itemMagico;
    }

    public String getInvocacao() {
        return invocacao;
    }

    public void setInvocacao(String invocacao) {
        this.invocacao = invocacao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Item Mágico: " + itemMagico + '\'' +
                "Invocação: " + invocacao + '\'' +
                "Local: " + local + '\'' ;
    }
}
