public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i<s.size(); i++ ){
      for (int v = 0; v<i; v++){
        if (s.get(i) == s.get(v)){
          s.remove(i);
          i--;
        }
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    for (int i = 0; i<a.size(); i++){
      for (int v = 0; v<b.size(); v++){
        if (a.get(i) == b.get(v)){
          result.add(a.get(i));
        }
      }
    }
    removeDuplicates(result);
    return result;
  }
  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    for (int i = 0; i<Math.min(a.size(),b.size()); i++){
      if (i < a.size()){
        result.add(a.get(i));
      }
      if (i < b.size()){
        result.add(b.get(i));
      }
    }
    return result;
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray numbers1 = new SuperArray();
    SuperArray numbers2 = new SuperArray();

    numbers1.add("9");   numbers1.add("1");     numbers1.add("2");     numbers1.add("2");
    numbers1.add("3");    numbers1.add("4");     numbers2.add("0");    numbers2.add("4");
    numbers2.add("2");    numbers2.add("2");     numbers2.add("9");

    System.out.println("input a " + numbers1);
    System.out.println("input b " + numbers2);
    System.out.println("result " + findOverlap(numbers1, numbers2));
  }
}
