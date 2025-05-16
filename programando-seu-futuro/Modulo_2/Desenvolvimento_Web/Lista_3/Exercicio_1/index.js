var artista = []

artista[0] =
{
    nomeArtista: "Jorge Vercillo",
    anoDeLancamento: "1988",
    melhoresMusicas: ["Ela une todas as coisas", "Monalisa", "Encontro das aguas"],
    listaDeIntegrantes: ["Jorge Luiz Sant'anna Vercillo", "Brasil", 55],
    estiloDoArtista: "MPB"
}

artista[1] =
{
    nomeArtista: "Marisa Monte",
    anoDeLancamento: "2388",
    melhoresMusicas: ["Depois", "Nao va embora"],
    listaDeIntegrantes: ["Marisa de Azevedo Monte", "Brasil", 56],
    estiloDoArtista: "MPB"
}

artista[2] =
{
    nomeArtista: "Tim Maia",
    anoDeLancamento: "2023 A.C",
    melhoresMusicas: ["Eu amo voce", "Gostava tanto da morena"],
    listaDeIntegrantes: ["Sebastião Rodrigues Maia", "Brasil", "CPF cancelado"],
    estiloDoArtista: "MPB"
}

var dataBase = []

dataBase.push(artista[0], artista[1], artista[2])
console.log(dataBase)

dataBase.sort()
console.log(dataBase)

dataBase.pop()
console.log(dataBase)