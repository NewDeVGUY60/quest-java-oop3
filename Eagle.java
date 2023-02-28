public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    // @Override
    public void takeOff(){
        if(!this.flying && this.altitude ==0){
            this.flying = true;
            System.out.println(this.getName()+" takes off in the sky.");
        }
    }

    //  @Override
    public int ascend(int meters) {
        if(this.flying){
            this.altitude = this.altitude + meters;
            System.out.println(this.getName()+" flies upward, altitude : " + this.getAltitude());
            
        }
        return  this.altitude ;
    }

    // @Override
    public int descend(int meters) {
        if(this.flying){
            this.altitude = Math.max(this.altitude - meters,0);
            System.out.println(this.getName()+" flies downward, altitude : " + this.getAltitude());
            
        }
        return  this.altitude ;
    }
    // @Override
    public void glide(){
        if(this.flying){
            System.out.println("It glides into the air.");
        }
        
    }
    // @Override
    public void land(){
        if(this.flying && this.altitude <= 1){
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't lands.%n", this.getName());
        }
    }


}

// $ Eye Cherry takes off in the sky.
// $ Eye Cherry flies upward, altitude : 120
// $ Eye Cherry flies upward, altitude : 150
// $ It glides into the air.
// $ Eye Cherry flies downward, altitude : 10
// $ Eye Cherry is too high, it can't lands.
// $ Eye Cherry flies downward, altitude : 1
// $ Eye Cherry lands on the ground.