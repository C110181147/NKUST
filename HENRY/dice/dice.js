function result() {
    const dices = document.getElementById("dices").value
    const noodle = document.getElementById("noodle").value
    const drops = document.getElementById("drops").value
    const result = document.getElementById("result")
    const idTotal = document.getElementById("total")
    const idTime = document.getElementById("time")
    result.innerHTML = ""
    idTotal.innerHTML=""
    idTime.innerHTML=""
    const diceObject = {};


    for (let i = 0; i < drops; i++) {
        let Total = 0
        for (let j = 0; j < dices; j++) {
            Total += (Math.floor(Math.random() * noodle) + 1)
        }
        if (diceObject[Total]) {
            diceObject[Total] += 1
        } else {
            diceObject[Total] = 1
        }
    }


    Object.keys(diceObject).forEach(key => {
        const p = document.createElement("p")
        const p1 = document.createElement("p")
        const p2 = document.createElement("p")
        let pString =""
        let pString1 =` ${key} `
        let pString2 =` ${diceObject[key]} `
        p.className="resultP"
        for (let i = 0; i < diceObject[key]; i++) {
            pString += " *"
        }
        p1.innerHTML=pString1
        p2.innerHTML=pString2
        p.innerHTML = pString
        idTotal.appendChild(p1)
        idTime.appendChild(p2)
        result.appendChild(p)
    })
}


const button = document.getElementById("button").addEventListener("click", result)
