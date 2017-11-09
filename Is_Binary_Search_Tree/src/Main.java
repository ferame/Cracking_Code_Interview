public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
boolean checkBST(Node root) {
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    return checkSubNode(root, min, max);
}

boolean checkSubNode(Node node, int min, int max){
    if (node.data > min && node.data < max) {
        if(node.left == null && node.right == null){

            return true;

        } else if(node.left == null){

            return checkSubNode(node.right, node.data, max);

        } else if(node.right == null){

            return checkSubNode(node.left, min, node.data);

        } else if(node.data > node.left.data && node.data < node.right.data){

            if (checkSubNode(node.left, min, node.data) && checkSubNode(node.right, node.data, max)){
                return true;
            }
        }
        return false;
    }else{
        return false;
    }
}

