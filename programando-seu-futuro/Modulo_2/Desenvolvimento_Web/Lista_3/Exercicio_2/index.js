var listaDeFilmes = [];

function enviar() {
    try {
        let nomeDoFilmeFavorito = document.getElementById("nomeDoFilmeFavorito").value;
        let anoDeLancemento = document.getElementById("anoDeLancemento").value;
        let nomeDoProtagonista = document.getElementById("nomeDoProtagonista").value;

        alert("Viadinho Voce ein");
        let filme = { nomeDoFilmeFavorito, anoDeLancemento, nomeDoProtagonista };

        console.log(filme);
        listaDeFilmes.push(filme);
        console.log(listaDeFilmes);

    } catch (error) {
        console.log(error);
    }
}

// Comentario abaixo equivalente ao exercicio original.

// var nomeDoFilmeFavorito = prompt("Qual seu filme preferido?")
// var anoDeLancemento = prompt("Qual o ano de lancamento?")
// var nomeDoProtagonista = prompt("Qual o nome do protagonista?")

// var filme = { nome: nomeDoFilmeFavorito, lancamento: anoDeLancemento, protagonista: nomeDoProtagonista }

// var dataBase = []

// dataBase.push(filme)

// document.writeln(filme.nome, " foi lancado em ", filme.lancamento, ", onde ", filme.protagonista, " mostra sua história de vida!")