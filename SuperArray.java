class SuperArray{
  private String [] data;
  private int size; //The current size

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    for (int i = 0; i<data.length; i++){
      if(data[i] == null){
        data[i] = element;
        size++;
        return true;
      }
    }
    resize();
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }

  private void resize(){
    String[] old = new String[data.length];
    for (int i = 0; i<data.length; i++){
      old[i] = data[i];
    }
    data = new String[old.length*2];
    for (int i = 0; i<old.length; i++){
      data[i] = old[i];
    }
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public String toString(){
    String result = "[";
    for (int i = 0; i < size; i++){
      result += data[i];
      if (i < size - 1){
        result += ", ";
      }
    }
    return result+"]";
  }

  public boolean contains(String s){
    for (int i = 0; i<size; i++){
      if(data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public SuperArray(int InitialCapacity){
    data = new String[InitialCapacity];
    size = 0;
  }
}
