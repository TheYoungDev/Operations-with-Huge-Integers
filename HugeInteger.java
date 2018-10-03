

package hugeinteger;
import java.util.Random;
import java.math.BigInteger;
/**
 *
 * @author TYD
 */
public class HugeInteger {
public int[] digits;
//private String digitsString;
public int Negative=1;
//Bigger tham 9223372036854775808
    public static void main(String[] args) {
        ///*
  /*       Random rand = new Random();
       HugeInteger A,B,C;
long startTime, endTime,MAXNUMINTS=200,MAXRUN=150000000;
double runTime=0.0;
for (int numInts=0; numInts < MAXNUMINTS; numInts++){
    int n=100;
A = new HugeInteger(n); //creates a random integer of n digits
B = new HugeInteger(n); //creates a random integer of n digits
startTime = System.currentTimeMillis();
for(int numRun=0; numRun < MAXRUN; numRun++)
{ A.compareTo(B); }
endTime = System.currentTimeMillis();
System.out.println(endTime-startTime);
runTime +=(double) (endTime - startTime)/((double) MAXRUN);
}
runTime = runTime/((double)MAXNUMINTS);
 System.out.println(": "+runTime);*/
   //  HugeInteger g=new HugeInteger("250") ;
    // HugeInteger k=new HugeInteger("4") ; 
  // System.out.println("Add: "+g.add(k).toString());
 //  System.out.println("s: "+g.subtract(k).toString());
  // System.out.println("Add: "+g.multiply(k).toString());
  // System.out.println("Add: "+g.compareTo(k));
        
        //System.out.println("");
        ///*
        HugeInteger a=new HugeInteger("10223372036854775808") ;
        HugeInteger b=new HugeInteger("-10223372036854775808") ;

        System.out.println("Add 10223372036854775808+10223372036854775808: ");
        System.out.println(""+a.add(a).toString());
        System.out.println("");
        System.out.println("Add -10223372036854775808+10223372036854775808: ");
        System.out.println(""+b.add(a).toString());
        System.out.println("");
        System.out.println("Add 10223372036854775808-10223372036854775808: ");
        System.out.println(""+a.add(b).toString());
        System.out.println("");
        System.out.println("Add -10223372036854775808-10223372036854775808: ");
        System.out.println(""+b.add(b).toString());
        System.out.println("");
        
                System.out.println("Subtract 10223372036854775808+10223372036854775808: ");
        System.out.println(""+a.subtract(a).toString());
        System.out.println("");
        System.out.println("Subtract -10223372036854775808+10223372036854775808: ");
        System.out.println(""+b.subtract(a).toString());
        System.out.println("");
        System.out.println("Subtract 10223372036854775808-10223372036854775808: ");
        System.out.println(""+a.subtract(b).toString());
        System.out.println("");
        System.out.println("Subtract -10223372036854775808-10223372036854775808: ");
        System.out.println(""+b.subtract(b).toString());
        System.out.println("");
        
                        System.out.println("Multply 10223372036854775808+10223372036854775808: ");
        System.out.println(""+a.multiply(a).toString());
        System.out.println("");
        System.out.println("Multiply -10223372036854775808+10223372036854775808: ");
        System.out.println(""+b.multiply(a).toString());
        System.out.println("");
        System.out.println("Multiply 10223372036854775808-10223372036854775808: ");
        System.out.println(""+a.multiply(b).toString());
        System.out.println("");
        System.out.println("Multiply -10223372036854775808-10223372036854775808: ");
        System.out.println(""+b.multiply(b).toString());
        System.out.println("");
        
              System.out.println("Compare 10223372036854775808 to 10223372036854775808: ");
        System.out.println(""+a.compareTo(a));
        System.out.println("");
        System.out.println("Compare -10223372036854775808 to 10223372036854775808: ");
        System.out.println(""+b.compareTo(a));
        System.out.println("");
        System.out.println("Compare 10223372036854775808 to -10223372036854775808: ");
        System.out.println(""+a.compareTo(b));
        System.out.println("");
        System.out.println("Compare -10223372036854775808 to -10223372036854775808: ");
        System.out.println(""+b.compareTo(b));
        System.out.println("");
        
        a=new HugeInteger("10044337583685378995808") ;
        b=new HugeInteger("10223372036854775808") ;
        HugeInteger c=new HugeInteger("-10044337583685378995808") ;
        HugeInteger d=new HugeInteger("-10223372036854775808") ;
        
        System.out.println("Add 10044337583685378995808+10223372036854775808: ");
        System.out.println(""+a.add(b).toString());
        System.out.println("");
        System.out.println("Add -10044337583685378995808+10223372036854775808: ");
        System.out.println(""+c.add(b).toString());
        System.out.println("");
        System.out.println("Add 10044337583685378995808-10223372036854775808: ");
        System.out.println(""+a.add(d).toString());
        System.out.println("");
        System.out.println("Add -10044337583685378995808-10223372036854775808: ");
        System.out.println(""+c.add(d).toString());
        System.out.println("");
        
                System.out.println("Subtract 10044337583685378995808+10223372036854775808: ");
        System.out.println(""+a.subtract(b).toString());
        System.out.println("");
        System.out.println("Subtract -10044337583685378995808+10223372036854775808: ");
        System.out.println(""+c.subtract(b).toString());
        System.out.println("");
        System.out.println("Subtract 10044337583685378995808-10223372036854775808: ");
        System.out.println(""+a.subtract(d).toString());
        System.out.println("");
        System.out.println("Subtract -10044337583685378995808-10223372036854775808: ");
        System.out.println(""+c.subtract(d).toString());
        System.out.println("");
        
                System.out.println("Multiply 10044337583685378995808+10223372036854775808: ");
        System.out.println(""+a.multiply(b).toString());
        System.out.println("");
        System.out.println("Multiply -10044337583685378995808+10223372036854775808: ");
        System.out.println(""+c.multiply(b).toString());
        System.out.println("");
        System.out.println("Multiply 10044337583685378995808-10223372036854775808: ");
        System.out.println(""+a.multiply(d).toString());
        System.out.println("");
        System.out.println("Multiply -10044337583685378995808-10223372036854775808: ");
        System.out.println(""+c.multiply(d).toString());
        System.out.println("");
        
                        System.out.println("compareTo 10044337583685378995808+10223372036854775808: ");
        System.out.println(""+a.compareTo(b));
        System.out.println("");
        System.out.println("compareTo -10044337583685378995808+10223372036854775808: ");
        System.out.println(""+c.compareTo(b));
        System.out.println("");
        System.out.println("compareTo 10044337583685378995808-10223372036854775808: ");
        System.out.println(""+a.compareTo(d));
        System.out.println("");
        System.out.println("compareTo -10044337583685378995808-10223372036854775808: ");
        System.out.println(""+c.compareTo(d));
        System.out.println("");
        
        
      System.out.println("Error -5-5-577: ");
        try{
        HugeInteger e=new HugeInteger("-1-02") ;

            System.out.println(e.toString());
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        System.out.println("");
        System.out.println("Error Hello World: ");
        try{
        HugeInteger f=new HugeInteger("Hello World") ;

            System.out.println(f.toString());
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
                System.out.println("Error Constructor 2: ");
        try{
        HugeInteger h=new HugeInteger(-5) ;

            System.out.println(h.toString());
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    // d.multiply(c)
    }
    public HugeInteger(String val )throws IllegalArgumentException{
        // negative zeros leading zeros
      
        for(int i=0; i<val.length(); i++){
            if(val.charAt(i) < '0' || val.charAt(i) > '9') //checks if each digit is a number from 0 to 9
                if(i!=0 || val.charAt(i) != '-') //doesn't throw if the digit is a '-' at the first character of string
                    throw new IllegalArgumentException("Input must be a number");
        }

           int x=val.length();
        if(val.charAt(0)=='-'){
            Negative=-1;
            x-=1;
        }
    
        int[] temp = new int[x];
        int k=0;
    for (int i = 0; i < x; i++){
         if(val.charAt(i)=='-'){
         k++;
         }
        String c =""+ val.charAt(k);    
       temp[i]=Integer.parseInt(c);
       k++;

        }
    digits=temp;
    }
    public HugeInteger(int n) throws IllegalArgumentException{


        if(n < 1)
            throw new IllegalArgumentException("Input must be equal to or greater than 1");
        Random rand = new Random();
        digits = new int[n];
        //fills digits with random numbers from 0 to 9
        for(int i=0; i<n; i++){
            digits[i] = rand.nextInt(10); //Random digit < 10
        }
        if(rand.nextInt(2)==1){
        Negative = -1;
        }
        else{
        Negative = 1;
        }
    }
    public HugeInteger add(HugeInteger h){
        int carry=0,x=0,length=0,count=0;
        
        String sum="";
        if(this.digits.length>=h.digits.length){
            length=this.digits.length;
            
        }
        else{
            length=h.digits.length;
        }
        int[] temp= new int[length+1];
        
            //POSITVE
        if(this.Negative== 1 && h.Negative== 1||this.Negative== -1 && h.Negative== -1){
         for (int i = 0; i<length; i++){
           if(i>=this.digits.length){
              x=h.digits[h.digits.length-i-1]+carry;   
           }
           if(i>=h.digits.length){
              x=this.digits[this.digits.length-i-1]+carry;   
           }
           if(i <h.digits.length && i<this.digits.length){
           x=this.digits[this.digits.length-i-1]+h.digits[h.digits.length-i-1]+carry; 
           }
           
                if( x>=10){
                     temp[i]=x-10;
                     carry=1;


                }
                if( x<10&&x>=0){
                    temp[i]=x;
                    carry=0;

                }
               // k++;

        }
         if(carry==1){
             temp[temp.length-1]=1;
         }
         boolean check=false;
         for(int j=temp.length-1;j>=0;j--){
             if(temp[j]!=0||check){
            sum+=""+ temp[j];
            check=true;
            count++;
             }
         }
      }

     int bigger=0;
     //Negatives
     if(this.Negative== -1 && h.Negative== 1||this.Negative== 1 && h.Negative== -1){
         carry=0;
       //this bigger=1
         //find bigger
           for(int j=0;j<length;j++){
               if(this.digits.length>h.digits.length){
                   bigger=1;
                   break;
               }
               if(this.digits.length<h.digits.length){
                   bigger=-1;
                   break;
               }
              //  System.out.println("tt"+this.digits[j]+h.digits[j]);
           if(this.digits[j]==h.digits[j]){
               bigger=0;
           }
           if(this.digits[j]>h.digits[j]){
              // this is bigger
               bigger=1;
               break;
                       
           }
           if(this.digits[j]<h.digits[j]){
               //h is bigger
               bigger=-1;
               break;
           }
         }
         // System.out.println("Bigger= "+bigger);
             //ff  
       if(bigger==0){
           HugeInteger g=new HugeInteger("0"); 
           return g;
       }
        if(bigger==1){
       for (int i = 0; i<length; i++){
            //System.out.println("g:"+h.digits[h.digits.length-1]);
           if(i>=this.digits.length){
              x=-h.digits[h.digits.length-i-1]+carry;   
           }
           if(i>=h.digits.length){
              x=this.digits[this.digits.length-i-1]+carry;
              ///System.out.println("ff"+x+carry);
           }
           if(i <h.digits.length && i<this.digits.length){
           x=this.digits[this.digits.length-i-1]-h.digits[h.digits.length-i-1]+carry; 
           //System.out.println("gf"+x+carry);
           }
           
                if( x<0){
                   // System.out.println("fd"+x+carry);
                     temp[i]=x+10;
                     carry=-1;
                    // System.out.println("qq"+temp[i]+carry);


                }
                if( x<10&&x>=0){
                    temp[i]=x;
                    carry=0;
                     
                }
               // k++;

        }
       }
        
        
                if(bigger==-1){
       for (int i = 0; i<length; i++){
            //System.out.println("g:"+h.digits[h.digits.length-1]);
           if(i>=this.digits.length){
              x=h.digits[h.digits.length-i-1]+carry;   
           }
           if(i>=h.digits.length){
              x=-this.digits[this.digits.length-i-1]+carry;
              ///System.out.println("ff"+x+carry);
           }
           if(i <h.digits.length && i<this.digits.length){
           x=-this.digits[this.digits.length-i-1]+h.digits[h.digits.length-i-1]+carry; 
           //System.out.println("gf"+x+carry);
           }
           
                if( x<0){
                   // System.out.println("fd"+x+carry);
                     temp[i]=x+10;
                     carry=-1;
                    // System.out.println("qq"+temp[i]+carry);


                }
                if( x<10&&x>=0){
                    temp[i]=x;
                    carry=0;
                     
                }
                //k++;

        }
       }
        
         boolean check=false;
         for(int j=temp.length-1;j>=0;j--){
             if(temp[j]!=0||check){
            sum+=""+ temp[j];
            check=true;
            count++;
             }
         }  
         
         
     }
          //System.out.println("f"+temp[0]+temp[1]);
        
     HugeInteger g=new HugeInteger(sum);
     if(this.Negative== -1 && h.Negative== -1){
         g.Negative=-1;
     }
     if(this.Negative== -1 && h.Negative== 1&& bigger==1){
         g.Negative=-1;
     }
     if(bigger==1&&this.Negative==-1){
        g.Negative=-1; 
     }
     if(bigger==-1&&h.Negative==-1){
        g.Negative=-1; 
     }
    return g;
    }
    public HugeInteger subtract(HugeInteger h){
        HugeInteger k;
       
        if(h.Negative==-1){
            h.Negative=1;
          k=this.add(h); 
          h.Negative=-1;
        }
        else{
             h.Negative=-1;
          k= this.add(h); 
          h.Negative=1;
        }
        //System.out.println("qq"+h.Negative);
        return k; 
       
    }
      
    public HugeInteger multiply(HugeInteger h){

        int[] temp= new int[this.digits.length*h.digits.length*2];
        int  carry=0;
        boolean check2=true;
         for(int j=0;j<this.digits.length;j++){
                 if(this.digits[j]!=0){
                   check2=false;
                   break;
                 }

             }
            for(int j=0;j<h.digits.length;j++){
                 if(h.digits[j]!=0){
                   check2=false;
                   break;
                 }

             }
            if(check2==true){
               HugeInteger g=new HugeInteger("0");  
            }
        for(int i=this.digits.length-1;i>=0;i--){
            for(int j=h.digits.length-1;j>=0;j--){
                // System.out.print(this.digits[i]*h.digits[j]);
                
                temp[this.digits.length+h.digits.length-i-j-2] += this.digits[i]*h.digits[j]%10+carry; //ones digit
                if(temp[this.digits.length+h.digits.length-i-j-2]>=10){
                      //System.out.println("carr"+temp[this.digits.length+h.digits.length-i-j-2]);
                 carry=temp[this.digits.length+h.digits.length-i-j-2]/10;
                 temp[this.digits.length+h.digits.length-i-j-2]-=carry*10;
                
                }
                else{
                    carry=0;
                }
               // k++;
                temp[this.digits.length+h.digits.length-i-j-1] += (this.digits[i]*h.digits[j]- this.digits[i]*h.digits[j]%10)/10+carry; //tens digit
               if(temp[this.digits.length+h.digits.length-i-j-1]>=10){
                 carry=temp[this.digits.length+h.digits.length-i-j-1]/10;
                 temp[this.digits.length+h.digits.length-i-j-1]-=carry*10;
                }
                else{
                    carry=0;
                }
            }

        }
        boolean check =false;
        int count=0;
         for(int f=this.digits.length*h.digits.length*2-1;f>=0;f--){
             if(temp[f]!=0||check){
                 count++;
                 check=true;

             }
         }
          int[] temp2= new int[count];
                   for(int f=count-1;f>=0;f--){
             if(temp[f]!=0||check){
                 //count++;
                 check=true;
                temp2[count-1-f]=temp[f];//" |"+k+"|"
               // System.out.print(""+temp2[f]);
          //temp+=digits[i];
             }
         }
                   
                   
           HugeInteger g=new HugeInteger("0");         
          if(h.Negative==-1&& this.Negative==-1){
              g.Negative=1;
          }
          if(h.Negative==1&& this.Negative==1){
              g.Negative=1;
          }
         if(h.Negative==-1&& this.Negative==1||h.Negative==1&& this.Negative==-1){
           g.Negative=-1;   
          }
         
        // System.out.println("neg"+h.Negative+this.Negative);
         g.digits=temp2;
        return g;
    }
   /* public int compareTo(HugeInteger h){
         
    }*/
    public String toString(){
       String temp="";
        if(Negative==-1){
            temp+='-';
        }
         for(int i=0;i<digits.length;i++){
          // System.out.print(""+digits[i]);
          temp+=digits[i];
         }
          
         return temp;
    }
    //find bigger
     public int compareTo(HugeInteger h){
         int bigger=-1,length=0,x=0;
         boolean check =true;
         //zeros is positive
         //if(this.Negative ==-1 &&h.Negative==1||this.Negative ==1 &&h.Negative==-1){
         /*    for(int j=0;j<this.digits.length;j++){
                 if(this.digits[j]!=0){
                   check=false;
                   break;
                 }

             }
            for(int j=0;j<h.digits.length;j++){
                 if(h.digits[j]!=0){
                   check=false;
                   break;
                 }

             }
             
         }
         if(check==true){
             return 0;
         }*/
         if(this.Negative ==-1 &&h.Negative==1){
             return -1;
         }
         if(this.Negative ==1 &&h.Negative==-1){
             return 1;
         }
                  if(this.Negative ==-1 &&h.Negative==1){
             return -1;
         }
                 if(this.digits.length>=h.digits.length){
            length=this.digits.length;
            
        }
        else{
            length=h.digits.length;
        }
           for(int j=0;j<length;j++){
               if(this.digits.length>h.digits.length){
                   bigger=1;
                   break;
               }
               if(this.digits.length<h.digits.length){
                   bigger=-1;
                   break;
               }
              //  System.out.println("tt"+this.digits[j]+h.digits[j]);
           if(this.digits[j]==h.digits[j]){
               bigger=0;
           }
           if(this.digits[j]>h.digits[j]){
              // this is bigger
               bigger=1;
               break;
                       
           }
           if(this.digits[j]<h.digits[j]){
               //h is bigger
               bigger=-1;
               break;
           }
         }
           return bigger;
     }
         // System.out.println("Bigger= "+bigger);
}
