package com.aspect;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class Journalisation {
	@AroundInvoke
	public Object methodInterceptor(InvocationContext ctx) throws Exception {

		try {

			File file = new File("jouralisation.txt");

			// créer le fichier s'il n'existe pas
			if (!file.exists()) {
				file.createNewFile();
			}
			System.out.println("Chemin absolu du fichier : " + file.getAbsolutePath());
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			// out.println(écrire id du client ->variable de session);
			if (ctx.getMethod().getName().equals("retirer")) {
				out.println("***********************************");
				out.println("Date du retrait "+new Date());
				out.println("Action= " + ctx.getMethod().getName());
				out.println("montant à retiré = " + ctx.getParameters()[0]
						+ "  du compte dont le code est = " + ctx.getParameters()[1]);
			} else {
				out.println("***********************************");
				out.println("Date du virement "+new Date());
				out.println("Action= " + ctx.getMethod().getName());
				out.println("montant à versé = " + ctx.getParameters()[0]
						+ " ,envoier vers le compte dont le code est = " + ctx.getParameters()[1]);
			}
				
			bw.close();

			System.out.println("Modification terminée!");

		} catch (IOException e) {
			e.printStackTrace();
		}

		Object result = ctx.proceed();

		return result;
	}
}
