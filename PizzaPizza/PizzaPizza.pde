vimport ddf.minim.*; //at the top of the sketch
Minim minim; //at the top of the sketch 
AudioPlayer sound;



void setup(){
size(1000, 1000);

minim = new Minim(this); //in the setup method
sound = minim.loadFile("Yikes.wav");


}
void draw() { 
  fill( 120, 85, 65);
ellipse(500, 500, 560, 560);

fill(165,60,40);
ellipse(500, 499, 500, 500);

fill(255 , 221, 0);
ellipse(500,489,440,440);

PImage pepperoni = loadImage("pepperoni.ppm.gif");
pepperoni.resize(40, 40);

image(pepperoni, 600, 600);

if(mousePressed){
  image(pepperoni, mouseX, mouseY);

sound.play();
sound.rewind();
}
 
  



}