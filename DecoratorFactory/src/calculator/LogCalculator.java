package calculator;

public class LogCalculator implements Calculable {

    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }
    @Override
    public Calculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, arg));
        Calculable result = decorated.sum(arg);
        logger.log(String.format("Вызов метода sum произошёл с результатом: %d", decorated.getResult()));
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        Calculable result = decorated.multi(arg);
        logger.log(String.format("Вызов метода multi произошёл с результатом: %d", decorated.getResult()));
        return result;
    }

    @Override
    public int getResult() {
        logger.log("Вызов метода getResult произошёл");
        return decorated.getResult();
    }
}
