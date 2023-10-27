start = document.getElementById("start");
end = document.getElementById("end");
space = document.getElementById("space");
btn = document.getElementById("button");
cont = document.getElementById("cont");

btn.addEventListener("click", () => {
  try {
    cont.innerHTML = "";
    if (start.value === "" || end.value === "") {
      alert("Digite os valores necessarios!");
      return;
    } else if (space.value === "") {
      space.value = 1;
    }
    contagem();
  } catch (error) {
    alert(error);
  } finally {
    start.value = "";
    end.value = "";
    space.value = "";
  }
});

function contagem() {
  let i = Number(start.value);
  limit = Number(end.value);
  increment = Number(space.value);
  for (i; i <= limit; i += increment) {
    i + increment <= limit
      ? (cont.innerHTML += `${i} ❤️`)
      : (cont.innerHTML += `${i} 🔥`);
  }
}
