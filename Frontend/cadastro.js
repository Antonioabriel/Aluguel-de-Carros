const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");
const Itel = document.querySelector(".tel");
const Icpf = document.querySelector(".cpf");
const Ilogradouro = document.querySelector(".logradouro");
const Inumero_casa = document.querySelector(".numero_casa");
const Icep = document.querySelector(".cep");
const Imunicipio = document.querySelector(".municipio");
const Iestado = document.querySelector(".estado");
const Icnh = document.querySelector(".cnh_numero");
const Icnh_categoria = document.querySelector(".cnh_categoria");
const Icnh_validade = document.querySelector(".cnh_validade");
const Idata_nascimento = document.querySelector(".data_nascimento");




function cadastrar(){

    fetch("http://localhost:8080/usuarios",

        {
            headers: {
                'Accept':'application/json',
                'Content-Type':'application/json'
            },
            method: "POST",
           
            body:JSON.stringify({
                nome: Inome.value,
                email: Iemail.value,
                senha: Isenha.value,
                telefone: Itel.value,
                cpf: Icpf.value,
                logradouro: Ilogradouro.value,
                numero_casa: Inumero_casa.value,
                cep: Icep.value,
                municipio: Imunicipio.value,
                estado: Iestado.value,
                cnh_numero: Icnh.value,
                cnh_categoria: Icnh_categoria.value,
                cnh_validade: Icnh_validade.value,
                data_nascimento: Idata_nascimento.value,
            })
        })
        .then(function(res){ console.log(res)})
        .catch(function(res){ console.log(res)})
};

function limpar(){
    Inome.value = "";
    Iemail.value = "";
    Isenha.value = "";
    Itel.value = "";
    Icpf.value = "";
    Ilogradouro.value = "";
    Inumero_casa.value = "";
    Icep.value = "";
    Imunicipio.value = "";
    Iestado.value = "";
    Icnh_categoria.value = "";
   Icnh_validade.value = "";
   Idata_nascimento.value = "";
    
};

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
    limpar();
});