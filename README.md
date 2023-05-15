# bertoti

| Padrão | Anti-padrão | Descrição | Problema que resolve |
| --- | --- | --- | --- |
| Strategy | Herança | Encapsula uma família de algoritmos e os torna intercambiáveis usando polimorfismo | Duplicação de código |
| Observer | Singleton | Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente | Acoplamento rígido entre os objetos |
| Composite | Ponto de acesso direto aos membros | Compõe objetos em estruturas de árvore para representar hierarquias parte-todo. O padrão permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme | Complexidade excessiva em código e estrutura |
| Singleton | Acoplamento global | Garante a existência única de uma instância de uma classe e oferece um ponto centralizado de acesso a ela | Soluciona a necessidade de garantir a existência exclusiva de uma instância de uma classe e oferece um ponto centralizado de acesso a essa instância |
