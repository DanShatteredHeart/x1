//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 50,200,255 );                // sky
  stroke(0);
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 50,50 );    // sun
  // Grass
  stroke(0);
  fill(200,150,100);
  rect(125,horizon/1.5,30,100);
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 140,horizon/2, 100,horizon-20/2, 180,horizon-20/2  );
  triangle( 140,horizon/2, 90,horizon-25, 180,horizon-25  );  // tree
 
  text( "This is NOT a good tree; please fix it!", 150,horizon );
stroke(255,255,0);
noFill();
 ellipse(x,y,120,130);
 stroke(0);
 fill(255,255,255);
rect(110,100,50/2,100);
 //not an iglo
 fill(255,255,255);
 arc(100,250,150,150,PI,TWO_PI); 
fill(0,0,0); 
arc(100,250,20,50,PI,TWO_PI);  
fill(0);
text("CAPSULE CORP.", 50,210);  // house
  fill(0);
  text( "My name is Goku", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  
  y=  y + dy;
 
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  stroke(0,0,255);
  fill(0,0,255); 
   rect( x,y, 30,50 ); 
   fill(255,255,150);
 rect(x,y, 30, 15 );  /* REPLACE THIS WITH YOUR OWN CODE! */
 fill(255,255,20);
 ellipse(x+15,y-10,50,10);
 fill(255,0,0);
  text( "Vegeta", x+3,y+20 );

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   

