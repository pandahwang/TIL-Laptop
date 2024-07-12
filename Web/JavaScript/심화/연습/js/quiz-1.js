const arr = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19];

// document.querySelector("#btn").addEventListener("click",()=>{
//     document.write(`<p>10보다 큰 수들</p><br>`);
//     arr.forEach(num => {
//         if(num>10){
//             document.write(`<p>${num}</p><br>`);
//         }
//     })
// });

document.querySelector("#btn").addEventListener("click",(e)=>{
    e.preventDefault();
    document.querySelector("#result_title").innerHTML = "";
    document.querySelector("#result").innerHTML = "";
    arr.forEach(num => {
        if(num>10){
            document.querySelector("#result").appendChild(document.createTextNode(`${num} `));
        }
    })
    document.querySelector("#result_title").appendChild(document.createTextNode(`10보다 큰 수들`));
});