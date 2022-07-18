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

    * Continuar da daqui (parte 4)
*/













