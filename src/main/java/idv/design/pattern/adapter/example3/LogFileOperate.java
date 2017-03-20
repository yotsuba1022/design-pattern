package idv.design.pattern.adapter.example3;

import java.io.*;
import java.util.List;

/**
 * @author Carl Lu
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "AdapterLog2.log";

    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    public List<LogModel> readLogFile() {
        List<LogModel> logModels = null;
        ObjectInputStream objectInputStream = null;
        try {
            File file = new File(logFilePathName);
            if (file.exists()) {
                objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                logModels = (List<LogModel>) objectInputStream.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return logModels;
    }

    public void writeLogFile(List<LogModel> list) {
        File file = new File(logFilePathName);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            objectOutputStream.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
