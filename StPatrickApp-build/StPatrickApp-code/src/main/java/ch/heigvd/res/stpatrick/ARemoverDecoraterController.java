package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by celestius on 20.03.17.
 */
public class ARemoverDecoraterController implements IStreamDecoratorController {

    @Override
    public Reader decorateReader(Reader inputReader) {
        return inputReader;
    }

    @Override
    public Writer decorateWriter(Writer outputWriter) {
        BufferedWriter bw = new BufferedWriter(new StringWriter());
        BufferedReader br = new BufferedReader(new StringReader(outputWriter.toString()));

        RemoverStreamProcessor rsp = new RemoverStreamProcessor('a');
        
        try {
            rsp.process(br,bw);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bw;
    }
}
