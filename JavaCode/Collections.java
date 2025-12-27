import java.util.*;

class Main {
    public static void main(String[] args) {
        // ---------------- Arraylist --------------
        // ArrayList<Integer> values = new ArrayList<>();
        // values.add(1);
        // values.add(2);
        // values.add(3);
        // values.add(4);
        // values.add(5);
        // // System.out.println(values.get(3));
        // // System.out.println(values.size());
        // // values.remove(1);
        // int sum = 0;
        // for(int a: values) {
        //     if(a == 2) {
        //         System.out.println(values.get(1));
        //         values.remove(a);
        //         System.out.println(values.get(1));

        //     }
        //     sum += a;
        // }
        // System.out.println("sum: "+ sum);
        // System.out.println(values.get(3));

        // ---------------- HashSet ---------------
        // HashSet<Integer> set = new HashSet<>();
        // set.add(10);
        // set.add(20);
        // set.add(10);
        // int sum = 0;
        // for(int a: set) {
        //     sum += a;
        // }
        // set.remove(1);
        // System.out.println("sum: "+ set);
        // System.out.println(set);

        // ---------------- HashMap ----------------
        // HashMap < String, Integer > map = new HashMap < > ();
        // map.put("Divyansh", 40);
        // map.put("Badal", 30);
        // map.replace("Divyansh", 50);
        // map.clear();
        // System.out.println("map: " + map.get("Divyansh"));

        // for (map.Entry < String, Integer > entry: map.entrySet()) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

        // ---------------- Interator ------------
        // ArrayList < Integer > list = new ArrayList < > ();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // System.out.println(list);
        // Iterator < Integer > it = list.iterator();

        // while (it.hasNext()) {
        //     int x = it.next();
        //     if (x == 2) {
        //         it.remove();
        //     }
        // }
        // System.out.println(list);

        // ---------------- LinkedList ----------------
        // LinkedList<Integer>list = new LinkedList<>();
        // list.offer(10);
        // list.offerFirst(30);
        // list.offerLast(40);
        // list.addFirst(10);
        // list.addFirst(30);
        // list.addLast(40);
        // list.addLast(20);

        // System.out.println("list: " + list);

        // ---------------- TreeMap ----------------
        // TreeMap < Integer, String > map = new TreeMap<>();

        // map.put(10, "Ten");
        // map.put(5, "Five");
        // map.put(20, "Twenty");
        // map.put(15, "Fifteen");

        // System.out.println(map); // sorted

        // System.out.println(map.floorKey(12)); // 10
        // System.out.println(map.ceilingKey(12)); // 15

        // System.out.println(map.subMap(5, true, 15, true));
        // System.out.println(map); // sorted

        // ---------------- TreeSet ----------------
        // TreeSet < Integer > set = new TreeSet < > ();
        // set.add(10);
        // set.add(5);
        // set.add(20);
        // set.add(10); // ignored (duplicate)

        // System.out.println(set);
        // set.first();
        // set.last();

        // System.out.println(set.lower(10)); // < 10
        // System.out.println(set.floor(10)); // <= 10
        // System.out.println(set.higher(10)); // > 10
        // System.out.println(set.ceiling(10)); // >= 10

        // ---------------- Stack ----------------
        // Deque < Integer > stack = new ArrayDeque < > ();

        // stack.push(10);
        // stack.push(20);
        // stack.push(20);
        // stack.push(20);
        // stack.push(20);
        // stack.push(20);
        // stack.pop(); // removes 20
        // System.out.println(stack);

        // ---------------- Queue ----------------
        // Queue < Integer > queue = new ArrayDeque<>();

        // queue.offer(20);
        // queue.offer(10);
        // queue.poll(); // removes 10
        // System.out.println(queue);

        // ---------------- PriorityQueue ----------------
        // PriorityQueue < Integer > pq = new PriorityQueue < > ();
        PriorityQueue < Integer > pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(5);
        pq.add(1);
        pq.add(3);

        System.out.println(pq.poll()); // 1




    }
}
