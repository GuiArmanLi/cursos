number = document.getElementById("number");
btn = document.getElementById("btn");
table = document.getElementById("table");

btn.addEventListener("click", () => {
    try {
        table.innerHTML = "";
        if (number.value === "") {
            alert("Ops. Algo deu errado. Verifique se o valor está correto!")
        } else {
            gerarTabuada()
        }
    } catch (error) { alert(error) } finally { number.value = ""; }
})

function gerarTabuada() {
    let _number = Number(number.value)
    let res = 0;
    let options = "";

    for (let i = 0; i <= 10; i++) {
        res = _number * i;
        options += `<option>${_number} x ${i} = ${res}</option>`
    }

    table.innerHTML = `<select>${options}</select>`
    table.style.display = "block";
    console.log(table.innerHTML)
}
