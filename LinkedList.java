public class LinkedList {
    Node first = null;
	LinkedList(float value){
		first = new Node(value);
    }
    void add(float value){
        getLastNode().next = new Node(value);
    }

    Node getLastNode(){
        Node current = first;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }

    void printALL(){
        Node current = first;
        boolean done = false;
        int counter = 0;
        while(!done){
            counter++;
            System.out.println("Det her er node " + counter + " og dens value er: " + current.val);
            if(current.next == null){
                done = true;
            }else{
                current = current.next;
            }
        }
    }
}
/*
Printe hvert node's værdi

Step: 1
Find længde af LinkedList og angiv passende værdi

Step: 1.1
Imens current.next ikke er lig med null, tilføj til liste værdi.

Step: 2
Få værdi for node x

Step: 3
Print node x værdi

Step: 4
Loop step 2 og 3 for hver node, indtil x > Liste længde








*/