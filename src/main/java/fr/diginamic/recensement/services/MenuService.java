package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.exception.BorneMinException;
import fr.diginamic.recensement.exception.ChiffreAuLieuDeLettreException;
import fr.diginamic.recensement.exception.DepartementException;
import fr.diginamic.recensement.exception.MinMaxException;

/**
 * Classe représentant un service
 * 
 * @author DIGINAMIC
 *
 */
public abstract class MenuService {

	/**
	 * Méthode abstraite de traitement que doivent posséder toutes les méthodes de
	 * services
	 * 
	 * @param lignes  lignes du fichier
	 * @param scanner scanner
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner) throws DepartementException, BorneMinException, ChiffreAuLieuDeLettreException, MinMaxException;
}
