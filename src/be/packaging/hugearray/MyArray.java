package be.packaging.hugearray;

public class MyArray {

    private int reservedSize;
    private int length;
    private Object[] objects;

    public MyArray() {
        reservedSize = 2;
        length = 0;
        Object[] objects = new Object[reservedSize];
    }

    public int length() {
        return length;
    }

    public void add(Object[] objects) {
        if (length == reservedSize) {
            reservedSize = reservedSize * 2;
            Object[] objects1 = new Object[reservedSize];

            for (int i = 0; i < objects.length; i++) {
                objects1[i] = objects[i];

            }
            this.objects = objects1;
            length++;
        }
    }


}
