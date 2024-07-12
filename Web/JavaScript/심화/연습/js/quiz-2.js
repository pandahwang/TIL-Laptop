// document.querySelector("#btn").addEventListener("click",() =>{
//     const num = +prompt("1보다 큰 수를 입력");
//     let result=0;
//     if(num<=1){
//         alert(`${num}은 1보다 크지 않습니다.`);
//     }
//     else{
//         for(let i=num; i>0; i--){
//             if(i%2==0){result += i;}
//         }
//         document.write(`<p>2부터 ${num}까지 짝수만 더한 결과 : ${result}</p>`);
//     }
// });

let result=0;
document.querySelector("#btn").addEventListener("click",(e) =>{
    e.preventDefault();
    document.querySelector("#result_title").innerText = "";
    document.querySelector("#result").innerText = "";
    const num = parseInt(document.querySelector("#input_num").value);
    if(num<=1){
        alert(`${num}은 1보다 크지 않습니다.`);
    }
    else{
        for(let i=num; i>0; i--){
            if(i%2==0){result += i;}
        }
    }
    document.querySelector("#result_title").appendChild(document.createTextNode(`2부터 ${num}까지 짝수만 더한 결과 : `));
    document.querySelector("#result").appendChild(document.createTextNode(`${result}`));
});