const dialog = document.getElementById('myDialog');

document.getElementById('feedbackForm').addEventListener('submit', function (event) {
    event.preventDefault(); // Impede o recarregamento da página
   const mensagemdialog = document.getElementById("mensagemstatus") 
   const inputnome = document.getElementById("nome")
   const inputemail = document.getElementById("email")
   const inputmensagem = document.getElementById("mensagem")

   if (inputnome.value===""){
    mensagemdialog.textContent="Você precisa inserir o nome"

   } else if (inputemail.value===""){
    mensagemdialog.textContent="Você precisa inserir o email"
   } else if (inputmensagem.value===""){
    mensagemdialog.textContent="Você precisa inserir uma mensagem"
   } else {
    mensagemdialog.textContent="Mensagem enviada com sucesso"
   }
dialog.showModal();
})
const closeButton = document.getElementById('closeButton');

    closeButton.addEventListener('click', () => {
        dialog.close(); // Closes the dialog
    })