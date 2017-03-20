package idv.design.pattern.builder.example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String argsp[]) {

        ExportHeaderModel exportHeaderModel = new ExportHeaderModel();
        exportHeaderModel.setDepId("Dep. 1");
        exportHeaderModel.setExportDate("2016/3/8");

        Map<String, Collection<ExportDataModel>> bodyData = new HashMap<String, Collection<ExportDataModel>>();
        Collection<ExportDataModel> collection = new ArrayList<ExportDataModel>();

        ExportDataModel dataModel1 = new ExportDataModel();
        dataModel1.setProductId("1");
        dataModel1.setPrice(100);
        dataModel1.setAmount(10);

        ExportDataModel dataModel2 = new ExportDataModel();
        dataModel2.setProductId("2");
        dataModel2.setPrice(200);
        dataModel2.setAmount(20);

        collection.add(dataModel1);
        collection.add(dataModel2);
        bodyData.put("Sales Record Table", collection);

        ExportFooterModel exportFooterModel = new ExportFooterModel();
        exportFooterModel.setExportUser("Carl Lu");

        TxtBuilder txtBuilder = new TxtBuilder();
        Director director = new Director(txtBuilder);
        director.construct(exportHeaderModel, bodyData, exportFooterModel);
        System.out.println(txtBuilder.getResult());

        XmlBuilder xmlBuilder = new XmlBuilder();
        director = new Director(xmlBuilder);
        director.construct(exportHeaderModel, bodyData, exportFooterModel);
        System.out.println(xmlBuilder.getResult());

    }

}
