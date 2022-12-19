public class ArrayRectangles {

    private Rectangle[] rectangleArray;

    public ArrayRectangles(int size) {
        if (size <= 0)
            throw new IllegalArgumentException();

        rectangleArray = new Rectangle[size];
    }

    public ArrayRectangles(Rectangle... rectangles) {
        if (rectangles == null || rectangles.length == 0)
            throw new IllegalArgumentException();

        rectangleArray = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++)
            if (rectangleArray[i] == null){
                rectangleArray[i] = rectangle;
                return true;
            }

        return false;
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < rectangleArray.length; i++)
            if (rectangleArray[i] != null)
                count++;

        return count;
    }

    public int indexMaxArea() {
        double maxArea = 0;
        int indexMaxArea = -1;
        for (int i = 0; i < rectangleArray.length; i++)
            if (rectangleArray[i] != null)
            {
                double currentArea =  rectangleArray[i].area();
                if (currentArea > maxArea){
                    maxArea = currentArea;
                    indexMaxArea = i;
                }
            }

        return indexMaxArea;
    }

    public int indexMinPerimeter() {
        double minPerimeter = Double.MAX_VALUE;
        int indexMinPerimeter = -1;
        for (int i = 0; i < rectangleArray.length; i++)
            if (rectangleArray[i] != null)
            {
                double currentPerimeter =  rectangleArray[i].perimeter();
                if (currentPerimeter < minPerimeter){
                    minPerimeter = currentPerimeter;
                    indexMinPerimeter = i;
                }
            }

        return indexMinPerimeter;
    }

    public int numberSquares() {
        int count = 0;
        for (int i = 0; i < rectangleArray.length; i++)
            if (rectangleArray[i] != null && rectangleArray[i].isSquare())
                count++;

        return count;
    }
}
