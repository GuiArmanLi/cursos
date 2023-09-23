const m = document.getElementById("masculino");
const f = document.getElementById("feminino");

const btn = document.getElementById("btn");
const contentImage = document.getElementById("content-image");
const img = document.getElementById("img");

m.addEventListener("click", () => { f.checked ? f.checked = false : null })

f.addEventListener("click", () => { m.checked ? m.checked = false : null })

btn.addEventListener("click", () => {
    const age = document.getElementById("age");
    age.value == "" ? age.value = 0 : null;
    try {
        contentImage.style.display = "block";
        if (m.checked && age.value != 0) {
            console.log(age.value)
            if (age.value < 18) {
                img.src = "images/menino.jpeg";
            } else if (age.value < 64) {
                img.src = "images/homem.jpg";
            } else {
                img.src = "images/velho.jpg"
            }
        } else if (f.checked && age.value != 0) {
            if (age.value < 18) {
                img.src = "images/menina.jpg"
            } else if (age.value < 64) {
                img.src = "images/mulher.jpg"
            } else {
                img.src = "images/velha.jpg"
            }
        }
        else {
            if (age.value < 120) {
                alert("Digite um valor valido!")
            }
            img.src = "images/erro.png";
        }
    } catch (error) {
        alert(error)
    } finally {
        age.value = "";
        m.checked = false;
        f.checked = false;
    }
})