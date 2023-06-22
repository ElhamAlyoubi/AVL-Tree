
package assignmentelhamalyoubi;

/* @author Elham */
/* Assignment of Algorithms and Complexity*/
import java.util.*;
public class AssignmentElhamAlyoubi {

    public static void main(String[] args) {
         
        Scanner elham= new Scanner(System.in);
     
       
        //******************************************************************
        
        boolean flag;
        Boolean flag2=true;
        String yesno="";
        String choies="";
        String a;
        int input=0;
        int inputs=0;
        
        //******************************************************************
        
        AVL_Tree aa= new AVL_Tree(); 
     
         
        do{
                    System.out.println("   AVLTree Operations \n\n"
                    +         "  1. insert"
                                + "\n  2. Delete"
                    + "\n  3. Search"
                    + "\n  4. Find The minimum node"
                    + "\n  5. Find The maximum node"
                    + "\n  6. Find The Successore"
                    + "\n  7. Find The Predecessor"
                    + "\n  8. Display the AVL Treee"); 
            System.out.println("Enter your choies:"); 
           choies = elham.next(); // this step for take value from the user
              while(flag2){  // This step (loop) ensures the user enters only from 1 to 8
                  if(choies.equals("1")||choies.equals("2")||
                    choies.equals("3")||choies.equals("4")||
                    choies.equals("5")||choies.equals("6")||
                    choies.equals("7")||choies.equals("8")){
                     switch (choies) {
                       case "1":// ------Insert a node------ 
                           
                           System.out.print("Dear user, Enter value to insert in AVL Tree  ");
                           
                           try{
                             int insert=elham.nextInt();
                             
                             if(aa.search(insert)){
                                   System.out.println("The value already exists");  
                             }
                             else{
                                   aa.insert(insert);
                               System.out.println("It has been successfully added {"+insert+"}"); 
                             }
                           }catch(Exception e){
                            System.out.println("Dear user, You must enter input as Number");
                            
                           }
                           break;
                       case "2"://------Delete a node --------
                        
                           int delet;
                           
                           try{
                             if (aa.isEmpty()) 
                                System.out.println(" Your AVL tree is empty");
                             
                           else {
                           System.out.print("What value do you want to delete ");
                            delet = elham.nextInt();
                            if(aa.search(delet)){
                                aa.delete1(delet);
                             System.out.println( delet + " was deleted from the AVL tree.");}
                            else{
                                    
                                System.out.println(" was not found in the AVL tree.");
                            }
                    }
                    System.out.println();
                    break;
                              
                           }catch(Exception e){
                            System.out.println("Dear user, You must enter input as Number");
                            
                           }
                           break;
                       case "3"://---------Search for a node -------
                          
                           String inputS="";
                           
                           boolean help=true;
                          try{ 
                              if(aa.isEmpty()){
                                  System.out.println("Your the AVL tree is empty");
                              }
                              
                              else{
                                   System.out.print("Enter The Value");
                              inputS=elham.next();
                            int searchs=Integer.parseInt(inputS);
                             if(aa.isEmpty())
                                    System.out.println("Your Tree is Empty..");
                             else if(aa.search(searchs))
                                 System.out.println("We found the value in the AVL Tree ("+inputS+")");
                             else
                                  System.out.println("We did not find the value in the AVL tree");
                             }}
                          catch(Exception e){
                           
                             while(help){
                           if(!(inputS.equals("0")||inputS.equals("1")||
                             inputS.equals("2")||inputS.equals("6")||
                              inputS.equals("3")||inputS.equals("7")||
                             inputS.equals("4")||inputS.equals("9")||
                              inputS.equals("5")||inputS.equals("8"))){
                            System.out.println("\"Dear user, You must enter input as Number \"");
                             inputS=elham.next();
                             }
                                 else{
                                int searchs=Integer.parseInt(inputS);
                                    if(aa.isEmpty()){
                                    System.out.println("Your Tree is Empty..");help=false;}
                                   
                                 else if(aa.search(searchs)){
                                 System.out.println("We found the value in the AVL Tree ("+inputS+")");help=false;}
                                 else{
                                  System.out.println("We did not find the value in the AVL tree ");help=false;} 
                                 }
                          }}
                          help=true;
                            break;
                       case "4"://----minimum node------ 
                           if(aa.isEmpty())
                             System.out.println("Your Tree is Empty..");  
                           else{
                               System.out.println(aa.minmum());
                           }
                           
                           break;
                       case "5"://----------The maximum node -----------
                            if(aa.isEmpty())
                             System.out.println("Your Tree is Empty..");  
                           else{
                                System.out.println(aa.maxmum());  
                           }
                           break;
                       case "6"://------Find The Successor ----------
                         
                        try{ 
                            
                            if(aa.isEmpty())
                                System.out.println("Your Tree is Empty..");
                            else{
                                System.out.println("Dear user, Enter value");
                                inputs=elham.nextInt();
                                aa.successor(inputs);
                            }
                           
                        }
                        catch(Exception x){
                            System.out.println("Dear user, You must enter input as Number");  
                            
                            }
                        
                       
                       break;
                       
                       
                       
                       
                       
                       
                       
                       case "7"://---------Find The Predecessor------------
                             
                        try{ 
                            
                            if(aa.isEmpty())
                                System.out.println("Your Tree is Empty..");
                            else{
                                System.out.print("Dear user, Enter value");
                                inputs=elham.nextInt();
                                 aa.predecessor(inputs);
                            }
                                
                          
                        }
                        catch(Exception x){
                            System.out.println("Dear user, You must enter input as Number");  
                        } 
                           break;
                       case "8": // Display AVL Tree
                                 if(aa.isEmpty())
                                    System.out.println("Your Tree is Empty..");
                                 else{
                                     System.out.println("---------------------------------------");
                                      aa.inorder();
                                      System.out.println("");
                                   System.out.println("---------------------------------------");}
                           break;
                       default: 
                  }
                   flag2=false;}
                 
                  else{
                       flag2=true;
                      System.out.println("\"Dear user, You must enter input from 1 to 8 \"");
                                 choies = elham.next(); 
                  }
              }

            
         
            System.out.println("");
            System.out.println("Do you want to continue (type y or n)");
            yesno=elham.next();
             flag=true; 
              flag2=true; 
            while(flag){ 
           if(!(yesno.equals("y")||yesno.equals("Y")||
              yesno.equals("N")||yesno.equals("n")))
           {
               System.out.println("You must input  (type y or n)");
               yesno=elham.next();
               
           }
            if((yesno.equals("y")||yesno.equals("Y")||
              yesno.equals("N")||yesno.equals("n"))){
              flag=false;  
            }}
        }while(yesno.startsWith("y", 0)|| yesno.startsWith("Y", 0));// This code will continue display operation if user inpyt Y or y
        
        
        
        
    }
    
}

