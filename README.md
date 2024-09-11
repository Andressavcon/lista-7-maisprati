# Lista de Exercícios #07 💡

Este repositório contém os exercícios de programação em Java, utilizando somente os conteúdos abordados no **Módulo 5: Introdução à Linguagem Java**, da Formação Dev Full Stack Junior da [+prati](https://www.maisprati.com.br/) e [codifica](https://www.codificaedu.com.br/).

**Aluna:** [Andressa V Conrado](https://www.github.com/Andressavcon)

## Execução

Para executar os exercícios, siga as etapas abaixo:

**Clonar o Repositório:**

```bash
git clone [URL_DO_REPOSITÓRIO]
cd [NOME_DA_PASTA_DO_REPOSITÓRIO]
```

**Compilar o Código: Compile os arquivos Java utilizando o comando javac:**

```bash
javac [NOME_DO_ARQUIVO].java
```

**Executar o Código: Execute o código compilado com o comando java:**

```bash
java [NOME_DA_CLASSE]
```

Certifique-se de substituir **[URL_DO_REPOSITÓRIO]**, **[NOME_DA_PASTA_DO_REPOSITÓRIO]**, **[NOME_DO_ARQUIVO]**, e **[NOME_DA_CLASSE]** pelos valores correspondentes ao seu projeto.

Verificar Resultados: Após a execução, verifique a saída no terminal para garantir que o programa esteja funcionando conforme o esperado. Realize testes adicionais conforme necessário para validar a funcionalidade dos exercícios

### Lista Simplesmente Encadeada

### 👉 [Exercício 1](./src/listaSimplesmenteEncadeada/taskManager/TaskManager.java)

Implemente um gerenciador de tarefas onde cada tarefa é um nó em uma lista
simplesmente encadeada. Permita que o usuário adicione, remova, e marque tarefas
como concluídas.

### 👉 [Exercício 2](./src/listaSimplesmenteEncadeada/browserHistory/BrowserHistory.java)

Crie uma aplicação que simule o histórico de navegação de um navegador utilizando
uma lista simplesmente encadeada. Implemente funcionalidades para adicionar novas
URLs e remover URLs antigas quando a lista atingir um certo tamanho.

### 👉 [Exercício 3](./src/listaSimplesmenteEncadeada/textEditorUndo/TextEditorUndo.java)

Implemente um sistema de controle de reversão (undo) para uma aplicação de
edição de texto. Use uma lista simplesmente encadeada para armazenar as ações
realizadas e permita que o usuário desfaça as últimas ações.

### Lista Duplamente Encadeada

### 👉 [Exercício 4](./src/listaDuplamenteEncadeada/textEditorUndoRedo/TextEditorUndoRedo.java)

Implemente um editor de texto simples onde as operações de desfazer (undo) e
refazer (redo) são gerenciadas por uma lista duplamente encadeada.

### 👉 [Exercício 5](./src/listaDuplamenteEncadeada/cardGame/PlayerHand.java)

Implemente um jogo simples de cartas onde a mão do jogador é representada por
uma lista duplamente encadeada. Permita que o jogador adicione, remova, e reorganize
as cartas na mão.

### Filas

### 👉 [Exercício 6](./src/filas//bankQueue/BankQueueSimulator.java)

Crie um simulador de fila de atendimento em um banco. Utilize uma fila para gerenciar
os clientes que aguardam atendimento e implemente a lógica para chamar o próximo
cliente.

### 👉 [Exercício 7](./src/filas/printQueue/PrintQueueManager.java)

Implemente um sistema de gerenciamento de impressões onde os trabalhos de
impressão são enfileirados e processados na ordem em que chegam. Use uma fila para
armazenar os trabalhos de impressão.

### 👉 [Exercício 8](./src/filas/processQueue/ProcessQueueManager.java)

Implemente uma fila que simula a fila de processos prontos para execução em um
sistema operacional. Permita que novos processos sejam adicionados e que o processo
mais antigo seja removido para execução.
