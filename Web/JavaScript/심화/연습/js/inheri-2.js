class Book {
    constructor(title, price){
        this.title = title;
        this.price = price;
    }
    buy(){
        console.log(`${this.title}을 ${this.price}원에 구매하였습니다.`);
    }
}

const book1 = new Book("자료구조",15000);
book1.buy();

class Textbook extends Book{
    constructor(title, price, major){
        super(title, price);
        this.major = major;
    }
    buyTextbook(){
        console.log(`${this.major} 전공서적인 ${this.title}을 ${this.price}원에 구매하였습니다.`);
    }
}
const book2 = new Textbook("인공지능",5000,"컴퓨터공학");
book2.buyTextbook();
book2.buy();