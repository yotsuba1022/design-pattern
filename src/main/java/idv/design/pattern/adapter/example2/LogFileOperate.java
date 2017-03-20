package idv.design.pattern.adapter.example2;

import java.io.*;
import java.util.List;

/**
 * @author Carl Lu
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream objectInputStream = null;

        try {
            File file = new File(logFilePathName);
            if(file.exists()) {
                objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>) objectInputStream.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void writeLogFile(List<LogModel> list) {
        File file = new File(logFilePathName);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
