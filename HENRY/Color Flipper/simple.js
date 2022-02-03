const colors = ["green", "red", "rgba(133,122,200)", "#f15025"];
document.getElementById("color").innerHTML="#f1f5f8"


function changeColor(){
const colorNumber= colors[Math.floor(Math.random()*4)]
document.getElementById("container").style.backgroundColor=colorNumber
document.getElementById("button").style.backgroundColor=colorNumber
document.getElementById("color").innerHTML=colorNumber
}
function buttonColor(){
    document.getElementById("button").style.backgroundColor=black
}
// document.getElementById("button").addEventListener(,buttonColor(0))