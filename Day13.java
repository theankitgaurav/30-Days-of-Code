//Write MyBook Class
class MyBook extends Book{
    int price;
    MyBook(String t, String a, int p){
        super(t, a);
        this.price = p;
    }
    void display(){
        System.out.println("Title: "+this.title+"\n"+
                          "Author: "+this.author+"\n"+
                          "Price: "+this.price);
    }
}