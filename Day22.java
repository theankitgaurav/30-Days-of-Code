	public static int getHeight(Node root){
        if(root == null ){
          return -1;
        }
        else{
            if(getHeight(root.left) > getHeight(root.right)){
                return 1 + getHeight(root.left);
            }
            else{
                return 1 + getHeight(root.right);
            }
        }
    }
