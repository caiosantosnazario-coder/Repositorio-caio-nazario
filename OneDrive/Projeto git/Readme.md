## O que há de novo

* Adicionada a pasta ebook contendo os códigos feitos nas aulas de julho e agosto

## Sobre as atividades práticas

Os exercícios tiveram como objetivo praticar a criação de classes em Java, entendendo melhor como funcionam os atributos, os construtores públicos e privados e a forma adequada de declarar cada um deles.

## Cronograma de execução

**29/07 a 31/07 - aula1**
* `Carro.java` e `TesteCarro.java`

**05/08 - poo**
* `Carro.java` e `TestarCarro.java`

**12/08 - poo**
* `Produto.java` e `ProdutoTestar.java`

**19/08 - exemplo3**
* `Carro.java` e `TestarCarro.java`, `Aluno.java` e `AlunoTestar.java`

## Como organizei e publiquei este trabalho

* Fiz o download do material do ebook que estava salvo no Google Drive.
* Organizei cada exercício conforme as datas indicadas no roteiro da tarefa.
* Copiei a pasta com as atividades para dentro da pasta do meu repositório local.
* Em seguida executei a sequência de comandos abaixo para versionar e publicar:

* `git checkout -b programacao_algoritmo` --> cria e troca para uma nova branch de desenvolvimento
* `git add programacao_algoritmo1` --> prepara a pasta para ser salva no commit
* `git commit -m "ebook dos projetos de julho e agosto"` --> salva as alterações com uma descrição
* `git push -u origin programacao_algoritmo` --> publica a nova branch no GitHub
* `git checkout main` --> retorna para a branch principal `main`
* `git merge programacao_algoritmo` --> junta as alterações da branch secundária na principal
* `git push origin main` --> atualiza o repositório remoto com a versão final