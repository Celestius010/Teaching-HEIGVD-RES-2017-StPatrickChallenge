package ch.heigvd.res.stpatrick;

/**
 * This class is responsible for providing different types of Stream Processors.
 * 
 * @author Olivier Liechti
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {

  @Override
  public IStreamProcessor getProcessor() {
    return new BasicStreamProcessor();
  }

  @Override
  public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {

    if(processorName.equals("e-remover"))
      return new RemoverStreamProcessor(processorName.charAt(0));
    else if(processorName.equals("a-remover"))
      return new RemoverStreamProcessor(processorName.charAt(0));

    throw new UnknownNameException("The factory does not know any processor called " + processorName);
  }

}
