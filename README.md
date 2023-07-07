# Desafio de Programação Orientada a Objetos - iPhone

Este desafio consiste na modelagem e implementação em Java de um componente do sistema que representa um iPhone. O objetivo é praticar os conceitos de Programação Orientada a Objetos (POO) e aplicar esses conceitos na representação do iPhone como um reprodutor musical, aparelho telefônico e navegador na internet. Embora seja um desafio simples, permitiu a aplicação dos pilares da orientação a objetos e o desenvolvimento das funcionalidades esperadas para o iPhone.

## Diagrama UML

A modelagem do sistema foi representada em um diagrama UML, que descreve as classes e interfaces envolvidas e suas relações. O diagrama pode ser visualizado no seguinte arquivo: `diagrama.uml` (coloque aqui o caminho do arquivo ou o link para o diagrama).

## Funcionalidades Esperadas

O iPhone deve ser capaz de desempenhar as seguintes funcionalidades:

1. Reprodutor Musical:
    - Tocar música;
    - Pausar música;
    - Parar música;
    - Selecionar música.
2. Aparelho Telefônico:
    - Realizar ligação;
    - Enviar SMS.
    - Adicionar um numero as seus favoritos
3. Navegador na Internet:
    - Exibir página;
    - Adicionar nova aba;
    - Atualizar página.

## Implementação em Java

A implementação do componente iPhone foi realizada na linguagem de programação Java, com base nas classes e interfaces fornecidas. O código-fonte está disponível nos seguintes arquivos:

- `Iphone.java`: Contém a classe `Iphone`, que representa um modelo específico de iPhone e implementa as interfaces `NavegadorInterface` e `ReprodutoInterface`.
- `Celular.java`: Contém a classe abstrata `Celular`, que representa um celular genérico e define os métodos comuns para ligar e enviar SMS.
- `NavegadorInterface.java`: Define a interface `NavegadorInterface`, com os métodos relacionados ao navegador na internet.
- `ReprodutoInterface.java`: Define a interface `ReprodutoInterface`, com os métodos relacionados ao reprodutor musical.

Para executar e testar o componente iPhone, você pode utilizar a classe `Main` como ponto de entrada do programa. Nessa classe, foram criados exemplos de uso dos métodos do iPhone.

## Requisitos do Sistema

Para executar o componente iPhone, certifique-se de que você tenha o seguinte ambiente configurado:

- Java Development Kit (JDK) 8 ou superior instalado.
- Ambiente de desenvolvimento integrado (IDE) de sua preferência para compilar e executar o código.

## Executando o Projeto

Siga as etapas abaixo para executar o projeto:

1. Clone ou faça o download deste repositório para sua máquina local.
2. Abra o projeto em seu ambiente de desenvolvimento.
3. Compile e execute a classe `Main` para ver os exemplos de uso do componente iPhone.