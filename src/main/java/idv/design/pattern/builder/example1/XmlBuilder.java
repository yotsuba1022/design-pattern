package idv.design.pattern.builder.example1;

import java.util.Collection;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class XmlBuilder implements Builder {

    private StringBuffer stringBuffer = new StringBuffer();

    public void buildHeader(ExportHeaderModel exportHeaderModel) {
        stringBuffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
        stringBuffer.append("<Report>" + System.lineSeparator());
        stringBuffer.append("  <Header>" + System.lineSeparator());
        stringBuffer.append("    <DepId>" + exportHeaderModel.getDepId() + "</DepId>" + System.lineSeparator());
        stringBuffer.append("    <ExportDate>" + exportHeaderModel.getExportDate() + "</ExportDate>" + System.lineSeparator());
        stringBuffer.append("  </Header>" + System.lineSeparator());
    }

    public void buildBody(Map<String, Collection<ExportDataModel>> bodyData) {
        stringBuffer.append("  <Body>" + System.lineSeparator());
        for(String tblName : bodyData.keySet()){
            stringBuffer.append("    <Datas TableName=\"" + tblName + "\">" + System.lineSeparator());
            for(ExportDataModel edm : bodyData.get(tblName)){
                stringBuffer.append("      <Data>" + System.lineSeparator());
                stringBuffer.append("        <ProductId>" + edm.getProductId() + "</ProductId>" + System.lineSeparator());
                stringBuffer.append("        <Price>" + edm.getPrice() + "</Price>" + System.lineSeparator());
                stringBuffer.append("        <Amount>" + edm.getAmount() + "</Amount>" + System.lineSeparator());
                stringBuffer.append("      </Data>" + System.lineSeparator());
            }
            stringBuffer.append("    </Datas>" + System.lineSeparator());
        }
        stringBuffer.append("  </Body>" + System.lineSeparator());
    }

    public void buildFooter(ExportFooterModel exportFooterModel) {
        Footer footer = FooterFactory.createMyFooter();
        stringBuffer.append(footer.genHeader(exportFooterModel));
    }

    public StringBuffer getResult() {
        return stringBuffer;
    }

}
