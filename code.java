public class code{

    public static void main(String[] args){

        LinkedList list = new LinkedList(52);
        list.first.next = new Node(36);
        list.first.next.next = new Node(29);
        list.first.next.next.next = new Node(23);

        
        //System.out.println(node1.val);
        list.printALL();
    }   

}