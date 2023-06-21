import StepObj.SearchSteps;
import Utiles.Chromerunner;

import org.testng.annotations.Test;


import static SearchDataObj.SearchData.*;

    public class Search extends Chromerunner {
        @Test
        public void  correctSearchData() throws InterruptedException {



            SearchSteps step2 = new SearchSteps(driver);
            step2.searchButton(correctSearchData);


            Thread.sleep(6000);


        }
    }
