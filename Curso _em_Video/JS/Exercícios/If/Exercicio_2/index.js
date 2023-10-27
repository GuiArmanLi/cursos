const masc = document.getElementById("masculino");
const femi = document.getElementById("feminino");

const button = document.getElementById("btn");
const contentImage = document.getElementById("content-image");
const image = document.getElementById("img");

masc.addEventListener("click", () => {
  femi.checked ? (femi.checked = false) : null;
});

femi.addEventListener("click", () => {
  masc.checked ? (masc.checked = false) : null;
});

button.addEventListener("click", () => {
  const age = document.getElementById("age");
  age.value == "" ? (age.value = 0) : null;
  try {
    contentImage.style.display = "block";
    if (masc.checked && age.value != 0) {
      console.log(age.value);
      if (age.value < 18) {
        image.src = "images/menino.jpeg";
      } else if (age.value < 64) {
        image.src = "images/homem.jpg";
      } else {
        image.src = "images/velho.jpg";
      }
    } else if (femi.checked && age.value != 0) {
      if (age.value < 18) {
        image.src = "images/menina.jpg";
      } else if (age.value < 64) {
        image.src = "images/mulher.jpg";
      } else {
        image.src = "images/velha.jpg";
      }
    } else {
      if (age.value < 120) {
        alert("Digite um valor valido!");
      }
      image.src = "images/erro.png";
    }
  } catch (error) {
    alert(error);
  } finally {
    age.value = "";
    masc.checked = false;
    femi.checked = false;
  }
});
