
class MyStringCount<T> {

    private T[] array;
    private T element;
    int size;

    public MyStringCount(int size) 
    {
        array = (T[]) new Object[size];
    }

    public void setElem(int index, T value) {
        array[index] = value;
    }

    public T getElem(int index) 
    {
        return array[index];
    }

    public int countOccurrences(T[] array, T element) 
    {
        int count=0;
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i].equals(element)||array[i]==element)
            {
                count++;
            }
        }
            return count;

    }
}
