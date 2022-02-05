const hex = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "A", "B", "C", "D", "E", "F"];



function changeColorTTT(){
    let colorNumber = "#"

    for (let i = 0; i < 6; i++) {
        let color = hex[Math.floor(Math.random() * 16)]
        colorNumber =colorNumber + color
    }
    console.log(colorNumber)
    document.getElementById("container").style.backgroundColor=colorNumber
    document.getElementById("btn").style.backgroundColor=colorNumber
    document.getElementById("color").innerHTML=colorNumber
}