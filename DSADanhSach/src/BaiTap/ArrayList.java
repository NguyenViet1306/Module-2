package BaiTap;

import java.sql.Array;
import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    // tạo 1 đối tượng ban đầu
    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ArrayList(int capacity) {
        elements = new Object[capacity];
    }

    // kiểm tra xem index có nằm trong size ko
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException
                    ("index" + index + "out of bounds");
        }
    }

    // kiểm tra độ dài mảng
    public void ensureCapacity() {
        int newSize = elements.length * 2;
        if (size >= elements.length)
            elements = Arrays.copyOf(elements, newSize);
    }

    // thêm phần tử vào vị trí index
    public void add(int index, E element) {
        checkIndex(index);
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    //thêm vào vị trí tiếp theo của mảng
    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    // xóa 1 phần tử trong mảng theo index
    public E remove(int index) {
        checkIndex(index);
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    //
    public int size() {
        return size;
    }

    // xóa toàn bộ thành phần trong mảng
    public E clone() {
        Object[] o = new Object[]{};
        o = Arrays.copyOf(elements, DEFAULT_CAPACITY);
        return (E) o;
    }

    // kiểm tra phần tử có trong mảng ko
    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    //trả về vị trí index của phần thử đang tìm, nếu ko có thỳ trả về -1
    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    // lấy ra phần tử
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    // clear mảng
    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // set
    public void set(int index, E element) {
        checkIndex(index);
        elements[index] = element;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) {
                result.append(",");
            }
        }
        return result.toString() + "]";
    }
}
