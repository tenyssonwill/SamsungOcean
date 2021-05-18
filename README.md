# SamsungOcean

Introdução de Android com Kotlin usando o Github

## Arquivo Manifest.xml
- A diretiva xmlns significa xml _Namespace_

## Comparações Kotlin e Java
- Não necessita terminar a instrução com ;
- As instruções package e import são iguais
- override = @Override


## Aula do Paulo Salvatore
https://www.youtube.com/watch?v=Ghx79FLbsNA


## Atalhos
Shift Shift ou Ctrl+Shift+N para procurar arquivos no Android Studio
Shift + F10 para Rodar
Ctrl + F10 para Rodar
Shift + Enter nova linha
Ctrl + alt + V Cria uma variavel para sentença
Shift + F6 - mudar o nome da variavel
Ctrl + W - Seleciona uma expressao acima
Alt + Enter - Extract Resource

## Desafio 
- Construir uma tela com 3 EditText: Nome, Sobrenome e Idade
- Um TextView para o Resultado
- Um Botao Enviar
- Quando o usuário clicar no botão, validar se todos os dados foram digitados e construir uma string
 /*
        * Exercício de fixação:
        *
        * Detectar um evento no botão enviar
        * Pegar o texto presente no EditText do Nome
        * Alterar o texto do TextView com o esse texto do EditText
        */

        /*
         * Desafio:
         * Construir uma tela com três EditText: Nome, Sobrenome e Idade
         * Um TextView para o Resultado
         * Um Botão para Enviar
         *
         * Quando o usuário clicar no botão, validar se todos os dados foram digitados
         * e construir uma string no TextView do Resultado: "Olá, Paulo Salvatore, você tem 27 anos!"
         * Sendo que "Paulo" deve ser preenchido com o valor do EditText e assim por diante.
         *
         * Ao clicar no botão Enviar, você deve adicionar uma mensagem de erro em todos os EditTexts
         * que não passaram da validação.
         */