class Heroi {

    public String nome;
    public int idade;
    public String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque;
        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "ataque desconhecido";
        }
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        Heroi[] herois = {
            new Heroi("Gandalf", 300, "Mago"),
            new Heroi("Aragorn", 87, "Guerreiro"),
            new Heroi("Kung Fu Panda", 20, "Monge"),
            new Heroi("Naruto", 16, "Ninja")
        };

        for (Heroi heroi : herois) {
            heroi.atacar();
        }
    }
}