public class CircleApp{
  public static void main(String[] args){
    Circle c1 = new Circle(5, 5, 15, 15);
    c1.print();
  }
}

class Circle{
  int x, y;
  int w, h;
  Circle(int x, int y, int w, int h){
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  void print(){
    System.out.format("Circulo de tamanho (%d,%d) na posicao (%d,%d).\n",
                      this.w, this.h, this.x, this.y);
  }
}
