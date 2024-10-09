class Heroi {
    constructor(nome, idade, tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    atacar() {
        let ataque;
        switch (this.tipo.toLowerCase()) {
            case 'mago':
                ataque = 'magia';
                break;
            case 'guerreiro':
                ataque = 'espada';
                break;
            case 'monge':
                ataque = 'artes marciais';
                break;
            case 'ninja':
                ataque = 'shuriken';
                break;
            default:
                ataque = 'ataque desconhecido';
        }
        console.log(`O ${this.tipo} atacou usando ${ataque}`);
    }
}

let herois = [
    new Heroi('Gandalf', 300, 'Mago'),
    new Heroi('Aragorn', 87, 'Guerreiro'),
    new Heroi('Kung Fu Panda', 20, 'Monge'),
    new Heroi('Naruto', 16, 'Ninja')
];


for (let i = 0; i < herois.length; i++) {
    herois[i].atacar();
}