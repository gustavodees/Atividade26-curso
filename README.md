# Calculadora de Fatorial

## Visão Geral

Este programa Java solicita ao usuário que digite um número inteiro não negativo. Em seguida, ele calcula e exibe o fatorial desse número.

## Como Usar

Para executar este programa, você precisará ter o Java Development Kit (JDK) instalado em seu computador.

**Passos para executar o programa:**

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. A estrutura de pastas deve ser:
    ```
    seu_projeto/
    └── principal/
        └── Main.java
    ```

2.  **Compile o código:** Abra o terminal ou prompt de comando, navegue até a pasta raiz do seu projeto e execute o seguinte comando para compilar o código Java:
    ```bash
    javac principal/Main.java
    ```
    Isso irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o comando:
    ```bash
    java principal.Main
    ```
    O programa abrirá uma caixa de diálogo para solicitar que você digite o número para calcular o fatorial.

## Explicação do Código

O código Java realiza as seguintes operações:

* **Importa `javax.swing.*`:** Importa as classes necessárias para criar janelas de diálogo gráficas.
* **Declaração da classe `Main`:** Define a classe principal do programa.
* **Método `main`:** O ponto de entrada da execução do programa.
* **Solicita o valor para calcular o fatorial:**
    * `int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para calcular o seu fatorial"))`: Abre uma caixa de diálogo onde o usuário pode inserir um número inteiro. A entrada (uma `String`) é convertida para um inteiro usando `Integer.parseInt()` e armazenada na variável `n`. **Esta é uma operação de conversão de tipo (parsing).**
* **Inicializa a variável `fatorial`:** Uma variável inteira chamada `fatorial` é criada e inicializada com o valor 1. O fatorial de 0 é 1, e este valor inicial também servirá como base para a multiplicação no loop.
* **Loop `for`:** Um loop `for` é executado, começando de 1 e indo até o valor de `n` (inclusive).
    * **Calcula o fatorial:**
        * `fatorial *= i;`: Em cada iteração do loop, o valor atual de `fatorial` é multiplicado pelo valor de `i`. Isso calcula o fatorial de forma iterativa.
* **Exibe o resultado:**
    * `JOptionPane.showMessageDialog(null, "Fatorial de " + fatorial)`: Após o loop terminar, uma caixa de diálogo é exibida mostrando a mensagem "Fatorial de " seguida pelo valor calculado do fatorial.

## Conversão de Tipos (Parsing)

O programa utiliza a conversão de tipo (parsing) através do método `Integer.parseInt()` para converter a entrada do usuário (que é inicialmente uma `String`) para um número inteiro (`int`). Isso é necessário para que o programa possa realizar a operação de cálculo do fatorial.

## Requisitos

* Java Development Kit (JDK) instalado no sistema.

## Como Executar

1.  Certifique-se de ter o JDK instalado.
2.  Salve o código em `seu_projeto/principal/Main.java`.
3.  Abra o terminal e navegue até a pasta `seu_projeto`.
4.  Compile o código com: `javac principal/Main.java`
5.  Execute o programa com: `java principal.Main`

## Exemplo de Uso

1.  Ao executar o programa, a primeira caixa de diálogo perguntará "Digite o valor para calcular o seu fatorial". Se você digitar `5` e clicar em "OK".
2.  Uma caixa de diálogo será exibida com a mensagem "Fatorial de 120", pois o fatorial de 5 é 5 * 4 * 3 * 2 * 1 = 120.

## Autor

gustavodees

gustavoemartins@gmail.com
