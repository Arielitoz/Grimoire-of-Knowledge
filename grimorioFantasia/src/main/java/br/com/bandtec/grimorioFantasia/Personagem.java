package br.com.bandtec.grimorioFantasia;

//Made by Arielito
public abstract class Personagem {
    //Atributos
    private Integer idPersonagem, vidaPersonagem, poderPersonagem, atributo;
    private String  nomePersonagem, classeP, racaP;
    private  Double levelPersonagem;

    //Construtor
    public Personagem(Integer idPersonagem,String nomePersonagem, String classeP, String racaP, Integer vidaPersonagem, Integer poderPersonagem, Double levelPersonagem, Integer atributo) {
        this.idPersonagem = idPersonagem;
        this.vidaPersonagem = vidaPersonagem;
        this.poderPersonagem = poderPersonagem;
        this.levelPersonagem = levelPersonagem;
        this.nomePersonagem = nomePersonagem;
        this.classeP = classeP;
        this.racaP = racaP;
        this.atributo = atributo;
    }

    //Methods
        public abstract Integer getcalculaPoder();

        public abstract  Double getcalculaNivel();

     //Getter & Setter


    public Integer getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(Integer idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public Integer getVidaPersonagem() {
        return vidaPersonagem;
    }

    public void setVidaPersonagem(Integer vidaPersonagem) {
        this.vidaPersonagem = vidaPersonagem;
    }

    public Integer getPoderPersonagem() {
        return poderPersonagem;
    }

    public void setPoderPersonagem(Integer poderPersonagem) {
        this.poderPersonagem = poderPersonagem;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getClasseP() {
        return classeP;
    }

    public void setClasseP(String classeP) {
        this.classeP = classeP;
    }

    public String getRacaP() {
        return racaP;
    }

    public void setRacaP(String racaP) {
        this.racaP = racaP;
    }

    public Integer getAtributo() {
        return atributo;
    }

    public void setAtributo(Integer atributo) {
        this.atributo = atributo;
    }

    public Double getLevelPersonagem() {
        return levelPersonagem;
    }

    public void setLevelPersonagem(Double levelPersonagem) {
        this.levelPersonagem = levelPersonagem;
    }

    //toString

    @Override
    public String toString() {
        return "Personagem " +
                "Registro de Personagem: " + idPersonagem +
                "Vida: " + vidaPersonagem +
                "Poder :" + poderPersonagem +
                "Nome: " + nomePersonagem + '\'' +
                "Classe: " + classeP + '\'' +
                "Raça: " + racaP + '\'' +
                "Atributo Principal: " + atributo + '\'' +
                "Level" + levelPersonagem;
    }
}
