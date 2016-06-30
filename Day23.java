static void levelOrder(Node root){
    Queue<Node> queue = new LinkedList();
    queue.add(root);
    
    while(!queue.isEmpty()){
        Node cur = queue.remove();
        System.out.print(cur.data+" ");
        if(cur.left!=null){
            queue.add(cur.left);
        }
        if(cur.right!=null){
            queue.add(cur.right);
        }
    }    
}