input = document.getElementById("input");
adicionar = document.getElementById("btnAdd");
list = document.getElementById("list");
calcular = document.getElementById("btn-calcular");
response = document.getElementById("content-response");
select = document.getElementById("select");

array = [];

adicionar.addEventListener("click", () => {
  try {
    let display = "flex";
    let item = Number(input.value);
    item != 0 ? array.push(item) : (display = "none");

    select.innerHTML = createSelectArray();
    list.style.display = display;
  } catch (error) {
    alert(error);
  } finally {
    (input.value = ""), (response.style.display = "none");
  }
});

calcular.addEventListener("click", () => {
  response.style.display = "flex";
  manipularArray();
});

function createSelectArray() {
  let itens = "";
  for (let i = 0; i < array.length; i++) {
    itens += `<option>${array[i]}</option>`;
  }
  return itens;
}

function manipularArray() {
  let soma = 0;
  for (let i = 0; i < array.length; i++) {
    soma += array[i];
  }
  let media = soma / array.length;
  let arraySort = array.sort();

  response.innerHTML = `<p>Ao todo temos ${
    array.length
  } valores cadastrados.</p>
    <p>O maior valor informado foi ${arraySort[arraySort.length - 1]}.</p>
    <p>O menor valor informado foi ${arraySort[0]}.</p>
    <p>Somando todos os valores temos ${soma}.</p>
    <p>A média dos valores digitados é ${Math.floor(media)}.</p>`;
}
