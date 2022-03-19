package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long subtract(Long number1, Long number2) {
        logger.info("Subtracting {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiply(Long multiplicand, Long multiplier) {
        logger.info("Multiplying {} * {}", multiplicand, multiplier);
        return multiplicand * multiplier;
    }

    public Long divide(Long dividend, Long divisor) {
        logger.info("Dividing {} / {}", dividend, divisor);
        try {
            return dividend / divisor;
        } catch (Exception e){
            return null;
        }
    }
}
