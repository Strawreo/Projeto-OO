# Última Fronteira 🌍 - Simulador de Sobrevivência em Java

Projeto de jogo em texto feito inteiramente em **Java**, com foco em **programação orientada a objetos (POO)**. O jogador deve sobreviver em ambientes hostis enfrentando criaturas, gerenciando recursos e tomando decisões críticas.

Funcionalidades principais

* Criar e escolher personagens jogáveis com características próprias.
* Sistema de combate com criaturas polimórficas (Lobo, Urso, Escorpião, etc).
* Gerenciamento de **vida**, **fome**, **sede**, **energia** e **sanidade**.
* Sistema de **inventário com itens equipáveis, usáveis e de coleta**.
* **Crafting** de itens com base em receitas e profissões (ex: Ferreiro).
* Exploração em ambientes como Floresta, Deserto e Montanha.
* Eventos aleatórios: climáticos, criaturas, alucinações, abrigos e NPCs.
* Mensagens de alerta para status baixos e **fins de jogo personalizados**.
* Fim de jogo com arena e chefe final.

Tecnologias e conceitos aplicados:

* Linguagem: **Java**
* Paradigma: **Programação Orientada a Objetos (POO)**

* Herança, Abstração, Encapsulamento, Polimorfismo
* Estruturas: **ArrayList**, Enums, Encapsulamento de comportamento
* Design: **Diagrama de Classes UML (Draw\.io)**

Estrutura do projeto:

```
├── main                  # Main do jogo, inicializa o loop principal
├── personagens           # Personagens jogáveis e classe abstrata Personagem
├── inimigos              # Inimigos derivados da classe Criatura
├── ambientes             # Ambientes do jogo (Floresta, Deserto, Montanha)
├── eventos               # Eventos do jogo, incluindo alucinações, climas, criaturas
├── sistemas               # Sistema de inventário, crafting, itens e receitas
└── takeTheWheel          # Interface de inventário, escolha de personagem
```

Como jogar:

1. Compile o projeto com seu IDE Java preferido (ex: Eclipse, IntelliJ, VSCode).
2. Execute a classe `Main.java`.
3. Escolha um personagem.
4. Sobreviva! Gerencie seus status, explore ambientes, use itens, lute ou fuja.

Exemplos de eventos

* `EventoCriatura`: Enfrenta criaturas com IA simples e combate em turnos.
* `EventoAlucinacao`: Gerado se a sanidade estiver baixa.
* `EventoItemFloresta`: Encontra itens específicos do ambiente.
* `EventoClimatico`: Impactos como tempestades ou nevascas.
* `EventoAbrigo`: Recupera energia e sanidade.

 Possíveis melhorias futuras

* Interface gráfica (Swing ou JavaFX)
* Sistema de salvamento de progresso
* Sistema de habilidades/passivas
* Implementação de sistema de dia/noite e ciclos climáticos

Autor

* Desenvolvido por **Diego Augusto** como projeto de estudo em Java e POO.
* Linkedin: https://www.linkedin.com/in/diego-amaral-230b09201/

---

> "A Última Fronteira não é apenas um lugar, é o teste final de sobrevivência."

