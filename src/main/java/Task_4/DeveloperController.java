package Task_4;
import java.io.IOException;

public class DeveloperController {
    DeveloperDAO developerDAO = new DeveloperDAO();

    public void  getDeveloperDAO() throws IOException {

        developerDAO.createNewDeveloper();
    }

    public void getDeveloperToRemoveFromList() {

        try {
            developerDAO.removeDeveloper();
        }catch (Exception e) {
            System.out.println(e);
        }

    }

    public void readingDevFile() throws Exception {
        developerDAO.readDevelopersFile();
    }

}

