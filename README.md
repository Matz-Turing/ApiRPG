# ApiRPG

<img src="https://user-images.githubusercontent.com/74038190/212284115-f47cd8ff-2ffb-4b04-b5bf-4d1c14c0247f.gif" width="1000">

## Visão Geral

O **ApiRPG** é um aplicativo multiplataforma desenvolvido com .NET MAUI, destinado ao gerenciamento completo de elementos de um universo de RPG, como personagens, armas, habilidades, disputas e usuários. Ele adota o padrão MVVM e se comunica com APIs REST para persistência e sincronização de dados.

## Estrutura e Organização

O projeto está dividido em pastas por domínio: `Models`, `Views`, `ViewModels` e `Services`. Cada funcionalidade possui seu próprio conjunto de telas, lógica de interface (ViewModel) e integração com a API via services especializados.

## Funcionalidades Principais

* **Personagens**: cadastro, edição, exclusão, associação com armas e habilidades.
* **Armas e Habilidades**: gerenciadas separadamente e vinculadas aos personagens.
* **Disputas**: batalhas entre personagens com arma, habilidade ou modo geral.
* **Usuários**: autenticação, foto de perfil e localização no mapa.

## Destaques Técnicos

* Arquitetura MVVM bem aplicada.
* Comandos assíncronos para garantir fluidez na interface.
* Navegação moderna com Shell e rotas registradas.
* Armazenamento local de dados como token de autenticação.
* Conversores para exibição dinâmica (ex: cor dos pontos de vida).

## Fluxo de Uso

1. Usuário faz login ou cadastro.
2. Cria ou edita personagens.
3. Associa armas e habilidades.
4. Inicia uma disputa com outro personagem.
5. Visualiza o resultado e estatísticas.
6. Atualiza foto de perfil e localização.

## Créditos

Desenvolvido por Mateus S.  
GitHub: [Matz-Turing](https://github.com/Matz-Turing)
