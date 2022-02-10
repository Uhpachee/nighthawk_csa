function resetAttempts() {
    storage.clear();
    storage.setItem("attempts", "-1");
}

function button() {
    storage = window.localStorage;
    var div = document.getElementById("final");
    var result = ([[${result}]]);
    var annotatedtext = document.getElementById("colors");

    var attempts = Number(storage.getItem('attempts'));
    ++attempts;
    console.log("Attempts: " + attempts);
    storage.setItem("attempts", String(attempts));
    console.log(storage.getItem("attempts"));
    storage.setItem(storage.getItem("attempts"), annotatedtext.innerHTML);


    //const search = 'null';
    //const replaceWith = '';
    //div.innerHTML = JSON.stringify(div).split(search).join(replaceWith);
    for (let j = 0; j <= storage.getItem("attempts"); j++) {
        console.log(j);
        var string = String(j);
        console.log("gotten item");
        div.innerHTML += storage.getItem(string);
    }

    if (result === "You won!!!") {
        let btn = document.createElement("button");
        btn.innerHTML = "Play again!";
        btn.onclick = function () {
            location.href = "/wordlemenu";
        };
        document.body.appendChild(btn);
        console.log("clearing storage");
        storage.clear();
    }
}