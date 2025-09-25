Desafio Java: Batalha em Honkai Star Rail
🎮 Sobre o Projeto
Este projeto simula uma batalha entre personagens jogáveis e inimigos do universo Honkai: Star Rail, utilizando conceitos de Orientação a Objetos e ArrayList em Java. Ideal para quem está começando e quer praticar herança, encapsulamento e lógica de combate.

📚 Requisitos do Desafio
🔹 Classe Personagem (superclasse)
nome (String)
vida (int)
Métodos:
receberDano(int dano)
estaVivo() → retorna true se vida > 0

🔹 Classe Jogador (subclasse de Personagem)
arma (String)
danoArma (int)
Método:
atacar(Inimigo inimigo) → reduz a vida do inimigo

🔹 Classe Inimigo (subclasse de Personagem)
tipo (String) → Ex: "Mara-Struck", "Fragmentum Beast", "Boss"
danoAtaque (int)
Método:
atacar(Jogador j) → reduz a vida do jogador

🔹 Classe Simulacao
ArrayListjogador jogadores
ArrayListinimigo inimigos
Métodos:
adicionarJogador(Jogador j)
adicionarInimigo(Inimigo i)
simularBatalha() → cada jogador ataca um inimigo aleatório e vice-versa

🧪 Exemplo de Uso
Simulacao jogo = new Simulacao();

jogo.adicionarJogador(new Jogador("Dan Heng", 100, "Lança Gélida", 25));
jogo.adicionarJogador(new Jogador("Kafka", 120, "Relâmpago Mental", 40));

jogo.adicionarInimigo(new Inimigo("Mara-Struck", 80, 10));
jogo.adicionarInimigo(new Inimigo("Boss", 150, 30));

jogo.simularBatalha();