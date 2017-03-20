package idv.design.pattern.builder.example1;

import java.util.Collection;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class TxtBuilder implements Builder {

    private StringBuffer stringBuffer = new StringBuffer();

    public void buildHeader(ExportHeaderModel exportHeaderModel) {
        stringBuffer.append(exportHeaderModel.getDepId() + ", " +exportHeaderModel.getExportDate() + System.lineSeparator());
    }

    public void buildBody(Map<String, Collection<ExportDataModel>> bodyData) {
        for (String tableName : bodyData.keySet()) {
            stringBuffer.append(tableName + System.lineSeparator());
            for (ExportDataModel dataModel : bodyData.get(tableName)) {
                stringBuffer.append(dataModel.getProductId() + ", " + dataModel.getPrice() + ", " + dataModel.getAmount() + System.lineSeparator());
            }
        }
    }

    public void buildFooter(ExportFooterModel exportFooterModel) {
        stringBuffer.append(exportFooterModel.getExportUser());
    }

    public StringBuffer getResult() {
        return stringBuffer;
    }

}
