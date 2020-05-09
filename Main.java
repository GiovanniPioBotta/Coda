public class Main {

    public static void main(String[] args)
    {
        Coda q = new Coda();
        int value;

        
        System.out.printf("IsEmpty? %s\n", q.isEmpty() ? "Si" : "No");
        q.print();
        System.out.println();

        
        q.enqueue(1);
       
        System.out.printf("IsEmpty? %s\n", q.isEmpty() ? "Si" : "No");
        q.print();
        System.out.println();

        
        q.enqueue(2);
       
        System.out.printf("IsEmpty? %s\n", q.isEmpty() ? "Si" : "No");
        q.print();
        System.out.println();

        
        q.enqueue(3);
        
        System.out.printf("IsEmpty? %s\n", q.isEmpty() ? "Si" : "No");
        q.print();
        System.out.println();

       
        q.enqueue(4);
       
        System.out.printf("IsEmpty? %s\n", q.isEmpty() ? "Si" : "No");
        q.print();
        System.out.println();

        
        if (!q.isEmpty()) 
        {
            value = q.dequeue();
            System.out.printf("Element: %d\n", value);
        }
       
        System.out.printf("IsEmpty? %s\n", q.isEmpty() ? "Si" : "No");
        q.print();
        System.out.println();

       
        if (!q.isEmpty()) 
        {
            value = q.dequeue();
            System.out.printf("Element: %d\n", value);
        }
        
        System.out.printf("IsEmpty? %s\n", q.isEmpty() ? "Si" : "No");
        q.print();
        System.out.println();
    }
}
