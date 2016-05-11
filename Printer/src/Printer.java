public class Printer {

		private double tonerLevel;
		private int numPagePrinted;
		private boolean duplex;

		public Printer(int tonerLevel, int numPagePrinted, boolean duplex) {
			this.tonerLevel = tonerLevel;
			this.numPagePrinted = numPagePrinted;
			this.duplex = duplex;
		}

		public void print(double pageToPrint) {
			this.numPagePrinted += pageToPrint;
			
			double newTonerLevel = tonerLevel - (pageToPrint/10);
		if(this.tonerLevel >= newTonerLevel && newTonerLevel >= 0){
			//for (int i = 100; i <= 1000; i+=100)
			//	if (this.numPagePrinted >= i && this.numPagePrinted <= 100+i) {
				System.out.println("\nHan sido imprimidas en total " + numPagePrinted);
					System.out.println("Toner al " + newTonerLevel + "%");
					setTonerLevel(newTonerLevel);
		//	}else if(this.numPagePrinted < 100){
					//this.tonerLevel = tonerLevel - (this.numPagePrinted/10);
			//		System.out.println("Toner al " + newTonerLevel + "%");
			//		break;
			}else if(this.numPagePrinted == 0 && tonerLevel == 100){
					System.out.println("Toner al " + 100 + "%");
				//	break;
			//	}
		}else{
			System.out.println("\nQuiere imprimir " + pageToPrint + " paginas." + "\nNivel del toner insuficiente para la impresion.");
		}
		}

		public double getTonerLevel() {
			System.out.println("El nivel del toner está al " + tonerLevel + "%");
			return tonerLevel;
		}

		public void setTonerLevel(double tonerLevel) {
			this.tonerLevel = tonerLevel;
		}

		public int getNumPagePrinted() {
			System.out.println("Numero de paginas imprimidas hasta ahora: " + numPagePrinted);
			return numPagePrinted;
		}

		public void setNumPagePrinted(int numPagePrinted) {
			this.numPagePrinted = numPagePrinted;
		}

		public boolean isDuplex() {
			System.out.println("The printer is " + duplex);
			return duplex;
		}

		public void setDuplex(boolean duplex) {
			this.duplex = duplex;
		}
	
}
