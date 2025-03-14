# 🌀 Sistema de Ninjas - POO em Java

Este projeto demonstra conceitos avançados de **Programação Orientada a Objetos (POO)** em Java, utilizando herança, sobrecarga de construtores, interfaces, enums e sobrescrita de métodos. Ele simula um sistema de personagens do universo de Naruto, onde diferentes clãs possuem habilidades únicas.

## 🚀 Tecnologias Utilizadas
- **Java** (linguagem principal)
- **POO** (Herança, Polimorfismo, Interfaces, Enum, Construtores)

## 📌 Funcionalidades Implementadas
✔️ **Herança**: A classe `NivelIntermediario.Ninja` é a classe base para diferentes tipos de ninjas, como `NivelIntermediario.Uzumaki`, `NivelIntermediario.Uchiha`, `NivelIntermediario.Hyuga` e `NivelIntermediario.Haruno`.

✔️ **Sobrescrita de Métodos (`@Override`)**: Classes como `NivelIntermediario.Uzumaki` e `NivelIntermediario.Uchiha` sobrescrevem o método `habilidadeEspecial()` para definir ataques personalizados.

✔️ **Sobrecarga de Construtores**: As classes possuem múltiplos construtores para permitir diferentes formas de inicialização dos objetos.

✔️ **Interface (`interface`)**: A interface `NivelIntermediario.HyugaUzumaki` define habilidades especiais para personagens que pertencem a ambos os clãs.

✔️ **Enum (`enum`)**: O `NivelIntermediario.RankNinja` define os níveis hierárquicos de um ninja (GENIN, CHUUNIN, JOUNNIN, KAGE).

✔️ **Polimorfismo**: Uso de arrays de ninjas para chamar métodos de forma genérica, sem saber exatamente a classe do ninja em tempo de execução.

## 📂 Estrutura do Projeto
```
📁 src/NivelIntermediario
 ├── NivelIntermediario.Main.java               # Classe principal que executa o código
 ├── NivelIntermediario.Ninja.java              # Classe base
 ├── NivelIntermediario.Uzumaki.java            # Herda de NivelIntermediario.Ninja e possui habilidades exclusivas
 ├── NivelIntermediario.Uchiha.java             # Herda de NivelIntermediario.Ninja e sobrescreve métodos
 ├── NivelIntermediario.Hyuga.java              # Herda de NivelIntermediario.Ninja e possui o Byakugan
 ├── NivelIntermediario.Haruno.java             # Herda de NivelIntermediario.Ninja e pode ativar cura
 ├── NivelIntermediario.Boruto.java             # Herda de NivelIntermediario.Uzumaki e implementa a interface NivelIntermediario.HyugaUzumaki
 ├── NivelIntermediario.RankNinja.java          # Enum com os rankings dos ninjas
 ├── NivelIntermediario.HyugaUzumaki.java       # Interface para habilidades exclusivas
```

## 🎯 Como Executar o Projeto
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/sistema-ninjas-java.git
   ```
2. Abra o projeto em uma IDE como **IntelliJ IDEA** ou **Eclipse**.
3. Compile e execute o arquivo `NivelIntermediario.Main.java`.
4. Observe a saída no console, onde os ninjas utilizam suas habilidades!



---
📢 *Se você gostou deste projeto, deixe uma ⭐ no repositório!* 😃

