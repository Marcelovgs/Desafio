# 🌀 Sistema de Ninjas - POO em Java

Este projeto demonstra conceitos avançados de **Programação Orientada a Objetos (POO)** em Java, utilizando herança, sobrecarga de construtores, interfaces, enums e sobrescrita de métodos. Ele simula um sistema de personagens do universo de Naruto, onde diferentes clãs possuem habilidades únicas.

## 🚀 Tecnologias Utilizadas
- **Java** (linguagem principal)
- **POO** (Herança, Polimorfismo, Interfaces, Enum, Construtores)

## 📌 Funcionalidades Implementadas
✔️ **Herança**: A classe `Ninja` é a classe base para diferentes tipos de ninjas, como `Uzumaki`, `Uchiha`, `Hyuga` e `Haruno`.

✔️ **Sobrescrita de Métodos (`@Override`)**: Classes como `Uzumaki` e `Uchiha` sobrescrevem o método `habilidadeEspecial()` para definir ataques personalizados.

✔️ **Sobrecarga de Construtores**: As classes possuem múltiplos construtores para permitir diferentes formas de inicialização dos objetos.

✔️ **Interface (`interface`)**: A interface `HyugaUzumaki` define habilidades especiais para personagens que pertencem a ambos os clãs.

✔️ **Enum (`enum`)**: O `RankNinja` define os níveis hierárquicos de um ninja (GENIN, CHUUNIN, JOUNNIN, KAGE).

✔️ **Polimorfismo**: Uso de arrays de ninjas para chamar métodos de forma genérica, sem saber exatamente a classe do ninja em tempo de execução.

## 📂 Estrutura do Projeto
```
📁 src/NivelIntermediario/POO
 ├── Main.java               # Classe principal que executa o código
 ├── Ninja.java              # Classe base
 ├── Uzumaki.java            # Herda de Ninja e possui habilidades exclusivas
 ├── Uchiha.java             # Herda de Ninja e sobrescreve métodos
 ├── Hyuga.java              # Herda de Ninja e possui o Byakugan
 ├── Haruno.java             # Herda de Ninja e pode ativar cura
 ├── Boruto.java             # Herda de Uzumaki e implementa a interface HyugaUzumaki
 ├── RankNinja.java          # Enum com os rankings dos ninjas
 ├── HyugaUzumaki.java       # Interface para habilidades exclusivas
```

## 🎯 Como Executar o Projeto
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/sistema-ninjas-java.git
   ```
2. Abra o projeto em uma IDE como **IntelliJ IDEA** ou **Eclipse**.
3. Compile e execute o arquivo `Main.java`.
4. Observe a saída no console, onde os ninjas utilizam suas habilidades!



---
📢 *Se você gostou deste projeto, deixe uma ⭐ no repositório!* 😃

