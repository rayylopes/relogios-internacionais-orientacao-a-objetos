 🌍🕒 Relógios Internacionais em Java

🎯 **Tema:** Herança e Polimorfismo  
🚀 **Plataforma:** [DIO - Digital Innovation One](https://www.dio.me/)  
📚 **Módulo:** Programação Orientada a Objetos  
🎓 **Curso:** Herança e Polimorfismo em Java — *Exercício 3*  
🔗 **Referência:** [Exercício no GitHub da DIO](https://github.com/digitalinnovationone/exercicios-java-basico/blob/main/exercicios/4%20-%20Heran%C3%A7a%20e%20Polimorfismo%20em%20Java%20.md)

---

## 👨‍🏫 Projeto desenvolvido com apoio de:  
**José Luiz Abreu Cardoso Junior**

---

## 📘 Descrição

Este projeto implementa uma hierarquia de classes para representar relógios de diferentes regiões do mundo, aplicando os conceitos de **herança** e **polimorfismo** da programação orientada a objetos em Java.

## 🧱 Estrutura de Classes

### 🔹 Classe Abstrata: `Relogio`

- **Atributos:**
  - `hour`, `minute`, `second`
- **Métodos:**
  - Getters e setters com validações
  - `getTime()`: Retorna a hora como `HH:MM:SS`
  - `Clock convert(clock clock)`: Método abstrato para ser implementado nas subclasses

### 🔸 Subclasses:

#### 🇧🇷 `BRLClock`

- Formato de 24h (00–23)
- Implementa a lógica de atualização com base em outro relógio

#### 🇺🇸 `USClock`

- Formato de 12h com AM/PM
- Converte e atualiza o horário com base em qualquer outro relógio

## 🛠️ Tecnologias Utilizadas

- ☕ **Java 17+**
- 🔁 Programação Orientada a Objetos (POO)

## 📁 Estrutura de Diretórios

```plaintext
src/
├── Clock.java
├── BRLClock.java
├── USClock.java
└── Main.java
