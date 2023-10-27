number = document.getElementById("number");
button = document.getElementById("button");
table = document.getElementById("table");

button.addEventListener("click", () => {
  try {
    table.innerHTML = "";
    if (number.value === "") {
      alert("Ops. Algo deu errado. Verifique se o valor está correto!");
    } else {
      gerarTabuada();
    }
  } catch (error) {
    alert(error);
  } finally {
    number.value = "";
  }
});

function gerarTabuada() {
  let _number = Number(number.value);
  let res = 0;
  let options = "";

  for (let i = 0; i <= 10; i++) {
    res = _number * i;
    options += `<option>${_number} x ${i} = ${res}</option>`;
  }

  table.innerHTML = `<select>${options}</select>`;
  table.style.display = "block";
  console.log(table.innerHTML);
}
