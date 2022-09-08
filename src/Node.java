public class Node {
    int x, y, width, height;
    Node left, right;

    public Node(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        left = right = null;
    }
}
