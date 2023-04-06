// Sujeito
class CarrinhoCompras {
    constructor() {
        this.items = [];
        this.observers = [];
    }

    adicionarItem(item) {
        this.items.push(item);
        this.notifyObservers();
    }

    removerItem(index) {
        this.items.splice(index, 1);
        this.notifyObservers();
    }

    getTotal() {
        return this.items.reduce((total, item) => total + item.price, 0);
    }

    addObserver(observer) {
        this.observers.push(observer);
    }

    removeObserver(observer) {
        const index = this.observers.indexOf(observer);
        if (index > -1) {
            this.observers.splice(index, 1);
        }
    }

    notifyObservers() {
        this.observers.forEach(observer => observer.update());
    }
}

// Observadores
class CartObserver {
    constructor(cart) {
        this.cart = cart;
        this.cart.addObserver(this);
    }

    update() {
        const cartElement = document.getElementById('cart');
        const items = this.cart.items.map((item, index) => `
            <table style="border: 1px solid;">
                <tbody>
                    <tr>
                        <td width="100px">${item.name}</td>
                        <td>R$${item.price.toFixed(2)}</td>
                        <td><button class="remove-item" data-index="${index}">Remover</button></td>
                    </tr>
                </tbody>
            </table>
        `).join('');
        cartElement.innerHTML = items || 'Nenhum item no carrinho';

        // EventListener nos botões 'Remover'
        const removeButtons = cartElement.querySelectorAll('.remove-item');
        removeButtons.forEach((button) => {
            button.addEventListener('click', () => {
                const index = parseInt(button.getAttribute('data-index'));
                cart.removerItem(index);
            });
        });
    }
}

class TotalObserver {
    constructor(cart) {
        this.cart = cart;
        this.cart.addObserver(this);
    }

    update() {
        const totalElement = document.getElementById('total');
        const total = this.cart.getTotal();
        totalElement.textContent = total.toFixed(2);
    }
}

// Inicializa o carrinho de compras e os observadores
const cart = new CarrinhoCompras();
const cartObserver = new CartObserver(cart);
const totalObserver = new TotalObserver(cart);

// Adiciona event listeners aos itens da lista de produtos
const productElements = document.querySelectorAll('#products li');
productElements.forEach((element) => {
    element.addEventListener('click', () => {
        const name = element.getAttribute('data-name');
        const price = parseFloat(element.getAttribute('data-price'));
        cart.adicionarItem({ name, price });
    });
});