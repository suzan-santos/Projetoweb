// Seleciona os elementos do DOM
const loginLink = document.getElementById("login-link");
const cadastroLink = document.getElementById("cadastro-link");
const modal = document.getElementById("modal");
const modalTitle = document.getElementById("modal-title");
const modalForm = document.getElementById("modal-form");
const closeModalButton = document.querySelector(".close");

// Função para abrir o modal de login
loginLink.addEventListener("click", function (e) {
    e.preventDefault();
    openModal("Login");
});

// Função para abrir o modal de cadastro
cadastroLink.addEventListener("click", function (e) {
    e.preventDefault();
    openModal("Cadastro");
});

// Função para abrir o modal com o título apropriado
function openModal(type) {
    modal.style.display = "block"; // Exibe o modal
    modalTitle.textContent = type; // Define o título conforme o tipo (Login ou Cadastro)
    
    if (type === "Login") {
        modalForm.innerHTML = `
            <form>
                <label for="login-email">Email:</label>
                <input type="email" id="login-email" required>
                <label for="login-password">Senha:</label>
                <input type="password" id="login-password" required>
                <button type="submit">Entrar</button>
            </form>
        `;
    } else {
        modalForm.innerHTML = `
            <form>
                <label for="register-name">Nome:</label>
                <input type="text" id="register-name" required>
                <label for="register-email">Email:</label>
                <input type="email" id="register-email" required>
                <label for="register-password">Senha:</label>
                <input type="password" id="register-password" required>
                <button type="submit">Cadastrar</button>
            </form>
        `;
    }
}

// Fecha o modal quando o botão de fechar é clicado
closeModalButton.addEventListener("click", function () {
    modal.style.display = "none";
});

// Fecha o modal quando o usuário clica fora dele
window.addEventListener("click", function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
});
