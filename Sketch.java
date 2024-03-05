import processing.core.PApplet;




public class Sketch extends PApplet {


 public void settings() {
   // put your size call here
   size(500, 300);
   }


   public void setup() {
     background(210, 255, 173);
   }


   public void draw() {
    
     //draw green stem
     strokeWeight(width/20);
     stroke(0, 128, 0);
     line(width/2, height/3, width/2, height);
      //leafs
     ellipse(width/2+width/40+1, (float) (height*.66), width/20, height/30);
     ellipse(width/2-width/40, (float) (height*.75), width/20, height/30);
      //change stroke back to thin black line
     strokeWeight(1);
     stroke(0);
      //draw petals
     fill(255, 100, 0);
     ellipse((float) (width*.25), height/6, width/2, height/3);
     ellipse((float) (width*.75), height/6, width/2, height/3);
     ellipse((float) (width*.25), height/2, width/2, height/3);
     ellipse((float) (width*.75), height/2, width/2, height/3);
      //draw middle part
     fill(255, 128, 0);
     ellipse(width/2, height/3, width/2, height/3);


}
 // define other methods down here.
}
