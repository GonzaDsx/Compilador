int i01_1a = 9; //amarillo arriba - IZQUIERDA A
int i01_0b = 8; //verde abajo - IZQUIERDA B
int d10_1a = 7; //verde arriba - DERECHA A
int d10_0b = 6; //amarillo abajo - DERECHA B
int v11_1x = 255; // Velocidad de los motores
boolean b001_1 = false; //bandera para evitar ciclos infinitos en funcion loop()

int p_e_0x1 = 11;            // define el pin 2 como (pecho) para el Ultrasonido
int p_t_0x0 = 12;    //pin trig
volatile int d_1_1x0 = 0; //duracion
volatile int d_0_1x1 = 0; //distancia
int s_1x1_p_1x0 = 2; //sensor proximidad (ultrasonico)
volatile long cx_01_x1 = 0; //reg contador

void setup(){  
  //pinMode(13,OUTPUT); //led que prende cuando hay obstaculos
  pinMode(p_e_0x1, INPUT);   // define el pin 2 como entrada (pecho) 
  pinMode(p_t_0x0,OUTPUT); 
  pinMode(i01_1a,OUTPUT); 
  pinMode(i01_0b,OUTPUT); 
  pinMode(d10_1a,OUTPUT); 
  pinMode(d10_0b,OUTPUT); 
  pinMode(s_1x1_p_1x0, INPUT);  
}

void loop(){
  exit(0); //finaliza el ciclo loop()
}
void avanzar(long t_1x0_0){    
  cx_01_x1 = t_1x0_0*80;
  
  while(cx_01_x1 >= 0){
    digitalWrite(p_t_0x0, HIGH);   // genera el pulso de trigger por 10us
    delayMicroseconds(10);
    digitalWrite(p_t_0x0, LOW);
        
    d_1_1x0 = pulseIn(p_e_0x1, HIGH);          // Lee el tiempo del Echo
    d_0_1x1 = (d_1_1x0/2) / 29;    
    
    analogWrite(d10_0b, 0);     
    analogWrite(i01_0b, 0); 
    analogWrite(d10_1a, v11_1x);  
    analogWrite(i01_1a, v11_1x);    
    while(d_0_1x1 <= 10){
      detener();
      digitalWrite(p_t_0x0, HIGH);   // genera el pulso de trigger por 10us
      delayMicroseconds(10);
      digitalWrite(p_t_0x0, LOW);
      
      d_1_1x0 = pulseIn(p_e_0x1, HIGH);          // Lee el tiempo del Echo
      d_0_1x1 = (d_1_1x0/2) / 29; 
      delay(10);
    }
    cx_01_x1--;
    delay(10);
  }
  cx_01_x1 = 0;
  return;
}

void detener(){
  analogWrite(d10_0b, 0);     
  analogWrite(i01_0b, 0); 
  analogWrite(d10_1a, 0);    
  analogWrite(i01_1a, 0); 
}

void rotarR(){
  cx_01_x1 = 80;
  
  while(cx_01_x1 >= 0){ 
    analogWrite(d10_0b, 0);            // Girar durante 600 milisegundos   
    analogWrite(i01_0b, 0); 
    analogWrite(d10_1a, 0);  
    analogWrite(i01_1a, v11_1x);
    cx_01_x1--;
    delay(10);
  }
  cx_01_x1 = 0;
  return;
}

void rotarL(){
  cx_01_x1 = 100;
  
  while(cx_01_x1 >= 0){ 
    analogWrite(d10_0b, 0);            // Girar durante 600 milisegundos   
    analogWrite(i01_0b, 0); 
    analogWrite(d10_1a, v11_1x);  
    analogWrite(i01_1a, 0);
    cx_01_x1--;
    delay(10);
  }
  cx_01_x1 = 0;
  return;
}

void retroceder(long t_1x0_0){    
  cx_01_x1 = t_1x0_0*80;
  
  while(cx_01_x1 >= 0){ 
    analogWrite(d10_1a, 0);     
    analogWrite(i01_1a, 0); 
    analogWrite(d10_0b, v11_1x);  
    analogWrite(i01_0b, v11_1x);    
    cx_01_x1--;
    delay(10);
  }
  cx_01_x1 = 0;
  return;
}
