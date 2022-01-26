function result(value) {
    const dices = document.getElementById("dices")
    const noodle = document.getElementById("noodle")
    const drops = document.getElementById("drops")
    const result = document.getElementById("result")

    

    for (let i = 0; i < drops.value; i++) {
        let Total = 0
        for (let j = 0; j < dices.value; j++) {
            let p = document.createElement("p")
            Total += (Math.floor(Math.random() * noodle.value) + 1)
            p.innerHTML=Total
            result.appendChild(p)
        }
    }
}
function myrefresh()
{
window.location.reload();
}
setTimeout('myrefresh()',1000); //指定1秒刷新一次

  


const button = document.getElementById("button").addEventListener("click", result)
