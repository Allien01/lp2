public class RectApp{
  public static void main(String[] args){
    Rect c1 = new Rect(5, 5, 20, 10);
    c1.print();
    System.out.println("Arrastando retangulo...");
    c1.drag(10, 5);
    c1.print();
    System.out.format("Area do retangulo: %d\n", c1.area());
  }
}

class Rect{
  int x, y;
  int w, h;

  int area(){
    return this.w * this.h;
  }

  void drag(int dx, int dy){
    this.x += dx;
    this.y += dy;
  }

  Rect(int x, int y, int w, int h){
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  void print(){
    System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
                      this.w, this.h, this.x, this.y);
  }
}
