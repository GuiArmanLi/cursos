let data = new Date();
let hora = data.getHours();
let minuto = data.getMinutes();

addEventListener("load", () => {
  let horario = document.getElementById("horario");

  horario.innerHTML = `O horário atual é ${hora}:${minuto}`;
});

addEventListener("load", () => {
  let foto = document.getElementById("foto");
  let backgorund = document.getElementById("background");

  if (hora < 12) {
    foto.src =
      "https://www.mensagens10.com.br/wp-content/uploads/2019/10/para-hoje-1024x1024.png";
    backgorund.style.backgroundColor = "#F1EFEF";
  } else if (hora < 18) {
    foto.src =
      "https://cdn.pensador.com/img/imagens/pe/ns/pensador_boa_tarde_com_carinho_03.jpg?auto_optimize=low&width=655";
    backgorund.style.backgroundColor = "#CCC8AA";
  } else {
    foto.src =
      "https://www.frasesdobem.com.br/wp-content/uploads/2020/06/que-voce.jpg";
    backgorund.style.backgroundColor = "#7D7C7C";
  }
});
