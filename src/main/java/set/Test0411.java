package set;


import java.util.*;

/**
 * Created by helmeter on 4/11/16.
 */
@SuppressWarnings("Since15")
public class Test0411 {


    public static void main(String[] args) {
        List list  =new LinkedList();

        list.add(11);
        list.add(22);
        list.add(11);

      //  list.remove(Integer.valueOf(11));
        System.out.println(list);

        ArrayList a = new ArrayList();
        a.add(111);
        a.add(55);
        HashMap hashmap = new HashMap();
        hashmap.put(null,12);
        hashmap.put("12",12);
        hashmap.put(null,14);
        hashmap.put("77",null);
        hashmap.put("99",null);
        hashmap.put("15",16);

        hashmap.put("17",18);
       // System.out.println(hashmap);
        Iterator it  = hashmap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
           // System.out.println(entry+"---------");
            System.out.println(entry.getValue());
        }

        System.out.println(hashmap);
        TreeMap treeMap  =  new TreeMap();
        //treemap key 不可为空
        //treeMap.put(null,33);
        treeMap.put("44",44);
        treeMap.put("22",22);
        treeMap.put("11",77);
        treeMap.put("33",33);
        treeMap.put("66",66);

        treeMap.put("55",55);

        System.out.println(treeMap);

         Deque deque;
        deque = new ArrayDeque();

        deque.add(11);
        deque.add(22);
        deque.add(33);
        deque.add(0);
        System.out.println(deque.pollLast());
        System.out.println(deque);


        Hashtable hashtable = new Hashtable();
       //key不可为空 基于dictionary类
        hashtable.put("tt",44);
        hashtable.put("eee",55);
        hashtable.put("66",66);

        System.out.println(hashtable);

       WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.put(null,12);
        weakHashMap.put("12",12);
        weakHashMap.put(null,14);
        weakHashMap.put("77",null);
        weakHashMap.put("99",null);
        weakHashMap.put("15",16);

        System.out.println(weakHashMap);

        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println(hashSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("11",11);
        linkedHashMap.put("22",22);
        linkedHashMap.put("00",00);
        linkedHashMap.put(null,"");
        System.out.println(linkedHashMap);
        System.out.println( Arrays.asList(linkedHashMap));
        List<HashMap<String , String>>list3 = Arrays.asList(
                new HashMap<String , String>() {
                    {
                        put("name" , "xieyuooo");
                        put("title" , "www");
                    }
                },
                new HashMap<String , String>() {
                    {
                        put("name" , "ffff");
                        put("title" , "eee");
                    }
                });
        System.out.println(list3);



        Queue queue = new PriorityQueue();

        queue.add(1);
        queue.add(23);
        queue.add(0);
        System.out.println(queue);
    }
}
