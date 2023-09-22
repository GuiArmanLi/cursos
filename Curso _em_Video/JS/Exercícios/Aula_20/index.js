start = document.getElementById("start");
end = document.getElementById("end");
way = document.getElementById("way");
btn = document.getElementById("btn");
cont = document.getElementById("cont");

btn.addEventListener("click", () => {
    try {
        cont.innerHTML = "";
        if (start.value === "" || end.value === "") {
            alert("Digite os valores necessarios!")
            return
        } else if (way.value === "") { way.value = 1; }
        contagem();
    } catch (error) { alert(error); } finally { start.value = ""; end.value = ""; way.value = ""; }
})

function contagem() {
    let i = Number(start.value); limit = Number(end.value); increment = Number(way.value);
    for (i; i <= limit; i += increment) {
        i + increment <= limit ? cont.innerHTML += `${i} ❤️` : cont.innerHTML += `${i} 🔥`
    }
}