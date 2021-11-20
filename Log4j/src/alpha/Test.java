package alpha;

import org.apache.logging.log4j.*;

public class Test {
	public static Logger log = LogManager.getLogger(Test.class.getName());

	public static void main(String[] args) {

		log.debug("this is debuging");
		log.info(" this is info");
		log.error(" this is error");
		log.fatal(" this is fatal");

	}

}
