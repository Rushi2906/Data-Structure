import java.util.Stack;
class List{
	Node root;

	class Node{
		int data;
		Node left;
		Node right;

		Node(int a){
			data=a;
			left=null;
			right=null;
		}
	}

	public void insert_BST(int a){
		Node nnode = new Node(a);
		if(root==null){
			root=nnode;
		}
		else{
			Node temp=root;
			while(temp.left!=null || temp.right!=null){
				if(nnode.data>=temp.data && temp.right!=null){
					temp=temp.right;
				}
				else if(nnode.data<temp.data && temp.left!=null){
					temp=temp.left;
				}
				else{
					break;
				}
			}
			if(nnode.data>=temp.data){
				temp.right=nnode;
			}
			else{
				temp.left=nnode;
			}
		}
	}

	public void display_inorder(){
		if(root==null){
			System.out.println("Tree is Empty.");
		}
		else{
            System.out.println("Inorder: ");
			Node temp=root;
			Stack <Node> st = new Stack<Node>();

			while(temp!=null || st.size()>0){
				while(temp!=null){
					st.push(temp);
					temp=temp.left;
				}
				temp=st.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
            System.out.println();
		}
	}

    public void display_preorder(){
        if(root==null){
            System.out.println("Tree is Empty.");
        }
        else{
            System.out.println("Preorder: ");
            Stack <Node> st1 = new Stack<Node>();
            st1.push(root);
            while(st1.size()>0){
                Node temp = st1.pop();
                System.out.print(temp.data+" ");
                if(temp.right!=null){
                    st1.push(temp.right);
                }
                if(temp.left!=null){
                    st1.push(temp.left);
                }
            }
            System.out.println();
        }
    }

    public void display_postorder(){
        System.out.println("Postorder: ");
        Stack <Node> st1 = new Stack<Node>();
        Stack <Node> st2 = new Stack<Node>(); 
        st1.push(root);
        while(st1.size()>0){
            Node temp=st1.pop();
            st2.push(temp);
            if(temp.left!=null){
                st1.push(temp.left);
            }
            if(temp.right!=null){
                st1.push(temp.right);
            }
        }
        while(st2.size()>0){
            Node temp2 = st2.pop();
            System.out.print (temp2.data+" ");
        }
    }

    public void delete_leaf_Node(int a){
        Node parent=null;
        Node temp=root;

        while(temp!=null && temp.data!=a){
            parent=temp;
            if(a>temp.data){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }

        if(temp.left==null && temp.right==null){
            if(parent.data>temp.data){
                parent.left=null;
            }
            else{
                parent.right=null;
            }
        }
    }
}

class BST{
	public static void main(String[] args) {
		List obj = new List();
		obj.insert_BST(5);
		obj.insert_BST(8);
		obj.insert_BST(4);
		obj.insert_BST(6);
		obj.insert_BST(7);
		obj.display_inorder();
        System.out.println();
        obj.display_preorder();
        System.out.println();
        obj.display_postorder();
        System.out.println();
        obj.delete_leaf_Node(7);
        System.out.println();
		obj.display_inorder();
	}
}