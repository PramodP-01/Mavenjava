package beta;

import org.apache.logging.log4j.*;

public class Test1 {
	public static Logger log = LogManager.getLogger(Test1.class.getName());

	public static void main(String[] args) {

//		if (9 > 6)
			log.debug("this is debuging");
		log.info(" this is info");
		log.error(" this is error");
		log.fatal(" this is fatal");

	}

}
