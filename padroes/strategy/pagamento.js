class PagamentoStrategy {
    pagar(valor) {
        throw new Error('Método pagar deve ser implementado.');
    }
}

class CartaoCreditoStrategy extends PagamentoStrategy {
    constructor(numCartao, dataValidade, cvv) {
        super();
        this.numCartao = numCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }
    pagar(valor) {
        console.log(`Pagamento de R$${valor.toFixed(2)} efetuado com cartão de crédito ${this.numCartao}`)
    }
}

class BoletoBancarioStrategy extends PagamentoStrategy {
    constructor(codigoDeBarras) {
        super();
        this.codigoDeBarras = codigoDeBarras;
    }
    pagar(valor) {
        console.log(`Pagamento de R$${valor.toFixed(2)} efetuado com boleto bancário ${this.codigoDeBarras}`)
    }
}

class PagamentoContext {
    constructor(strategy) {
        this.strategy = strategy;
    }
    setStrategy(strategy) {
        this.strategy = strategy;
    }
    pagar(valor) {
        this.strategy.pagar(valor);
    }
}