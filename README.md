# bertoti

| Padrão | Anti-padrão | Descrição | Problema que resolve |
| --- | --- | --- | --- |
| Strategy | Herança | Encapsula uma família de algoritmos e os torna intercambiáveis usando polimorfismo | Duplicação de código |
| Observer | Singleton | Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente | Acoplamento rígido entre os objetos |
| Composite | God Object | Compõe objetos em estruturas de árvore para representar hierarquias parte-todo. O padrão permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme | Complexidade excessiva em código e estrutura |
| Singleton | Monostate | O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância | Garantir que uma classe tenha apenas uma única instância e fornecer um ponto de acesso global para aquela instância |
| Facade | Fat Facade | O Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes |  Acoplamento complexo com bibliotecas ou frameworks
