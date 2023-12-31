package animacion;

public class AnimacionMovimiento extends Animacion {

	
	private int x,y,vx,vy;
	private String imagen;
	
	/** 
	 * Constructor de la clase
	 * Crea una animacion con el nombre proporcionado, que se mostrara en un Escenario de tamano ancho x alto. La animacion mostrara la imagen cuyo nombre de fichero se pasa como parametro, empezando en la posicion inicial x,y. En cada paso de la animacion la imagen se movera en la coordenada X e Y la cantidad de pixels especificados por los parametros vx,vy. Esta animacion termina cuando la imagen se sale totalmente del escenario que la muestra.
	 * @param nombre - el nombre de la animacion 
	 * @param ancho - el ancho del escenario donde mostrarla (en pixels) 
	 * @param alto - el alto del escenario donde mostrarla (en pixels)
	 * @param x - coordenada x inicial de la imagen a mostrar
	 * @param y - coordenada y inicial de la imagen a mostrar
	 * @param vx - velocidad en la coordenada x de la imagen a mostrar
	 * @param vy - velocidad en la coordenada y de la imagen a mostrar
	 * @param imagen - el nombre del fichero con la imagen a mostrar
	 */
	
	public AnimacionMovimiento(java.lang.String nombre,int ancho,int alto,java.lang.String imagen,int x,int y,int vx,int vy){
		
		super(nombre,ancho,alto);
		this.x=x;	
		this.y=y;
		this.vx=vx;
		this.vy=vy;	
		this.imagen=imagen;			
	}
	
	/** 
	 * Ejecuta un paso de la animacion y prepara todo para ejecutar el siguiente paso. Se llamara en un bucle hasta que finalice la animacion, de forma que se vaya ejecutando paso a paso.
	 */
	
	public void ejecutarPaso(){
		
		p.dibujarImagen(x,y,new Imagen(imagen));
		x=x+vx;
		y=y+vy;	
	}
	
	/** 
	 * Devuevle si la animacion ha finalizado o no.
	 * @return true si la animacion ha finalizado
	 */
	
	public boolean estaFinalizada(){
		
		return false;
	}
}
