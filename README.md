# Sistema de Cadastro de Gado

Projeto acadêmico desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)** da Universidade Tecnológica Federal do Paraná (UTFPR).

A aplicação oferece uma interface gráfica para cadastrar e gerenciar animais de diferentes raças, aplicando conceitos fundamentais de orientação a objetos em Java.

## Funcionalidades

- Cadastro de animais com código gerado automaticamente;
- Consulta de animais pelo código;
- Alteração e exclusão de registros;
- Listagem dos animais cadastrados;
- Registro de peso, idade, sexo, cor e data de compra;
- Registro do histórico de vacinação;
- Campos específicos para as raças Angus, Nelore e Tabapuã;
- Validação básica dos dados informados.

## Conceitos de POO aplicados

- Encapsulamento;
- Herança;
- Abstração;
- Polimorfismo;
- Especialização de classes;
- Padrão Singleton para manter uma única instância do cadastro em memória.

## Tecnologias

- Java 18;
- Java Swing;
- Apache Maven;
- Apache NetBeans.

## Estrutura principal

```text
src/main/java/
├── Gado.java
├── Angus.java
├── Nelore.java
├── Tabapua.java
├── HistoricoMedico.java
├── BDGado.java
├── JanelaPrincipal.java
├── JanelaCadastro.java
└── JanelaConsulta.java
```

`Gado` é a classe abstrata base. As classes `Angus`, `Nelore` e `Tabapua` representam especializações com atributos próprios. A classe `BDGado` mantém os registros durante a execução, enquanto as classes `Janela*` formam a interface gráfica.

## Como executar

### Pelo NetBeans

1. Tenha o JDK 18 ou superior instalado.
2. Abra o Apache NetBeans.
3. Selecione **File > Open Project** e escolha a pasta do projeto.
4. Execute a classe `JanelaPrincipal.java`.

> Os registros são armazenados somente em memória. Ao encerrar a aplicação, os dados cadastrados não são preservados.

## Versões

- `v1.0`: versão básica original;
- `v2.0`: versão final desenvolvida para a disciplina de POO.

## Autor

Vitor Kenji Soares Yasuda
