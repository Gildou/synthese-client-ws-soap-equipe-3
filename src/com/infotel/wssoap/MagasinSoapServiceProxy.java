package com.infotel.wssoap;

public class MagasinSoapServiceProxy implements com.infotel.wssoap.MagasinSoapService {
  private String _endpoint = null;
  private com.infotel.wssoap.MagasinSoapService magasinSoapService = null;
  
  public MagasinSoapServiceProxy() {
    _initMagasinSoapServiceProxy();
  }
  
  public MagasinSoapServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMagasinSoapServiceProxy();
  }
  
  private void _initMagasinSoapServiceProxy() {
    try {
      magasinSoapService = (new com.infotel.wssoap.MagasinSoapServiceServiceLocator()).getMagasinSoapServicePort();
      if (magasinSoapService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)magasinSoapService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)magasinSoapService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (magasinSoapService != null)
      ((javax.xml.rpc.Stub)magasinSoapService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.infotel.wssoap.MagasinSoapService getMagasinSoapService() {
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService;
  }
  
  public com.infotel.wssoap.ProduitPerissable[] getAllProduitsPerissables() throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getAllProduitsPerissables();
  }
  
  public com.infotel.wssoap.ProduitNonPerissable getProduitNonPerissable(long idProduit) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getProduitNonPerissable(idProduit);
  }
  
  public long supprimerProduitNonPerissable(long idProduit) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.supprimerProduitNonPerissable(idProduit);
  }
  
  public void ajouterMagasin(long idMagasin, java.lang.String nomMagasin, int codeMagasin, double prixDuLocal) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.ajouterMagasin(idMagasin, nomMagasin, codeMagasin, prixDuLocal);
  }
  
  public com.infotel.wssoap.ProduitPerissable getProduitPerissable(long idProduit) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getProduitPerissable(idProduit);
  }
  
  public void ajouterPNPMagasin(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi, long idMagasin) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.ajouterPNPMagasin(idProduit, nomProduit, stock, prix, modeDemploi, idMagasin);
  }
  
  public void setDao(com.infotel.wssoap.DaoImpl arg0) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.setDao(arg0);
  }
  
  public void ajouterProduitNonPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.ajouterProduitNonPerissable(idProduit, nomProduit, stock, prix, modeDemploi);
  }
  
  public void supprimerMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.supprimerMagasin(idMagasin);
  }
  
  public com.infotel.wssoap.DaoImpl getDao() throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getDao();
  }
  
  public void modifierProduitPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.util.Calendar dateLimiteUtilisation) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.modifierProduitPerissable(idProduit, nomProduit, stock, prix, dateLimiteUtilisation);
  }
  
  public void modifierMagasin(long idMagasin, java.lang.String nomMagasin, int codeMagasin, double prixDuLocal) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.modifierMagasin(idMagasin, nomMagasin, codeMagasin, prixDuLocal);
  }
  
  public com.infotel.wssoap.Produit[] getAllProduits() throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getAllProduits();
  }
  
  public com.infotel.wssoap.ProduitNonPerissable[] getAllProduitsNonPerissables() throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getAllProduitsNonPerissables();
  }
  
  public com.infotel.wssoap.Produit[] getProduitsParMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getProduitsParMagasin(idMagasin);
  }
  
  public com.infotel.wssoap.Magasin[] getAllMagasin() throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getAllMagasin();
  }
  
  public void ajouterPPMagasin(long idProduit, java.lang.String nomProduit, int stock, double prix, java.util.Calendar dateLimiteUtilisation, long idMagasin) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.ajouterPPMagasin(idProduit, nomProduit, stock, prix, dateLimiteUtilisation, idMagasin);
  }
  
  public long supprimerProduitPerissable(long idProduit) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.supprimerProduitPerissable(idProduit);
  }
  
  public void ajouterProduitPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.util.Calendar dateLimiteUtilisation) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.ajouterProduitPerissable(idProduit, nomProduit, stock, prix, dateLimiteUtilisation);
  }
  
  public double calculPrixMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.calculPrixMagasin(idMagasin);
  }
  
  public com.infotel.wssoap.Magasin getMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    return magasinSoapService.getMagasin(idMagasin);
  }
  
  public void modifierProduitNonPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi) throws java.rmi.RemoteException{
    if (magasinSoapService == null)
      _initMagasinSoapServiceProxy();
    magasinSoapService.modifierProduitNonPerissable(idProduit, nomProduit, stock, prix, modeDemploi);
  }
  
  
}