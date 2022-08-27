public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        System.out.println("---------------------------------------------");
        System.out.println("List Status : " + (list.isEmpty() ? "Is Empty" : "Is not empty"));
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println("Capacity : " + list.getCapacity());
        System.out.println("Size : " + list.size());
        System.out.println("---------------------------------------------");

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("---------------------------------------------");
        System.out.println("Capacity : " + list.getCapacity());
        System.out.println("Size : " + list.size());
        System.out.println("---------------------------------------------");

        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(40);
        list.add(100);
        list.add(110);

        System.out.println("---------------------------------------------");
        System.out.println("Capacity : " + list.getCapacity());
        System.out.println("Size : " + list.size());
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println("deleting item " + list.remove(5));
        System.out.println(list.get(10));
        System.out.println(list.get(9));
        System.out.println(list.get(8));
        System.out.println(list.get(7));
        System.out.println(list.get(6));
        System.out.println(list.get(5));
        System.out.println(list.get(4));
        System.out.println(list.get(3));
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println(list.set(9,200));
        System.out.println(list.get(9));
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println(list.toString());
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println(list.indexOf(55));
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(40));
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println(list.lastIndexOf(44));
        System.out.println(list.lastIndexOf(40));
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println("List Status : " + (list.isEmpty() ? "Is empty" : "Is not empty"));
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        Object[] objectArray = list.toArray();
        System.out.println("First element of object array : " + objectArray[0]);
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println("List Status : " + (list.isEmpty() ? "Is empty" : "Is not empty"));
        list.clear();
        System.out.println("List Status : " + (list.isEmpty() ? "Is empty" : "Is not empty"));
        System.out.println("---------------------------------------------");

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(102);
        list.add(20);
        list.add(306);
        list.add(400);

        System.out.println("---------------------------------------------");
        System.out.println("List Status : " + (list.isEmpty() ? "Is empty" : "Is not empty"));
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println("Capacity : " + list.getCapacity());
        System.out.println("Size : " + list.size());
        System.out.println(list.get(3));
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println("Array : " + list.sublist(3,6).toString());
        System.out.println("---------------------------------------------");

        System.out.println("---------------------------------------------");
        System.out.println("Is there? : " + list.contains(20));
        System.out.println("Is there? : " + list.contains(22));
        System.out.println("---------------------------------------------");

    }
}
