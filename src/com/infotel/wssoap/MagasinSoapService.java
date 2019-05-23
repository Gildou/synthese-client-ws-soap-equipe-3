/**
 * MagasinSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public interface MagasinSoapService extends java.rmi.Remote {
    public com.infotel.wssoap.ProduitPerissable[] getAllProduitsPerissables() throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitNonPerissable getProduitNonPerissable(long idProduit) throws java.rmi.RemoteException;
    public long supprimerProduitNonPerissable(long idProduit) throws java.rmi.RemoteException;
    public void ajouterMagasin(long idMagasin, java.lang.String nomMagasin, int codeMagasin, double prixDuLocal) throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitPerissable getProduitPerissable(long idProduit) throws java.rmi.RemoteException;
    public void ajouterPNPMagasin(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi, long idMagasin) throws java.rmi.RemoteException;
    public void setDao(com.infotel.wssoap.DaoImpl arg0) throws java.rmi.RemoteException;
    public void ajouterProduitNonPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi) throws java.rmi.RemoteException;
    public void supprimerMagasin(long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wssoap.DaoImpl getDao() throws java.rmi.RemoteException;
    public void modifierProduitPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.util.Calendar dateLimiteUtilisation) throws java.rmi.RemoteException;
    public void modifierMagasin(long idMagasin, java.lang.String nomMagasin, int codeMagasin, double prixDuLocal) throws java.rmi.RemoteException;
    public com.infotel.wssoap.Produit[] getAllProduits() throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitNonPerissable[] getAllProduitsNonPerissables() throws java.rmi.RemoteException;
    public com.infotel.wssoap.Produit[] getProduitsParMagasin(long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wssoap.Magasin[] getAllMagasin() throws java.rmi.RemoteException;
    public void ajouterPPMagasin(long idProduit, java.lang.String nomProduit, int stock, double prix, java.util.Calendar dateLimiteUtilisation, long idMagasin) throws java.rmi.RemoteException;
    public long supprimerProduitPerissable(long idProduit) throws java.rmi.RemoteException;
    public void ajouterProduitPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.util.Calendar dateLimiteUtilisation) throws java.rmi.RemoteException;
    public double calculPrixMagasin(long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wssoap.Magasin getMagasin(long idMagasin) throws java.rmi.RemoteException;
    public void modifierProduitNonPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi) throws java.rmi.RemoteException;
}
