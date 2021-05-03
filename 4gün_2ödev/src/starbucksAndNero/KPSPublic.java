package starbucksAndNero;

public interface KPSPublic extends javax.xml.rpc.Service {
    public java.lang.String getKPSPublicSoapAddress();

    public MernisService.KPSPublicSoap getKPSPublicSoap() throws javax.xml.rpc.ServiceException;

    public MernisService.KPSPublicSoap getKPSPublicSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
