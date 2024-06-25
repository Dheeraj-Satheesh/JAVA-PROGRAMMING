class Box {
    int width;
    int height;
    int depth;
    Box(Box B) {
        width = B.width;
        height = B.height;
        depth = B.depth;
    }
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(int len) {// for cube
        width = height = depth = len;
    }

    int volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    int weight;

    BoxWeight(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class inheritance2 {
    public static void main(String[] args) 
    {
        BoxWeight m1 = new BoxWeight(10, 20, 15, 33);
        BoxWeight m2 = new BoxWeight(2, 3, 4, 1);
        int vol;//object
        vol = m1.volume();
        System.out.println("Volume is " + vol);
        System.out.println("Weight is " + m1.weight);
        vol = m2.volume();
        System.out.println("Volume is: " + vol);
        System.out.println("Weight is: " + m2.weight);
    }
}