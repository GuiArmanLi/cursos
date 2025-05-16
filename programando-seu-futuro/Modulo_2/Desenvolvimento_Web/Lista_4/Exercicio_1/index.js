var contaCorrente = {
    saldo: 2000,
    faturaAtual: 500,
    creditoDisponivel: 200,
    exibirExtrato: Boolean,
    extrato : {
        entrada : [
            {
                data: '05/04/2023',
                valor: 930
            },
            {
                data: '05/04/2023',
                valor: 170 
            }
        ],
        saida : [
            {
                data: '07/04/2023',
                valor: 40,
                descricao: 'Hamburger do Tottas'
            },
            {
                data: '07/04/2023',
                valor: 40,
                descricao: 'Outro Hamburger do Tottas'
            }
        ]
    },
    
}

if(contaCorrente.exibirExtrato(contaCorrente.saldo - contaCorrente.faturaAtual > 0) == true){
    console.log("Voce possui saldo para pagar a fatura atual!")
    console.log(contaCorrente.extrato)
} else {
    console.log("Voce nao possui saldo suficiente para pagar a fatura, experimente pegar credito para conseguir pagar!\nVoce tem " + contaCorrente.creditoDisponivel + "para utlizar.")}