

document.addEventListener("DOMContentLoaded",function(){
    const colorBox = document.getElementById("colorBox");
    const colorButton = document.getElementById("colorButton");
    const colorCode = document.getElementById("colorCode");

    function getRandomColor() {

        const letters = "0123456789ABCDEF";
        let color = '#';

        for(let i =0; i < 6; i++) {
            color += letters[Math.floor(Math.random() * 16)];
        }

        return color;
    }

    colorButton.addEventListener("click" ,function(){

        const newColor = getRandomColor();
        colorBox.style.backgroundColor = newColor;
        colorCode.textContent = newColor;
    });
});