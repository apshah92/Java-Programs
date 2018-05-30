/*
 * Student Name:Arpan Shah
 * Student ID:31419228
 * Student section: MS Elect & Comp. Engineering
 * */

public class Rational extends Number implements Comparable<Rational>{

	public Rational(int n, int d) {

	    this.numerator = n;
	    this.denominator = d;
	  }
	  
	  private int gcd(int a,int b){
		  int dividend,divisor,remainder;
		  if(a==b){
			  remainder=a;
			  return remainder;
		  }
		  else if(a>b){
			  dividend=a;
			  divisor=b;
		  }
		  else{
			  dividend=b;
			  divisor=a;
		  }
		  
		  while(true){
			  remainder=dividend%divisor;

			  if( remainder == 0){
				  remainder=divisor;
				  break;
			  }
			  dividend=divisor;
			  divisor=remainder;
		  }
		return remainder;	  
	  }

	  public Rational add(Rational o) {
		gcd=gcd((numerator*o.denominator)+(o.numerator*denominator),denominator * (o.denominator));
	    return new Rational(((numerator*o.denominator)+(o.numerator*denominator))/gcd,(denominator * (o.denominator))/gcd);
	  }
	  public Rational div(Rational o) {		
		gcd=gcd(numerator*o.denominator,o.numerator*denominator);  
	    return new Rational((numerator* (o.denominator))/gcd,((o.numerator)*denominator)/gcd);
	  }

	  public Rational mul(Rational o) {
		gcd=gcd(numerator * (o.numerator),denominator* (o.denominator));  
	    return new Rational((numerator *o.numerator)/gcd,(denominator*o.denominator)/gcd);
	  }

	  public Rational sub(Rational o) {
		gcd=gcd((numerator*o.denominator)-(o.numerator*denominator),denominator * (o.denominator));  
		return new Rational(((numerator*o.denominator)-(o.numerator*denominator))/gcd,(denominator * (o.denominator))/gcd);
	  }
	  
	  public int compareTo(Rational R){
		  if(((double)this.numerator/this.denominator)>((double)R.numerator/R.denominator)){
			  return 1;
		  }
		  else if(((double)this.numerator/this.denominator)==((double)R.numerator/R.denominator)){
			  return 0;
		  }
		  else{
			  return -1;
		  }
	  }
	  
	  public boolean equals(Rational R){
		  if(((double)numerator/denominator)==((double)R.numerator/R.denominator)){
			  return true;
		  }
		  
		  else{
			  return false;}
	  } 
	   

	  
	  public double doubleValue() {
		
		return ((double)(this.numerator))/(this.denominator);
	  }


	public float floatValue() {
		return ((float)(this.numerator))/(this.denominator);
	}


	public int intValue() {
		return (this.numerator)/(this.denominator);
	}


	public long longValue() {
		return ((long)(this.numerator))/(this.denominator);
	}

	public String toString() {
		  
		  return "("+numerator+"/"+denominator+")";
	}  



	private int numerator;
	private int denominator;
	private int gcd;

}