// Class Node

class AVL_Node {
    // Data
    private int data;
    private AVL_Node left;
    private AVL_Node right;
    private int hight;
    private AVL_Node parent;
    
    //Constructors
 public AVL_Node(){
     left = right=null;
 }

    public AVL_Node(int data) {
        this.data = data;
    }
 
    public AVL_Node(int data, AVL_Node left, AVL_Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    // Get and Set methods

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public AVL_Node getLeft() {
        return left;
    }

    public void setLeft(AVL_Node left) {
        this.left = left;
    }

    public AVL_Node getRight() {
        return right;
    }

    public void setRight(AVL_Node right) {
        this.right = right;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public AVL_Node getParent() {
        return parent;
    }

    public void setParent(AVL_Node parent) {
        this.parent = parent;
    }   
    
}


// Class AVL Tree
class AVL_Tree {
   AVL_Node root; 


    public AVL_Tree() {
        root= null;
         
    }

    public boolean isEmpty() {
        return root == null;
       
    }


    //Find The minmum node 
public int minmum(){
     return minmum(root);  
}
  private int minmum(AVL_Node p){
        if(p.getLeft()==null){
            System.out.print("Minmum node/value is ");
            return p.getData();// return root
        }
        else{
          System.out.print("Minmum node/value is "); 
           return minmum(p.getLeft()); // find minmum in left subtree
        }
         
}
    //Find The maximum node 
    
    public int maxmum(){
      return maxmum(root);  
    }
    private int maxmum(AVL_Node p){
        while (p.getRight() != null){
         p = p.getRight();
         }
           System.out.print("Maxmum node/value is ");
    return p.getData(); // return root or rightsutree
    }
    
    
    // search 
   
    public boolean search(int data) {
        return (search(root, data));
    }

    private boolean search(AVL_Node p, int data) {
           if (p == null) 
              return (false);
        
     
         if (data == p.getData()) { // data of root = data  of node(p)
            return (true);
        } 
        else if (data < p.getData()) {
            return (search(p.getLeft(), data)); // search in left subtree
        } 
        else {
            return (search(p.getRight(), data));// search right subtree
        }
    }
    
   private int height (AVL_Node p) 
    {
        if (p == null)
        return 0;
        
      return p.getHight();
    }

     private int max (int a, int b) 
    {
        if(a > b) 
            return a;
        else
            return b;
                        
    }
      private int balance(AVL_Node p) 
    {
        if (p == null)
        {return 0;}
        return height(p.getLeft()) - height(p.getRight());
    }
 
      // 4 method for rotation(insert and delete)
   private AVL_Node singleRR(AVL_Node p)
    {
        AVL_Node x1 = p.getLeft();
        AVL_Node x2 = x1.getRight();
        x1.setRight(p);
        p.setLeft(x2);
        p.setHight(max(height(p.getLeft()), height(p.getRight())) + 1);    
        x1.setHight(max(height(x1.getLeft()), height(x1.getRight())) + 1); 
        
        return x1; //updata root
    }
  
    private AVL_Node singleLR (AVL_Node p) 
    {
        AVL_Node x1 = p.getRight();
        AVL_Node x2 = x1.getLeft();
        x1.setLeft(p); //= p;
        p.setRight(x2);
        p.setHight( max(height (p.getLeft()), height (p.getRight())));
        x1.setHight(max(height (x1.getLeft()), height (x1.getRight())) + 1);
        return x1;
    }
       
      private AVL_Node doubleRightLeftRotation(AVL_Node p){
         p.setRight(singleRR(p.getRight()));
          return singleLR(p);
}
       private AVL_Node doubleLeftRightR(AVL_Node p){
        p.setLeft(singleLR(p.getLeft()));
        return singleRR(p);
}
  

    // Insert node
     public void insert(int data) {
        root = insert(root, data);
    }
    private AVL_Node insert(AVL_Node p, int data) {
          if (p == null) 
            p = new AVL_Node(data);//  insert as root
         
        else if(data<p.getData()){ // insert in left subtree
            p.setLeft(insert(p.getLeft(),data));
           if(height(p.getLeft())-height(p.getRight())>1)
              if(data<p.getLeft().getData())
                 p=singleRR(p);// do single right rotation

            else
              p=doubleRightLeftRotation(p); // double R L
}       
         else if(data>p.getData()){ // insert in right subtree
           p.setRight(insert(p.getRight(),data));
            if(height(p.getRight())- height(p.getLeft())<-1)
             if(data>p.getRight().getData())
                 p=singleLR(p);// do single left rotation
           else
             p=doubleLeftRightR(p); // Double L R
}
         
         else ;
            p.setHight(max(height(p.getLeft()),height(p.getRight()))+1);
            return p;
        
    }
    
    
   
 
    // this method for Delete (2 children) because return node 
     private  AVL_Node minforDelet(AVL_Node node)
    {
        AVL_Node help= node;
        while (help.getLeft() != null){
        help = help.getLeft();}
 
        return help;
    }
    
     // Delete node
   public void delete1(int data){
     root=delete1(root,data);
    }
    private AVL_Node delete1(AVL_Node root,int data){
         AVL_Node temp;
     if (data>root.getData())
           root.setRight(delete1(root.getRight(),data));
         
      else if(data<root.getData()){
           root.setLeft(delete1(root.getLeft(),data));
       } 
      else{
          if(root.getLeft()==null || root.getRight()==null){ // one children or no
             temp=null;
             if(temp==root.getLeft())
                 temp=root.getRight();
             else{
                 temp=root.getLeft(); 
             }
              if (temp == null)
                {
                    temp = root;
                    root = null;
                }
              else root= temp;}
              
           
          else
            { // tow ch
                //int x= minmum(root.getRight());
                AVL_Node temp2 = minforDelet(root.getRight());
             root.setData(temp2.getData());
                root.setRight(delete1(root.getRight(), temp2.getData())); 
            } }
       
         if(root==null)
             return root;
                  // rotation
            root.setHight(max(height(root.getLeft()), height(root.getRight())) + 1);
            
 
        if (balance(root) > 1 && balance(root.getLeft()) >= 0)
            return singleRR(root);
        if (balance(root) < -1 && balance(root.getRight()) > 0)
        { return doubleRightLeftRotation(root);}
 
        if (balance(root) > 1 && balance(root.getLeft()) < 0)
        {
            return doubleLeftRightR(root);
        }
        if (balance(root) < -1 && balance(root.getRight()) <= 0)
            return singleLR(root);
 
       
 
   return root;
          }
    
    
    
    
    
    public void inorder() { 
        inorder(root);
    }
    
    private void inorder(AVL_Node p) { // Print Left Subtree ----> Root ----> Right Subtree
        if (p != null) {
            inorder(p.getLeft());
            System.out.print(p.getData() + " ");
            inorder(p.getRight());
        }
        
    }

    
 
   // this method to find predecessor and successor 
   private void inOOrder(AVL_Node root,ArrayList<Integer> list){ 
   if(root==null) // tree empty
        return;
     else{
      inOOrder(root.getLeft(),list);
      list.add(root.getData());// Store in the arraylist
       inOOrder(root.getRight(),list);
}
}

public void predecessor(int data){
    try{
ArrayList<Integer> list=new ArrayList<Integer>();
inOOrder(root,list);
int index=list.indexOf(data);
if(index==0){
System.out.println("The node is the minmum node can not find predecessor "); // no predecessor for this node in index 0
}
else{
System.out.println("The predecessor is "+list.get(index-1)); 
}
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The value not in AVL Tree");
    }
    catch(Exception x){
        System.out.println("The value not in AVL Tree");
    }
    

}

public void successor(int data){
  try{
      ArrayList<Integer> list=new ArrayList<Integer>();
    inOOrder(root,list);
    int index=list.indexOf(data);
    if(index==list.size()-1){
        System.out.println("The node is the maxmum node");// no successor because its the last node in the AVL tree
               }        
    else{ 
        if(data!=list.get(index))
           System.out.println("The value not in AVL Tree");
        else
    System.out.println("The successor is "+list.get(index+1));
}

}
catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The value not in AVL Tree");
    }
catch(Exception x){
            System.out.println("The value not in AVL Tree");
}
}  }