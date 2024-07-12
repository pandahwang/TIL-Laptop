document.querySelector("#btn").addEventListener("click", () => {
  const fTemp = +prompt(`화씨 온도를 입력`);
  const cTemp = ((fTemp - 32) / 1.8).toFixed(2);
  alert(`${fTemp}Ｆ는 ${cTemp}℃ 입니다.`);
});

