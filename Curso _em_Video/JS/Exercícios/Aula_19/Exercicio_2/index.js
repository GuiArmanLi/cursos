const idade = document.getElementById("idade");
const masculino = document.getElementById("masculino");
const feminino = document.getElementById("feminino");

const teste = document.getElementById("teste")
const botao = document.getElementById("botao");
const contentImage = document.getElementById("content-image");
const imagem = document.getElementById("imagem");

//Verificador de marcação do Input Radio
masculino.addEventListener("click", () => {
    if (feminino.checked) {
        feminino.checked = false;;
    }
})

feminino.addEventListener("click", () => {
    if (masculino.checked) {
        masculino.checked = false;;
    }
})

//Exibir imagem de acordo com idade e sexo
botao.addEventListener("click", () => {
    try {
        contentImage.style.display = "block";
        if (masculino.checked) {
            if (idade.value < 18) {
                imagem.src = "https://img.freepik.com/vetores-premium/desenho-de-menino-bonito_18591-41527.jpg";
            } else if (idade.value < 64) {
                imagem.src = "https://uploads.metropoles.com/wp-content/uploads/2023/06/21181304/destaque-1-2.jpg";
            } else {
                imagem.src = "https://c.pxhere.com/photos/de/5c/photo-144152.jpg!d"
            }
        } else if (feminino.checked) {
            if (idade.value < 18) {
                imagem.src = "https://i.pinimg.com/736x/e7/a0/18/e7a01869a1581393e8178c7d8ef0407c.jpg"
            } else if (idade.value < 64) {
                imagem.src = "https://assets.propmark.com.br/uploads/2022/02/WhatsApp-Image-2022-02-18-at-08.52.06.jpeg"
            } else {
                imagem.src = "https://img.freepik.com/fotos-premium/mulher-velha-posando-dentro-de-casa-vista-frontal_23-2149883543.jpg?w=2000"
            }
        }
        else {
            image.src = "https://compras.wiki.ufsc.br/images/5/56/Erro.png";
        }
    } catch (error) {
        alert(error)
    } finally {
        idade.value = "";
        masculino.checked = false;
        feminino.checked = false;
    }

})