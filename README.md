# 🚘 Atualiza: O Seu Assistente de Manutenção Automotiva

O Atualiza é um aplicativo inteligente para Android que ajuda motoristas a gerenciar a manutenção preventiva de seus veículos. Ele foi desenvolvido para resolver o problema de esquecimento de serviços importantes, o que leva a custos elevados com consertos e maior risco de falhas mecânicas.

Com o Atualiza, você pode acompanhar a vida útil de peças, receber alertas personalizados e manter um histórico completo de manutenções, promovendo organização, economia e segurança.

**Benefícios Diretos**
Redução de até 28% nos custos com manutenção corretiva.
Aumento de até 20% na vida útil das peças.
]Maior segurança ao volante e previsibilidade de gastos.

* ## ⚙️ Funcionalidades

O aplicativo oferece as seguintes funcionalidades principais:

**Cadastro de Usuário e Veículo**: Permite registrar novos usuários e adicionar veículos com informações detalhadas como marca, modelo, ano e quilometragem atual.
**Monitoramento Automático**: Calcula o desgaste de peças com base na quilometragem e no tempo.
**Alertas Inteligentes**: Envia notificações automáticas sobre manutenções pendentes.
**Histórico de Manutenções**: Permite registrar e visualizar serviços realizados, com dados de custo, data e tipo de serviço.
**Integração com OBD-II (simulada)**: A aplicação é projetada para coletar dados automaticamente de uma interface de diagnóstico veicular, simplificando a coleta de quilometragem.
**Interface Intuitiva**: O design foi planejado para ser responsivo e acessível a diferentes perfis de usuários.

* ## 🚀 Tecnologias e Ferramentas

O projeto foi desenvolvido utilizando as seguintes tecnologias e metodologias:

**Linguagem**: Java.
**Plataforma**: Android Studio.
**Banco de Dados**: SQLite, um SGBD leve e embutido que funciona offline.
**Controle de Versão**: Git e GitHub.
**Metodologia Ágil**: SCRUM.
**Modelagem**: UML (Diagramas de Classe, Casos de Uso) e PlantUML.

* ## 📂 Estrutura do Projeto

A arquitetura do aplicativo segue o padrão DAO (Data Access Object) para separar a lógica de negócio do acesso a dados, o que torna o código modular e de fácil manutenção.

* `modelo/`
    * `Usuario.java`, `Veiculo.java`, `Peca.java`: Classes de modelo que representam as entidades do banco de dados.
    * `UsuarioDAO.java`, `VeiculoDAO.java`, `PecaDAO.java`: Classes responsáveis pela interação com o banco de dados.
    * `DatabaseHelper.java`: Gerencia a criação e atualização das tabelas no SQLite.
* `ui/`
    * `LoginActivity.java`, `MainActivity.java`, etc.: Classes que gerenciam a lógica das telas.
    * `res/layout/`: Arquivos XML que definem a interface do usuário.
* `service/`
    * `ObdService.java`: Serviço para simular a coleta de dados via OBD-II (simulação de Bluetooth).
 
    * ## ▶️ Como Testar a Aplicação

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/nome-do-seu-repositorio.git](https://github.com/seu-usuario/nome-do-seu-repositorio.git)
    ```
2.  **Abra no Android Studio:**
    * No Android Studio, selecione `File > Open...` e escolha a pasta do projeto.
3.  **Sincronize o Gradle:**
    * Aguarde o Gradle sincronizar as dependências.
4.  **Execute a Aplicação:**
    * Conecte um dispositivo Android ao seu computador ou use um emulador.
    * Clique no botão `Run` (o ícone de play verde) na barra de ferramentas.

O app iniciará na tela splash e, em seguida, redirecionará para a tela de login. Você pode criar um novo usuário e começar a usar as funcionalidades!
