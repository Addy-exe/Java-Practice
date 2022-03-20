// Instance Initializer Block : Instance Initializer block is used to initialize the instance data member.
// It run each time when object of the class is created.

// The initialization of the instance variable can be done directly but there can be performed extra
// operations while initializing the instance variable in the instance initializer block

class InstanceInitializerBlock{

    InstanceInitializerBlock(){
        System.out.println("Constructor call..");
    }

    void showAns(float a){
        System.out.println("Answer is : " + a);
    }

    // Instance Initializer Block
    {
        int a = 12;
        float f = 2.3f;
        float ans = a * f;
        showAns(ans);
    }

    public static void main(String args[]){
        InstanceInitializerBlock b1 = new InstanceInitializerBlock();
    }

}