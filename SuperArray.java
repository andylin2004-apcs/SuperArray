class SuperArray{
  private String [] data;
  private int size; //The current size

  public SuperArray(){
    data = new String[10];
    size = 10;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    for (int i = 0; i<size; i++){
      if(data[i] == ""){
        data[i] = element;
      }
    }
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }
}
