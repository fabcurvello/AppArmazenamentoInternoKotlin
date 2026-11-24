# App Armazenamento Interno (Kotlin)

> Repositório didático: exercício prático de Android nativo com **Kotlin**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Aplicativo que salva e recupera um texto em um arquivo no **armazenamento interno** do aparelho.

## Contexto acadêmico

Exercício aplicado em sala de aula, usado como prática guiada com os alunos.

## Versão em Java

Esta mesma aplicação também foi desenvolvida em **Java**: [AppArmazenamentoInternoJava](https://github.com/fabcurvello/AppArmazenamentoInternoJava). Comparar as duas versões lado a lado ajuda a entender as diferenças de sintaxe entre Java e Kotlin no Android.

## O que o app faz

- Campo de texto para o usuário digitar um texto.
- Botão **Salvar**: grava o texto no arquivo `user_text.txt` no armazenamento interno (`openFileOutput` com `MODE_PRIVATE`).
- Botão **Carregar**: lê o arquivo e exibe o conteúdo; se não houver nada salvo, mostra "Nenhum texto encontrado".

## Conceitos trabalhados em aula

- **Armazenamento interno** privado do app (`openFileOutput` / `openFileInput`)
- Persistência de dados entre execuções do app
- Tratamento de exceções e verificação de conteúdo vazio
- `lateinit`, *null safety* (`isNullOrEmpty`) e função de escopo `use` do Kotlin

## Tecnologias

- **Kotlin**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 27` / `compileSdk 34`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppArmazenamentoInternoKotlin.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 27 ou superior.

## Veja também

Outros repositórios de aula com o mesmo tema:

- [AppArmazenamentoInternoAnimaUNA](https://github.com/fabcurvello/AppArmazenamentoInternoAnimaUNA)
- [AppArmazenamentoInternoJavaAndroid](https://github.com/fabcurvello/AppArmazenamentoInternoJavaAndroid)
- [AppArmazenamentoInternoAnima](https://github.com/fabcurvello/AppArmazenamentoInternoAnima)
- [AppArmazenamentoInternoJava](https://github.com/fabcurvello/AppArmazenamentoInternoJava)

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
