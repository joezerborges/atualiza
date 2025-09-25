# 🚘 Atualiza: O Seu Assistente de Manutenção Automotiva

O Atualiza é um aplicativo inteligente para Android que ajuda motoristas a gerenciar a manutenção preventiva de seus veículos. [cite_start]Ele foi desenvolvido para resolver o problema de esquecimento de serviços importantes, o que leva a custos elevados com consertos e maior risco de falhas mecânicas[cite: 5, 6, 290].

[cite_start]Com o Atualiza, você pode acompanhar a vida útil de peças, receber alertas personalizados e manter um histórico completo de manutenções, promovendo organização, economia e segurança[cite: 8, 9, 297].

**Benefícios Diretos**
* [cite_start]Redução de até 28% nos custos com manutenção corretiva[cite: 15].
* [cite_start]Aumento de até 20% na vida útil das peças[cite: 16].
* [cite_start]Maior segurança ao volante e previsibilidade de gastos[cite: 17, 18].

* ## ⚙️ Funcionalidades

O aplicativo oferece as seguintes funcionalidades principais:

* [cite_start]**Cadastro de Usuário e Veículo**: Permite registrar novos usuários e adicionar veículos com informações detalhadas como marca, modelo, ano e quilometragem atual[cite: 153, 155].
* [cite_start]**Monitoramento Automático**: Calcula o desgaste de peças com base na quilometragem e no tempo[cite: 158].
* [cite_start]**Alertas Inteligentes**: Envia notificações automáticas sobre manutenções pendentes[cite: 160].
* [cite_start]**Histórico de Manutenções**: Permite registrar e visualizar serviços realizados, com dados de custo, data e tipo de serviço[cite: 161, 296].
* [cite_start]**Integração com OBD-II (simulada)**: A aplicação é projetada para coletar dados automaticamente de uma interface de diagnóstico veicular, simplificando a coleta de quilometragem [cite: 15, 26, 153-156, 160, 161].
* [cite_start]**Interface Intuitiva**: O design foi planejado para ser responsivo e acessível a diferentes perfis de usuários[cite: 171, 163].

* ## 🚀 Tecnologias e Ferramentas

O projeto foi desenvolvido utilizando as seguintes tecnologias e metodologias:

* [cite_start]**Linguagem**: Java[cite: 147].
* [cite_start]**Plataforma**: Android Studio[cite: 474].
* [cite_start]**Banco de Dados**: SQLite, um SGBD leve e embutido que funciona offline[cite: 148, 493, 499].
* [cite_start]**Controle de Versão**: Git e GitHub[cite: 149].
* [cite_start]**Metodologia Ágil**: SCRUM[cite: 28].
* [cite_start]**Modelagem**: UML (Diagramas de Classe, Casos de Uso) e PlantUML[cite: 29, 39, 429, 432].

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
