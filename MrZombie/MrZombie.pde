import ddf.minim.*;
Minim minim;
AudioPlayer sound;

void setup(){
size(500,500);
minim = new Minim(this);
sound = minim.loadFile("oh yeah.wav");
}
void draw(){

PImage face = loadImage("Mrbeast.jpeg");

face.resize(500, 500);
image(face, 0, 0);

if(mousePressed){ 
  fill(0,119, 17);
  ellipse(265,265,65,35);

fill(0,119,17);
ellipse(150, 265,65,35);

fill(0,0,17);
ellipse(150, 265, 30, 30);

fill(0,0,17);
ellipse(265,265,30,30);



sound.play();
sound.rewind();

}

}