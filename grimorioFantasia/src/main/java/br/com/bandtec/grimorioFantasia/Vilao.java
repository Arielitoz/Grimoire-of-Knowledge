package br.com.bandtec.grimorioFantasia;
//Made by Arielito

public class Vilao extends Personagem {
    //Atributos

    private String subordinado, transformacao, covil;
    private Integer nivelDificuldade;

    //construtor

    public Vilao(Integer idPersonagem, String nomePersonagem, String classeP, String racaP, Integer vidaPersonagem, Integer poderPersonagem, Double levelPersonagem, Integer atributo, String subordinado, String transformacao, String covil, Integer nivelDificuldade) {
        super(idPersonagem, nomePersonagem, classeP, racaP, vidaPersonagem, poderPersonagem, levelPersonagem, atributo);
        this.subordinado = subordinado;
        this.transformacao = transformacao;
        this.covil = covil;
        this.nivelDificuldade = nivelDificuldade;
    }

    //Methods


    @Override
    public Integer getcalculaPoder() {
        return (super.getPoderPersonagem() * super.getAtributo()) * 2;
    }

    @Override
    public Double getcalculaNivel() {
        return getLevelPersonagem() * 1.75;
    }

    //Getter e Setter

    public String getSubordinado() {
        return subordinado;
    }

    public void setSubordinado(String subordinado) {
        this.subordinado = subordinado;
    }

    public String getTransformacao() {
        return transformacao;
    }

    public void setTransformacao(String transformacao) {
        this.transformacao = transformacao;
    }

    public String getCovil() {
        return covil;
    }

    public void setCovil(String covil) {
        this.covil = covil;
    }

    public Integer getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(Integer nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Subordinado: " + subordinado + '\'' +
                "Transformacao: " + transformacao + '\'' +
                "Covil: " + covil + '\'' +
                "Nivel de Dificuldade: " + nivelDificuldade;
    }
}
