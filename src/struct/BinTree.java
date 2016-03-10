package struct;

/**
 * Created by Алексей on 10.03.16.
 */
public class BinTree {

    Node root;




    public void addNode(int key, String name) {

        Node newNode = new Node( key, name);
        if (root==null){
            root= newNode;

        }else{
            Node focusNode=root;
            Node parent;
            while (true){
                parent=focusNode;
                if (key<focusNode.key){
                    focusNode=focusNode.leftChild;
                    if (focusNode==null){
                        parent.leftChild=newNode;
                        return;
                    }
                } else {
                    focusNode=focusNode.rightChild;
                    if (focusNode==null){
                        parent.rightChild=newNode
                    }
                }
            }
        }
    }

    public void addNode(int [] a) {

    }
class Node {
    int key;
    int val;
    String name

    Node leftChild;
    Node rightChild;

    Node(int key, String name){
        this.key =key;
        this.name=name;
    }
    public String toString(){
        return name + " has a key " + key
    }
}

}
