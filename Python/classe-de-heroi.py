class Heroi:
    
    def __init__(self, nome, idade, tipo):
        self.nome = nome
        self.idade = idade
        self.tipo = tipo

    def atacar(self):
        if self.tipo.lower() == 'mago':
            ataque = 'magia'
        elif self.tipo.lower() == 'guerreiro':
            ataque = 'espada'
        elif self.tipo.lower() == 'monge':
            ataque = 'artes marciais'
        elif self.tipo.lower() == 'ninja':
            ataque = 'shuriken'
        else:
            ataque = 'ataque desconhecido'

        print(f'O {self.tipo} atacou usando {ataque}')

herois = [
    Heroi('Gandalf', 300, 'Mago'),
    Heroi('Aragorn', 87, 'Guerreiro'),
    Heroi('Kung Fu Panda', 20, 'Monge'),
    Heroi('Naruto', 16, 'Ninja')
]

for heroi in herois:
    heroi.atacar()