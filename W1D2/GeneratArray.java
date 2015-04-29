/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class GeneratArray {
    //int i=0;
      private int[] array = new int[60];
      private int arraysize = 50;
      public void Generaterandom(){
        for (int i = 0;   i< arraysize; i++){           
            array[i] = (int) (Math.random() * 100);
    }
    }
    public void removeduplicat() {
        for (int j = 0; j < arraysize; j++) {
            for (int k = 0; k < arraysize; k++) {
                if (array[j] == array[k]) {
                    deleteindex(k);
                }

            }
        }
    }

    private void deleteindex(int indexj) {
        if (indexj < arraysize) {

            for (int i = indexj; i < (arraysize - 1); i++) {

                array[i] = array[i + 1];

            }
            arraysize--;

        }

    }
    public void removeall(){
        array=null;
    }
    public int size(){
          
            return  arraysize;
        }
    public int get(int index){
         if (index < arraysize) {
            return array[index];
        } else {
            return -1;
        }
    }
     public int[] getSublist(int start, int end) {
        int[] temp = null;
        if (start < arraysize && end < arraysize) {
            int size = end - start;
            temp = new int[size];
            for (int i = 0; i < size; i++) {
                temp[i] = array[start];
                start++;
            }
        }
        return temp;
    }
      public void printArray(){
        for (int i = 0; i < arraysize; i++) {
            System.out.print(array[i] + ", ");
        }
    } 
}
    
    

