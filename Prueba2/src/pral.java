import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class pral {
	//System.out.println(" ------------------------------------------");
	//System.out.println(" - - - VISUALIZO POR CONSOLA - - - - ");
	//posdfi posd fi
//epoiwro
	
	// fin class
	public static void leer() throws IOException {
		File fichero = new File("AleatorioEmple.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		char cad[] = new char[10], aux;
		String nom;
		double salario;
		//nota
		int pos, num, dep;
		if (file.length() > 0) {
			pos = 0;
			System.out.println(" ------------------------------------------");
			System.out.println(" - - - VISUALIZO POR CONSOLA - - - - ");
			for (;;) {
				file.seek(pos);
				num = file.readInt();
				for (int i = 0; i < cad.length; i++) {
					aux = file.readChar();
					cad[i] = aux;
				}
				nom = new String(cad);
				dep = file.readInt();
				salario = file.readDouble();
				System.out.println("Empleado: " + nom + ", numero:" + num + ", dep: " + dep + ", salario: " + salario);
				pos = pos + 36;

				if (file.getFilePointer() == file.length())
					break;

			} 
			file.close(); 
			System.out.println(" ------------------------------------------");
		} else 
			System.out.println(" ---------FICHERO VACÍO --------------------");
	}// fin verporconsola
	
}
