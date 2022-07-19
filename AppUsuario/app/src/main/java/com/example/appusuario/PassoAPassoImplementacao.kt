package com.example.appusuario

/* Passo a Passo das Implementações */

/*
* Implementar o viewBinding
* arquivo Gradle | enabled = true
*
 */

/*
* Chamando outras Activities
*/

/*
    *** Implementando o RecyclerView para exibir uma lista de dados ***

    * O RecyclerView foi projetado para ser eficiente, mesmo com listas grandes,
    * reutilizando ou reciclando as visualizações que rolaram para fora da tela.

    *** Criar um novo pacote ***

    * pacote model: É comum usar model como o nome do pacote para classes que modelam
    * (ou representam) dados.
    * Este novo pacote conterá todas as classes relacionadas a dados definidas no app.

    * pacote data: Você pode e precisa ocultar a preparação de dados em uma classe Datasource
    * separada que prepare os dados para o app, isso ficará dentro do pacote data.

    *** Criar a classe de dados Produto dentro de model ***

    # 1
    * Uma instância de objeto de Produto representa um produto
    * e contém o ID do recurso da string com o produto

    * Transforme a classe Produto em uma classe de dados adicionando
    * a palavra-chave data antes da definição dela.
    * Isso gera um erro, já que as classes de dados precisam ter pelo menos uma propriedade definida.

    * Ao criar uma instância de Produto, é necessário transmitir o ID do recurso para a string de produto.
    * O ID do recurso é um número inteiro.
    * Adicione um parâmetro val stringResourceId inteiro ao construtor da classe Produto. Isso eliminará o erro.

    *** Criar uma classe para ser uma fonte de dados dentro de data ***

    # 2
    * Como a preparação de dados é uma questão separada, coloque a classe Datasource em um pacote data separado.
    * Na classe Datasource, crie uma função com o nome loadProduto01().

    # 3
    * A função loadProduto01() precisa retornar uma lista de Produto01.
    * Para fazer isso, crie uma lista e preencha-a com uma instância Produto para cada string de recurso.

    # 4
    * Declare List<Produto01> como o tipo de retorno do método loadProduto01().
    * No corpo de loadProduto01(), adicione uma instrução return.
    * Após a palavra-chave return, chame o método listOf<>() para criar uma List.
    * Dentro dos sinais <>, especifique o tipo dos itens da lista como Produto01.
    * Dentro dos parênteses, crie uma Produto01, transmitindo R.string.titulo1 como o ID do recurso.

    *** Como adicionar um RecyclerView ao app ***

    * Nesta tarefa, você configurará um RecyclerView para exibir a lista de Produto01

    * item: um item de dados da lista a ser exibida. Representa um objeto Produto01 no app.
    * Adapter: aceita dados e os prepara para que a RecyclerView os exiba.
    * ViewHolders: um conjunto de visualizações para a RecyclerView usar e reutilizar para exibir afirmações.
    * RecyclerView: visualizações na tela.

    # 5
    ** Adicionar um RecyclerView ao layout **

    * Primeiro, você precisa adicionar o RecyclerView ao layout da ListProdCategActivity01.
    * (app > res > layout > activity_list_prod_categ01.xml)

    * Alternar para a visualização Design.
    * Em Palette, selecione Containers e localize a RecyclerView.
    * Arraste um RecyclerView para o layout.
    * Leia o pop-up Add Project Dependency se ele for exibido e clique em OK.
    * Se o pop-up não for exibido, nenhuma ação será necessária.
    * Se necessário, mude os atributos layout_width e layout_height do RecyclerView
    * para match_parent para que o RecyclerView possa preencher toda a tela.
    * Defina o ID do recurso do RecyclerView como recycler_view_produto01.

    * O RecyclerView é compatível com a exibição de itens de maneiras diferentes,
    * como uma lista linear ou uma grade. A organização dos itens é feita por um LayoutManager.
    * O framework do Android fornece gerenciadores de layout para layouts de itens básicos.
    * O app Affirmations exibe itens como uma lista vertical, portanto, você pode usar o LinearLayoutManager.

    * No código XML, no elemento RecyclerView, adicione o LinearLayoutManager como o atributo
    * do gerenciador de layout do RecyclerView.
    * Para percorrer uma lista vertical de itens maiores do que a tela,
    * é necessário adicionar uma barra de rolagem vertical.
    * Na RecyclerView, adicione um atributo android:scrollbars definido como vertical.

    * No momento, você adicionou a origem dos dados e o RecyclerView ao layout,
    * mas o RecyclerView não tem informações sobre como exibir os objetos Produto01.

    # 6
    ** Implementar um adaptador para o RecyclerView **

    * Seu app precisa de uma maneira para capturar os dados da Datasource e formatá-los para que cada
    * Produto01 seja exibida como um item no RecyclerView.

    * Um adaptador é um padrão de design que adapta os dados para algo que possa
    * ser usado pelo RecyclerView. Nesse caso, você precisa de um adaptador que receba uma instância
    * de Produto01 da lista retornada por loadProduto01() e a transforme em uma visualização
    * de item de lista para que ela seja exibida no RecyclerView.

    * Quando você executar o app, o RecyclerView usa o adaptador para descobrir como exibir
    * os dados na tela. O RecyclerView solicita que o adaptador crie uma nova visualização
    * de item de lista para o primeiro item de dados da lista. Quando tiver a visualização,
    * ela solicitará que o adaptador forneça os dados para exibir o item. Esse processo se
    * repete até que o RecyclerView não precise de mais visualizações para preencher a tela

    ** Criar o adaptador **
    * Nesta etapa, você criará um adaptador para uma instância de objeto Produto01 para que
    * possa ser exibida no RecyclerView.

    ** Criar um layout para itens **

    * Cada item no RecyclerView tem seu próprio layout, que você define em um arquivo de layout separado.

    * Em res > layout, crie um novo Arquivo vazio com o nome card_layout
    * Adicione uma TextView com o id card_title

    * Observe que você não precisa de um ViewGroup no layout, porque esse layout de item de lista
    * será inflado e adicionado mais tarde como um filho do RecyclerView pai.

    ** Criar uma classe ItemProduto01Adapter **

    * Crie um pacote adapter na pasta raiz
    * Crie uma classe ItemProduto01Adapter na pasta adapter

    * É necessário adicionar um parâmetro ao construtor do ItemProduto01Adapter para que você possa
    * transmitir a lista de protudo01 ao adaptador.
    * Adicione um parâmetro ao construtor do ItemProduto01Adapter que é uma val com o nome dataset
    * e o tipo List<Produto01>. Importe Produto01, se necessário.
    * Como o dataset só será usado nessa classe, torne-o private.

    * O ItemProduto01Adapter precisa de informações sobre como resolver os recursos de string.
    * Essa e outras informações sobre o app são armazenadas em uma instância de objeto Context
    * que pode ser transmitida para uma instância ItemProduto01Adapter.

    * Adicione um parâmetro ao construtor do ItemProduto01Adapter que é uma val com o
    * nome context e o tipo Context. Posicione-o como o primeiro parâmetro no construtor.

    ** Criar um ViewHolder **

    * O RecyclerView não interage diretamente com as visualizações de itens, mas lida com ViewHolders.
    * Um ViewHolder representa uma única visualização de item de lista em um RecyclerView
    * e pode ser reutilizado sempre que possível. Uma instância ViewHolder contém referências
    * às visualizações individuais em um layout de item de lista. Daí o nome "view holder",
    * que significa armazenador de visualizações. Isso facilita a atualização da visualização
    * de itens da lista com novos dados. Os armazenadores de visualização também adicionam informações
    * que o RecyclerView usa para mover as visualizações pela tela de maneira eficiente.

    * Na classe ItemProduto01Adapter, antes da chave de fechamento do ItemProduto01Adapter, crie uma classe ItemProduto01ViewHolder.
    * Definir uma classe em outra é conhecido como criação de uma classe aninhada.
    * Como o ItemProduto01ViewHolder é usado apenas pelo ItemProduto01Adapter,
    * a criação dele no ItemProduto01Adapter mostra essa relação. Isso não é obrigatório,
    * mas ajuda outros desenvolvedores a entenderem a estrutura do programa.

    * Adicione uma private val view do tipo View como um parâmetro ao construtor da classe ItemProduto01ViewHolder.

    * Torne ItemProduto01ViewHolder uma subclasse de RecyclerView.ViewHolder e transmita o
    * parâmetro view para o construtor da superclasse.

    * No ItemProduto01ViewHolder, defina uma propriedade val textView do tipo TextView.
    * Atribua a visualização com o ID card_layout_title definido em card_layout_produto01.xml.

    ** Substituir métodos do adaptador **

    * Adicione o código para estender o ItemProduto01Adapter da classe abstrata RecyclerView.Adapter.
    * Especifique ItemProduto01Adapter.ItemViewHolder como o tipo de armazenador
    * de visualização entre os sinais de "menor que" e "maior que".
    * Você verá um erro porque precisa implementar alguns métodos abstratos do RecyclerView.Adapter.

    * Coloque o cursor em ItemProduto01Adapter e pressione Control+I no Windows.
    * Veja a lista de métodos que você precisa implementar:
    * getItemCount(), onCreateViewHolder() e onBindViewHolder().
    * Selecione as três funções usando Shift+clique e clique em OK.

    * Isso criará stubs com os parâmetros corretos para os três métodos.
    * Você não verá mais erros. Em seguida, é necessário implementar esses métodos
    * para que eles executem as ações corretas no app.

    ** Implementar getItemCount() **

    * O método getItemCount() precisa retornar o tamanho do conjunto de dados. Os dados do app estão
    * na propriedade dataset que você está transmitindo ao construtor do ItemProduto01Adapter,
    * e você pode acessar o tamanho usando size.
    * dentro do getItemCount()   insira: return dataset.size

    # 7
    ** Implementar onCreateViewHolder() **

    * O método onCreateViewHolder() é chamado pelo gerenciador de layout para criar novos armazenadores
    * de visualização para o RecyclerView (quando não há armazenadores de visualização existentes que
    * possam ser reutilizados). Lembre-se de que um armazenador de visualização representa uma única
    * visualização de item da lista.

    * O método onCreateViewHolder() usa dois parâmetros e retorna um novo ViewHolder.
        * Um parâmetro parent, que é a visualização em grupo a que a nova visualização de
        * item da lista será anexada como filha. O RecyclerView é a visualização mãe.

        * Um parâmetro viewType que se torna importante quando há vários tipos de visualização
        * de itens no mesmo RecyclerView.
        * Se você tiver diferentes layouts de item de lista sendo exibidos no RecyclerView, há diferentes
        * tipos de visualização de itens. Só é possível reciclar visualizações com o mesmo tipo
        * de visualização de item. No seu caso, há somente um layout de item de lista
        * e um tipo de visualização de item,  portanto, você não precisa se preocupar com esse parâmetro.

    * No método onCreateViewHolder(), acesse uma instância do LayoutInflater
    * com o contexto fornecido (context do parent). O inflador de layout sabe como inflar
    * um layout XML em uma hierarquia de objetos de visualização.

    * Quando você tiver uma instância de objeto LayoutInflater, adicione um ponto seguido por outra
    * chamada de método para inflar a visualização real do item da lista. Transmita o ID do recurso
    * de layout XML R.layout.list_item e a visualização em grupo parent. O terceiro argumento booleano
    * será attachToRoot. Esse argumento precisa ser false, porque o RecyclerView adicionará esse item
    * à hierarquia de visualização no momento certo.

    * Agora, o adapterLayout contém uma referência para a visualização do item da lista
    * (em que poderemos encontrar visualizações filhas, como a TextView, depois).

    * No método onCreateViewHolder(), retorne uma nova instância do ItemProduto01ViewHolder em que a
    * visualização raiz seja o adapterLayout.

    # 8
    ** Implementar onBindViewHolder() **

    * O último método que você precisa substituir é onBindViewHolder(). Esse método é chamado pelo
    * gerenciador de layout para substituir o conteúdo de uma visualização de item de lista.

    * O método onBindViewHolder() tem dois parâmetros, um ItemProduto01ViewHolder criado anteriormente
    * pelo método onCreateViewHolder() e um int que representa a position do item atual na lista.
    * Neste método, você encontrará o objeto Affirmation correto do conjunto de dados com base na posição.

    * No método onBindViewHolder(), crie um val itemProduto01 e acesse o item na position especificada no dataset.

    * Por fim, é necessário atualizar todas as visualizações referenciadas pelo titular da visualização
    * para refletir os dados corretos desse item. Nesse caso, há apenas uma visualização:
    * a TextView no ItemViewHolder. Defina o texto da TextView para exibir a string Produto01 desse item.

    * Com uma instância de objeto Produto01, é possível encontrar o ID de recurso de string
    * correspondente chamando itemProduto01.stringResourceId. No entanto, ele é um número inteiro e você
    * precisa encontrar o mapeamento para o valor real da string.

    * No framework do Android, é possível chamar o método getString() com um ID de recurso de string
    * e ele retornará o valor da string associado a ele. getString() é um método da classe Resources,
    * e é possível acessar uma instância da classe Resources com o context.

    * Isso significa que é possível chamar context.resources.getString() e transmitir um ID de recurso
    * da string. A string resultante pode ser definida como o text da textView no holder do
    * ItemProduto01ViewHolder. Resumidamente, essa linha de código atualiza o armazenador de visualização para
    * mostrar a string de afirmação.

    * adaptador finalizado (ItemProduto01Adapter.kt)
    * Agora que você implementou o ItemProduto01Adapter, é necessário instruir o RecyclerView a usar esse adaptador.

    *** Modificar a ListProdCategActivity01 para usar um RecyclerView ***

    * Para terminar, é necessário usar suas classes Datasource e ItemProduto01Adapter para criar
    * e exibir itens no RecyclerView. Faça isso na ListProdCategActivity01.

    * Na ListProdCategActivity01,, acesse o método onCreate(). Insira o novo código descrito nas etapas
    * a seguir após a chamada para setContentView(R.layout.activity_list_prod_categ01).

    * Crie uma instância da Datasource e chame o método loadProduto01() nela.
    * Armazene a lista retornada de afirmações em uma val com o nome myDataset.

    * Crie uma variável com o nome recyclerView e use findViewById() para encontrar uma referência
    * ao RecyclerView no layout.

    * Para instruir o recyclerView a usar a classe ItemAdapter que você criou, crie uma
    * nova instância ItemProduto01Adapter. O ItemProduto01Adapter espera dois parâmetros: o contexto (this)
    * da atividade e as afirmações em myDataset.

    * Atribua o objeto ItemProduto01Adapter à propriedade adapter do recyclerView.

    * Como o tamanho do layout do RecyclerView é fixo no layout da atividade, é possível definir o
    * parâmetro setHasFixedSize do RecyclerView como true. Essa configuração só é necessária para
    * melhorar o desempenho. Use essa configuração se você souber que as mudanças no conteúdo não
    * mudarão o tamanho do layout do RecyclerView.
*/













