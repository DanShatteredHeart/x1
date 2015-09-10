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
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 50,50 );    // sun
  // Grass
  fill(200,150,100);
  rect(125,horizon/1.3,30,80);
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );     // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 150,horizon/2, 120,horizon-20/2, 180,horizon-20/2  );
  triangle( 150,horizon/2, 110,horizon-25, 190,horizon-25  );  // tree
 
  text( "This is NOT a good tree; please fix it!", 150,horizon );
                                            // house

  fill(0);
  text( "My name is Jeff", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255,255,0); 
  rect( x,y, 30,50 );        /* REPLACE THIS WITH YOUR OWN CODE! */
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
   
   

