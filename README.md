# Projeto AppMyNotes

Desenvolva um App para gerenciar pequenas anotações (lembretes). O aplicativo deve permitir o registro de anotações com as seguintes informações: titulo, texto e prioridade (alta, normal e baixa). A persistência deve ser feita via serialização. O App ao ser iniciado, deve apresentar todas as anotações já registradas, em um listview personalizado, apresentando a prioridade (cor) e o título da anotação. Ao fechar ou minimizar, todas as anotações deverão ser gravadas em arquivos, utilizando serialização de objetos. Para facilitar o processo de serialização, você deve criar uma classe gerenciadora (de nome Agenda) que permite, cadastrar e apagar os objetos que representam cada anotação. A interface principal deverá ter ainda um menu com opções de cadastrar uma nova anotação, ordenar por prioridade, por ordem alfabética e fechar o aplicativo.

### Modelo para interface:
![image](https://user-images.githubusercontent.com/49655656/132913920-ee4e9f3e-d8a8-420a-818c-a76cb7e04507.png)

* As anotações são coloridas de acordo com a prioridade: amarela: baixa; azul: normal e vermelha: alta
* um toque longo no ítem da lista deve apagá-la
* um toque curto, deve mostrar em outra activity a anotação de forma detalhada
